package org.wfp.fittest.service.impl;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import lu.hitec.pss.soap.ds.out._15_x.CrudEnum;
import lu.hitec.pss.soap.ds.out._15_x.DirectoryServiceOutInterface_ServiceLocator;
import lu.hitec.pss.soap.ds.out._15_x.PssuUser;

import org.springframework.stereotype.Service;
import org.wfp.fittest.service.LdapService;

@Service
public class LdapServiceImpl implements LdapService {

	@Override
	public String validate(String userName, String pwd) {
		String token = null;
		try {
			token = new DirectoryServiceOutInterface_ServiceLocator()
					.getDirectoryServiceOutInterfacePort().authenticate(
							userName, pwd, null);
		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
		}
		return token;
	}
	
	/**
	 * Returns the firstName + lastName of the logged in user
	 * 
	 * @param token The token returned by LdapService.validate()
	 * @param userName The user name used to login to the system
	 * @return firstName + lastName of the logged in user
	 */
	@Override
	public String getLoggedInUserName(String token, String userName) {
		PssuUser user;
		try {
			user = new DirectoryServiceOutInterface_ServiceLocator()
			.getDirectoryServiceOutInterfacePort().getUser(token, userName);
			return user.getFirstname() + " " + user.getLastname();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Checks if a logged in user has administrator privileges.
	 *
	 * @param token The token returned by LdapService.validate()
	 * @param userName The user name used to login to the system
	 * @return <code>true</code> if the user's LDAP profile is <b>FITTEST_TRACKER_ADMIN</b>, otherwise <code>false</code>.
	 */
	@Override
	public boolean isTrackerAdmin(String token, String userName) {
		try {
			String[] profileIds = new DirectoryServiceOutInterface_ServiceLocator()
					.getDirectoryServiceOutInterfacePort()
					.getProfileIdsAssignedToUserForCrud(token, userName,
							CrudEnum.fromValue(CrudEnum._READ));
		

			if (profileIds != null && profileIds.length > 0) {
				for (String profile : profileIds) {
					if (profile.equalsIgnoreCase("FITTEST_TRACKER_ADMIN"))
						return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
