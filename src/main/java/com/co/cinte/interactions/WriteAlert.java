package com.co.cinte.interactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class WriteAlert implements Interaction {
	
	private Target target;

	public WriteAlert(Target target) {
	
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement action = target.resolveFor(actor);
		action.sendKeys(Keys.ENTER);
		Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();

		alert.accept();

		alert.accept();
	}

	public static WriteAlert cinte(Target target) {

		return Tasks.instrumented(WriteAlert.class, target);
	}

}
