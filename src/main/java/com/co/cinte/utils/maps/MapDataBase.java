package com.co.cinte.utils.maps;

import com.co.cinte.models.DataBase;
import com.co.cinte.utils.PropertiesLoader;

public class MapDataBase {

	private static PropertiesLoader prop = new PropertiesLoader();
	DataBase dataBaseModel = new DataBase();

	private static final String USER = "USER";
	private static final String PASS = "PASSWORD";
	private static final String HOST = "HOST";



	public DataBase init() {
		dataBaseModel.setHost(prop.getProperty(HOST));
		dataBaseModel.setUser(prop.getProperty(USER));
		dataBaseModel.setPassword(prop.getProperty(PASS));

		return dataBaseModel;
	}

}
