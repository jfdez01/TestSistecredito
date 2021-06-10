package com.co.cinte.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Events {
	private Events() {
		throw new IllegalStateException("Utility class");
	}
	public static final Target BTN_ADD_ASOCIATE = Target.the("Btn Asociate").located(By.id("btnasociarHaloper"));
	public static final Target BTN_CANCEL = Target.the("Btn Asociate").located(By.name("operation"));
	public static final Target ORDEN_COLUMN_CLICK = Target.the("Field to click in table").locatedBy("//*[@id=\"dtEventos\"]/tbody/tr/td[{0}]/a");
	public static final Target  SEARCH =  Target.the("Field to click in table").located(By.xpath("//div[@id='dtActivosFechasMID_filter']//input[@class='form-control form-control-sm']"));
	public static final Target CHECK_TABLE = Target.the("Field to click in table").located(By.xpath("//*[@id='dtActivosFechasMID']/tbody/tr/td[1]/input[1]"));
	
	
}
