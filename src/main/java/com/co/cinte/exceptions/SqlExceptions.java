package com.co.cinte.exceptions;



@SuppressWarnings("serial")
public class SqlExceptions extends Error {
  public static final String ERROR_EXECUTE_QUERY = "Error when making the query, check that the query is correct";
  public static final String ERROR_CONEXION_QUERY = "Error conexion with  data base";

  public SqlExceptions(String message, Throwable testErrorException) {
    super(message, testErrorException);
  }

}
