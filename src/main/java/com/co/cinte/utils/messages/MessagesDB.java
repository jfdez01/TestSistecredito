package com.co.cinte.utils.messages;

public enum MessagesDB {
	EXECUTION_QUERY("Query execute is");
	
	private String query;
	 
	private MessagesDB(String query) {
        this.query = query;
    }
 
    public String getDatabase() {
        return query;
    }
}
