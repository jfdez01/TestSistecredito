package com.co.cinte.utils.messages;

public enum Menus {
	MENU_POSTOPERATIVO("POSTOPERATIVO"),
	MENU_PROTECCIONS("PROTECCIONES"),
	MENU_EVENTS("EVENTOS"),
	MENU_ACCIONS_RECOMENDATIONS("ACCIONES Y RECOMENDACIONES"),
	MENU_REPORT_SUPERVISION("INFORME SUPERVISIÓN"),
	MENU_MASTER("MAESTROS"),
	SUBMENU_ANALYSIS("Análisis"),
	SUBMENU_PROCOLOLS("Protocolos"),
	SUBMENU_REGULATION_PRIMARY_FRECUENCIE("Regulación Primaria Frecuencia"),
	SUBMENU_QUERY_EVENTS("Consulta Eventos"),
	SUBMENU_VERIFY_RPF("Verificación RPF"),
	SUBMENU_MASTER_EMAIL("Maestro Correo"),
	SUBMENU_QUERYGENERAL("Consulta General"),
	SUBMENU_ADD_ANALYSIS_CASE("Crear Caso Análisis"),
	SUBMENU_ANALYSIS_NEX_PUBLISH("Análisis Próximos a Publicar")
	
	;
	  
	
	
	private String menu;
	 
	private Menus(String menu) {
        this.menu = menu;
    }
 
    public String getMenus() {
        return menu;
    }
}
