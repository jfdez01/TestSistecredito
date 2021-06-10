package com.co.cinte.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Menu {

	
	public static final Target MENUS  = Target.the("Menu").located(By.id("navbarText")); 
	public static final Target SUB_MENU  = Target.the("Submenu").locatedBy("//a[contains(text(),'{0}')]"); 
	public static final Target SUB_MENU_SEG  = Target.the("Submenu").located(By.xpath("//*[@id='navbarText']/ul/li[1]/div/div[3]/ul/a[1]"));
	
	public static final Target NAME_USER_LOGIN= Target.the("Name user login").located(By.cssSelector("#navbarText > span > label"));
	private Menu() {
	    throw new IllegalStateException("Utility class");
	  }
}
