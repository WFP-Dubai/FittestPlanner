package org.wfp.fittest.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "stafftypes")
public class StaffType implements EntityId {

	@Id
	@Column(name = "stafftypeid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "stafftypes_stafftypeid_seq", name = "stafftypes_stafftypeid_seq")
	@GeneratedValue(generator = "stafftypes_stafftypeid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "stafftype")
	private String staffType;

	@OneToMany(mappedBy = "staffType", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Staff> staff = new HashSet<Staff>();

	public StaffType() {
	}

	public StaffType(Long iD, String staffType, Set<Staff> staff) {
		super();
		this.id = iD;
		this.staffType = staffType;
		this.staff = staff;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
	}

	public String getStaffType() {
		return staffType;
	}

	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

	public Set<Staff> getStaff() {
		return staff;
	}
	
	public List<Long> getStaffIds() {
		return EntityConverter.toIdList(getStaff());
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StaffType other = (StaffType) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
