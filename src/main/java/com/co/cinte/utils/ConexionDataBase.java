package com.co.cinte.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.co.cinte.exceptions.SqlExceptions;

import static com.co.cinte.utils.messages.MessagesLoggers.LOGGER_MSN;



public class ConexionDataBase {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(ConexionDataBase.class);

	 
		public Connection conectar(String host, String user, String password) throws ClassNotFoundException {
			 Connection  con = null;
	
	    try {
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	    	SQLServerDriver driver = new SQLServerDriver();
	      con = DriverManager.getConnection(host, user, password);

	    }
	    catch (SQLException e) {
	      LOGGER.error(LOGGER_MSN.getMsn(), e);
	      throw new SqlExceptions(SqlExceptions.ERROR_CONEXION_QUERY, e);
	    }
	    return con;

	  }
}
