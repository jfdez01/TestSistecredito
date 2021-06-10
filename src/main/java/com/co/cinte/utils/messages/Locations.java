package com.co.cinte.utils.messages;

public enum Locations {
	USER_DIR("user.dir"),
	CONFIG_PROPERTIES("//files//config.properties"),
	EXCEL_EVENTOS("//files//downloads//VerificaciónRPF.xlsx"),
	FILE_DOWNLOAD("//files//downloads//"),
	JSON_PERSONAS("//files//persona.json"),
	JSON_USERS("//files//json//users.json"),
	JSON_VERUFY_RPF("//files//json//verifyRPF.json"),
	JSON_NEW_CASE_R9394("//files//json//newCaseR9394.json"),
	JSON_NEW_CASE_ACCCNO("//files//json//newCaseACCNO.json");
	
	
	private String msn;
	 
	private Locations(String msn) {
        this.msn = msn;
    }
 
    public String getMsn() {
        return msn;
    }
}
