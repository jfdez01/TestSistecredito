package com.co.cinte.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Logeocinte {
	 
	public static final Target BTN_CLOSE_POPUP = Target.the("Close PopUp")
		    .located(By.id("fake-close"));
	 public static final Target BTN_SING_IN = Target.the("Sing in")
			    .located(By.xpath("//*[@id=\"testId-UserAction-userinfo\"]/div/div[2]/p"));
	 public static final Target TXT_EMAIL = Target.the("Name user")
			    .located(By.id("testId-cc-login-form-email-input"));
	 public static final Target TXT_PASS = Target.the("Password user")
			    .located(By.id("testId-cc-login-form-password-input"));
	 public static final Target BTN_ADMIT = Target.the("Button admit")
			    .located(By.id("testId-cc-login-form-submit"));
	 public static final Target BTN_CLOSE_ALERT = Target.the("Close Alert")
			    .located(By.id("acc-alert-deny"));
	 
	 
	 private Logeocinte() {
		    throw new IllegalStateException("Utility class");
		  }
	 
}
