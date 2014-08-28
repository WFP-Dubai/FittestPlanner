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
