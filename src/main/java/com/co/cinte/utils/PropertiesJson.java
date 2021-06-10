package com.co.cinte.utils;

import static com.co.cinte.utils.messages.Locations.*;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PropertiesJson {
	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesJson.class);

	public static JSONObject read(String file) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		Object object = jsonParser
				.parse(new InputStreamReader(new FileInputStream(System.getProperty(USER_DIR.getMsn()) + file), StandardCharsets.UTF_8));

		return (JSONObject) object;

	}

	
	public String[] array(String prop,String file) throws IOException, ParseException {
		
		String[] value = read(file).get(prop).toString().replace("[", "").replace("]", "").split(",");

		return value;
		
	}

	public String getJson(String prop,String file) {
		
		 
		String value = "";

		try {
			value = (String) read(file).get(prop);
			if (value == null) {
				LOGGER.error("ERROR propiedad NULA {} ", prop);

			}
			
		} catch (IOException | ParseException e) {
		
			LOGGER.error("SEE THE JSON");
		}
	
		return value;
	}
}
