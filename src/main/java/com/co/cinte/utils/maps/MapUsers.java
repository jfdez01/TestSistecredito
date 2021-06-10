package com.co.cinte.utils.maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.co.cinte.models.Users;
import com.co.cinte.utils.PropertiesJson;
import com.co.cinte.utils.messages.Locations;

public class MapUsers {
	PropertiesJson json = new PropertiesJson();
	Users users = new Users();
	private static final Logger LOGGER = LoggerFactory.getLogger(MapUsers.class);
	private static final String USER_ADMIN = "userAdmin";
	private static final String PASS_ADMIN = "passwordAdmin";
	private static final String USER_ANALYST = "userAnalyst";
	private static final String PASS_ANALYST = "passwordAnalyst";

	public Users init() {
		try {
			users.setUserAdmin(json.getJson(USER_ADMIN, Locations.JSON_USERS.getMsn()));
			users.setPasswordAdmin(json.getJson(PASS_ADMIN, Locations.JSON_USERS.getMsn()));
			users.setUserAnalyst(json.getJson(USER_ANALYST, Locations.JSON_USERS.getMsn()));
			users.setPasswordAnalyst(json.getJson(PASS_ANALYST, Locations.JSON_USERS.getMsn()));
		} catch (Exception e) {
			LOGGER.error("SEE THE JSON");
		}

		return users;
	}
}
