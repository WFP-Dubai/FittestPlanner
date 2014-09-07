package org.wfp.fittest.service;

public interface LdapService {
	
	public String validate(String userName, String pwd );

	public boolean isTrackerAdmin( String token, String userName );

	public String getLoggedInUserName(String token, String userName);

}
