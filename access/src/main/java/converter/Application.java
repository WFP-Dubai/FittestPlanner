package converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;
import com.healthmarketscience.jackcess.complex.SingleValue;
import com.healthmarketscience.jackcess.impl.complex.ComplexValueForeignKeyImpl;

public class Application {

	private static String resourcesFolder = "src/main/resources/";
	private static String accessFile = resourcesFolder
			+ "FITTEST-BackEnd.accdb";
	private static String dataAccessFile = resourcesFolder
			+ "data-access.properties";

	private static Database db = null;
	private static Connection cnx = null;

	public static void initialize() throws ClassNotFoundException, IOException,
			SQLException {
		Class.forName("org.postgresql.Driver");
		db = DatabaseBuilder.open(new File(accessFile));
		Properties prop = new Properties();
		prop.load(new FileInputStream(dataAccessFile));
		cnx = DriverManager.getConnection(prop.getProperty("url"), prop);
	}

	public static void initializeDatabase() throws SQLException {

	}

	public static void populateConfirmedTypes() throws IOException,
			SQLException {
		String[] confirmedTypes = new String[] { "Confirmed", "Not Confirmed",
				"Likely", "Not likely" };
		String[] confirmedColorCodes = new String[] { "33CC33", "C20000",
				"58ACFA", "B45F04" };
		PreparedStatement st = cnx
				.prepareStatement("insert into confirmedtypes (confirmedtype, confirmedcolorcode) values (?, ?)");
		for (int i = 0; i < confirmedTypes.length; i++) {
			st.setString(1, confirmedTypes[i]);
			st.setString(2, confirmedColorCodes[i]);
			st.executeUpdate();
		}

	}

	public static void populateActivityTypes() throws IOException, SQLException {
		Table table = db.getTable("__ActivityTypes");
		PreparedStatement st = cnx
				.prepareStatement("insert into activitytypes (activitytype, activitytypecolorcode) values (?, ?)");
		for (Row row : table) {
			String activityType = (String) row.get("Activity");
			String colorCode = (String) row.get("ColorCode");
			st.setString(1, activityType);
			st.setString(2, colorCode);
			st.executeUpdate();
		}
	}

	public static void populateCountries() throws IOException, SQLException {
		Table table = db.getTable("__Countries");
		PreparedStatement st = cnx
				.prepareStatement("insert into countries (iso, fullname, region) values (?, ?, ?)");
		for (Row row : table) {
			st.setString(1, (String) row.get("ISO"));
			st.setString(2, (String) row.get("Full Name"));
			st.setString(3, (String) row.get("Region"));
			st.executeUpdate();
		}
	}

	public static void populateProfileTypes() throws IOException, SQLException {
		Table table = db.getTable("__ProfileTypes");
		PreparedStatement st = cnx
				.prepareStatement("insert into profiletypes (profiletype) values (?)");
		for (Row row : table) {
			st.setString(1, (String) row.get("Profile"));
			st.executeUpdate();
		}
	}

	public static void populateStaffTypes() throws IOException, SQLException {
		Table table = db.getTable("__StaffTypes");
		PreparedStatement st = cnx
				.prepareStatement("insert into stafftypes (stafftype) values (?)");
		for (Row row : table) {
			st.setString(1, (String) row.get("StaffType"));
			st.executeUpdate();
		}
	}

	@SuppressWarnings("unchecked")
	public static void populateActivities() throws SQLException, IOException {
		Table table = db.getTable("Activities");
		PreparedStatement st = cnx
				.prepareStatement("insert into activities"
						+ " (activityid, activitydescription, activitytypeid, activityetcservicemap, activityconfirmedtypeid)"
						+ " values (?, ?, ?, ?, ?)");
		PreparedStatement at = cnx
				.prepareStatement("select activitytypeid from activitytypes where activitytype like ?");

		PreparedStatement st_map = cnx
				.prepareStatement("insert into activity_country_mapping"
						+ " (activityid, countryid)" + " values (?, ?)");
		PreparedStatement cnt = cnx
				.prepareCall("select countryid from countries where iso like ?");

		for (Row row : table) {
			Integer activityId = (Integer) row.get("ID");
			st.setLong(1, activityId);
			String activity = (String) row.get("Activity");
			st.setString(2, activity);
			String activityType = (String) row.get("Type");
			if (activity.equals("Break in Service/Leave")) {
				at.setString(1, "Break in Service");
			} else {
				at.setString(1, activityType);
			}
			ResultSet rs = at.executeQuery();
			rs.next();
			Long activityTypeId = rs.getLong(1);
			st.setLong(3, activityTypeId);
			st.setString(4, (String) row.get("EtcServiceMap"));
			st.setLong(5, new Long(1));
			st.executeUpdate();

			List<SingleValue> countries = ((ComplexValueForeignKeyImpl) row
					.get("Country")).getMultiValues();
			for (SingleValue country : countries) {
				cnt.setString(1, (String) country.get());
				ResultSet crs = cnt.executeQuery();
				crs.next();
				st_map.setLong(1, activityId);
				st_map.setLong(2, crs.getLong(1));
				st_map.executeUpdate();
			}
		}
	}

	public static void populateEvents() throws SQLException, IOException {
		Table table = db.getTable("Events");
		PreparedStatement st = cnx.prepareStatement("insert into events"
				+ " (event, eventstartdate, eventenddate, eventcolorcode)"
				+ " values (?, ?, ?, ?)");

		for (Row row : table) {
			st.setString(1, (String) row.get("Event"));
			Date startDate = (Date) row.get("StartDate");
			Date endDate = (Date) row.get("EndDate");
			st.setTimestamp(2, startDate == null ? null : new Timestamp(
					(startDate).getTime()));
			st.setTimestamp(3,
					endDate == null ? null : new Timestamp((endDate).getTime()));
			st.setString(4, (String) row.get("ColorCode"));
			st.executeUpdate();
		}
	}

	public static void populateLanguages() throws SQLException, IOException {
		Table table = db.getTable("Languages");
		PreparedStatement st = cnx.prepareStatement("insert into languages"
				+ " (language)" + " values (?)");

		for (Row row : table) {
			st.setString(1, (String) row.get("Language"));
			st.executeUpdate();
		}
	}

	public static void populateActivityRoles() throws SQLException, IOException {
		Table table = db.getTable("Roles");
		PreparedStatement st = cnx
				.prepareStatement("insert into activityroles"
						+ " (activityroleid, activityid, profiletypeid, activityrolestartdate, activityroleenddate, activityrolelocation)"
						+ " values (?, ?, ?, ?, ?, ?)");
		PreparedStatement pt = cnx
				.prepareStatement("select profiletypeid from profiletypes where profiletype like ?");
		for (Row row : table) {
			st.setLong(1, (Integer) row.get("ID"));
			st.setLong(2, (Integer) row.get("ActivityID"));
			String profileType = (String) row.get("Profile");
			pt.setString(1, profileType);
			ResultSet rs = pt.executeQuery();
			rs.next();
			Long profileTypeId = rs.getLong(1);
			st.setLong(3, profileTypeId);
			Date startDate = (Date) row.get("StartDate");
			Date endDate = (Date) row.get("EndDate");
			st.setTimestamp(4, startDate == null ? null : new Timestamp(
					(startDate).getTime()));
			st.setTimestamp(5,
					endDate == null ? null : new Timestamp((endDate).getTime()));
			st.setString(6, (String) row.get("Location"));
			st.executeUpdate();
		}
	}

	public static void populateStaff() throws SQLException, IOException {
		Table table = db.getTable("Staff");
		PreparedStatement st = cnx
				.prepareStatement("insert into staff"
						+ " (staffindex, firstname, lastname, dateofbirth, title, thuraya, mobile, stafftypeid, staffcolorcode)"
						+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		PreparedStatement sn_map = cnx
				.prepareStatement("insert into staff_nationality_mapping values (?, ?)");
		PreparedStatement sl_map = cnx
				.prepareStatement("insert into staff_language_mapping values (?, ?)");
		PreparedStatement sp_map = cnx
				.prepareStatement("insert into staff_profiletype_mapping values (?, ?)");

		PreparedStatement sft = cnx
				.prepareStatement("select stafftypeid from stafftypes where stafftype = ?");
		PreparedStatement cnt = cnx
				.prepareCall("select countryid from countries where iso like ?");
		PreparedStatement lng = cnx
				.prepareCall("select languageid from languages where language like ?");
		PreparedStatement pft = cnx
				.prepareCall("select profiletypeid from profiletypes where profiletype like ?");

		for (Row row : table) {
			Integer staffIndex = (Integer) row.get("Index");
			st.setLong(1, staffIndex);
			st.setString(2, (String) row.get("FirstName"));
			st.setString(3, (String) row.get("LastName"));
			Date dob = (Date) row.get("DOB");
			st.setTimestamp(4, dob == null ? null
					: new Timestamp(dob.getTime()));
			st.setString(5, (String) row.get("Title"));
			st.setString(6, (String) row.get("Thuraya"));
			st.setString(7, (String) row.get("Mobile"));

			Long staffTypeId = null;
			String staffType = (String) row.get("Type");
			if (staffType != null) {
				sft.setString(1, staffType);
				ResultSet rs = sft.executeQuery();
				rs.next();
				staffTypeId = rs.getLong(1);

			}

			st.setLong(8, staffTypeId == null ? new Integer(6) : staffTypeId);
			st.setString(9, (String) row.get("StaffColorCode"));
			st.executeUpdate();

			List<SingleValue> countries = ((ComplexValueForeignKeyImpl) row
					.get("Nationality")).getMultiValues();
			for (SingleValue country : countries) {
				cnt.setString(1, (String) country.get());
				ResultSet crs = cnt.executeQuery();
				crs.next();
				sn_map.setLong(1, staffIndex);
				sn_map.setLong(2, crs.getLong(1));
				sn_map.executeUpdate();
			}

			List<SingleValue> languages = ((ComplexValueForeignKeyImpl) row
					.get("Languages")).getMultiValues();
			for (SingleValue language : languages) {
				lng.setString(1, (String) language.get());
				ResultSet crs = lng.executeQuery();
				crs.next();
				sl_map.setLong(1, staffIndex);
				sl_map.setLong(2, crs.getLong(1));
				sl_map.executeUpdate();
			}

			List<SingleValue> profileTypes = ((ComplexValueForeignKeyImpl) row
					.get("Profile")).getMultiValues();
			for (SingleValue profileType : profileTypes) {
				pft.setString(1, (String) profileType.get());
				ResultSet crs = pft.executeQuery();
				crs.next();
				sp_map.setLong(1, staffIndex);
				sp_map.setLong(2, crs.getLong(1));
				sp_map.executeUpdate();
			}
		}
	}

	public static void populateStaffRoles() throws SQLException, IOException {
		Table table = db.getTable("StaffRoles");
		PreparedStatement st = cnx
				.prepareStatement("insert into staffroles"
						+ " (staffrolestartdate, staffroleenddate, staffrolelocation, staffrolecomments, staffconfirmedtypeid, staffroleactivityroleid, staffrolestaffindex)"
						+ " values (?, ?, ?, ?, ?, ?, ?)");
		for (Row row : table) {
			Date startDate = (Date) row.get("StartDate");
			st.setTimestamp(1, new Timestamp(startDate.getTime()));
			Date endDate = (Date) row.get("EndDate");
			st.setTimestamp(2, new Timestamp(endDate.getTime()));
			st.setString(3, (String) row.get("Location"));
			st.setString(4, (String) row.get("Comments"));
			Boolean confirmedType = (Boolean) row.get("Confirmed");
			st.setLong(5, new Long(confirmedType ? 1 : 2));
			st.setLong(6, (Integer) row.get("Role"));
			st.setLong(7, (Integer) row.get("StaffIndex"));
			st.executeUpdate();
		}
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException, SQLException {
		initialize();
		populateConfirmedTypes();
		populateActivityTypes();
		populateCountries();
		populateProfileTypes();
		populateStaffTypes();
		populateActivities();
		populateEvents();
		populateLanguages();
		populateActivityRoles();
		populateStaff();
		populateStaffRoles();
	}
}
