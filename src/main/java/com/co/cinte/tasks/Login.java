package com.co.cinte.tasks;

import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.co.cinte.exceptions.ExceptionsGenerals;
import com.co.cinte.userinterfaces.Logeocinte;
import com.co.cinte.interactions.Helpers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

	private static final Logger LOGGER = LoggerFactory.getLogger(Login.class);

	private String user;
	private String password;

	public Login(String user, String password) {
		this.user = user;

		this.password = password;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		try {
			actor.attemptsTo(Click.on(Logeocinte.BTN_CLOSE_POPUP));
			actor.attemptsTo(Click.on(Logeocinte.BTN_SING_IN));
			actor.attemptsTo(Enter.theValue(user).into(Logeocinte.TXT_EMAIL),
			Enter.theValue(password).into(Logeocinte.TXT_PASS),Click.on(Logeocinte.BTN_ADMIT));
			Helpers helper = new Helpers();
		    helper.sleepSeconds(2);
			actor.attemptsTo(Click.on(Logeocinte.BTN_CLOSE_ALERT));
			
			
		
						
					
		} catch (NoSuchElementException e) {

			throw new ExceptionsGenerals(ExceptionsGenerals.MESSAGE_ELEMNT_NOT_FOUND, e);
		} catch (Exception e) {

			LOGGER.error("SEE THE JSON");
		}

	}

	public static Login cinte(String user, String password) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Login.class, user, password);
	}

}
