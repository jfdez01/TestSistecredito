package com.co.cinte.utils.messages;

public class ConstansQuery {
	public static final String UPDATE_TOTAL_RPF = "update cinte.DetalleUnidad set registroPlantaID= NULL, cumpleRPF = NULL, correoRegistro= NULL, observacion = NULL, correoRPF = NULL from cinte.DetalleUnidad where unidadID in (select unidadID from cinte.Unidad where eventoFrecuenciaID='";
	public static final String UPDATE_CLOSET = "');";

	public static final String DELETE_FILE_RPF = "delete from cinte.AnexoRPF  where detalleUnidadID = 2028;";
	public static final String INSERT_FILE_RPF_1 = "INSERT INTO cinte.Unidad (eventoFrecuenciaID,planta,nombreUnidad,agente,AGC,pruebas,codigoUnidadID)\r\n" + 
			"     VALUES('S000000889','CALIMA1','CALIMA11','EPSG',0,'NP','UNI0028') ;";
	public static final String INSERT_FILE_RPF_2 = "INSERT INTO cinte.DetalleUnidad\r\n" + 
			"           (registroPlantaID,correoRegistro,cumpleRPF,correoRPF,observacion,unidadID)\r\n" + 
			"     VALUES( NULL, NULL,NULL, NULL,NULL,(select MAX(unidadID) from cinte.Unidad));";
	public static final String INSERT_FILE_RPF = "INSERT INTO cinte.AnexoRPF (detalleUnidadID,nombreArchivo,archivo,fechaCarga,usuario) VALUES (2028, 'ArchivoPruebaAutomatizacion.xlsx',\r\n" + 
			"0x0504B030414000600080000002100A,'2020-07-02 10:02:19.493','cinte50100');";
	
	
	public static final String QUERY_MAIL_RPF_1="select  nombreUnidad,correoRegistro,correoRPF from cinte.Unidad inner join \r\n" + 
			"cinte.EventoFrecuencia on cinte.Unidad.eventoFrecuenciaID =cinte.EventoFrecuencia.eventoFrecuenciaID\r\n" + 
			"inner join cinte.DetalleUnidad on\r\n" + 
			" cinte.Unidad.unidadID = cinte.DetalleUnidad.unidadID where cinte.EventoFrecuencia.eventoFrecuenciaID='";
	
	public static final String QUERY_MAIL_RPF_2= "' and cinte.Unidad.nombreUnidad = '";
	public static final String CLOSET_QR= "';";
	
	public static final String MAIL_REGISTER ="correoRegistro";
	public static final String MAIL_RPF ="correoRPF";
	
	public static final String EXCEL_EVETS_1 = "select fecha, planta, nombreUnidad, agente, AGC,pruebas, registroPlantaID, correoRegistro,cumpleRPF,correoRPF,observacion from cinte.Unidad inner join cinte.EventoFrecuencia on cinte.Unidad.eventoFrecuenciaID =cinte.EventoFrecuencia.eventoFrecuenciaID inner join cinte.DetalleUnidad on cinte.Unidad.unidadID = cinte.DetalleUnidad.unidadID where cinte.EventoFrecuencia.eventoFrecuenciaID='";
	
	public static final String EXCEL_EVETS_2 = "'and cinte.Unidad.nombreUnidad=? ;";
	
	public static final String CASE_ANALYISIS ="select * from cinte.CasoAnalisis where  casoAnalisisID= "; 

	public static final String DATE_EVENT = "fechaOcurrencia";
	public static final String DATE_ZERO = "fechaCero";
	

	private ConstansQuery() {
		throw new IllegalStateException("Utility class");
	}

}
