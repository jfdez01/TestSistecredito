package com.co.cinte.utils.messages;

public enum MessagesLoggers {

	LOGGER_MSN("ClassNotFoundException or SQLException  in class ConexionDBGeneric");
	  
	
	
	private String msn;
	 
	private MessagesLoggers(String msn) {
        this.msn = msn;
    }
 
    public String getMsn() {
        return msn;
    }
}
