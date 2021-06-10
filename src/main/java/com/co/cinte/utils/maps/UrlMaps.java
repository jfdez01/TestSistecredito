package com.co.cinte.utils.maps;

import java.util.HashMap;
import java.util.Map;

import com.co.cinte.utils.PropertiesLoader;



public class UrlMaps {
	  private UrlMaps() {
		    throw new IllegalStateException("Utility class");
		  }
	 static PropertiesLoader prop = new PropertiesLoader();
	private static final String URLBASE = "URLBASE";
	private static final String URLEMAIL="URLEMAIL";
	 public static Map<String, String> urlInit() {
		    Map<String, String> response = new HashMap<>();
		    response.put(URLBASE, prop.getProperty(URLBASE));
		    response.put(URLEMAIL, prop.getProperty(URLEMAIL));
		    return response;
		  }

}
