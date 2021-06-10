package com.co.cinte.interactions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.co.cinte.exceptions.ExceptionsGenerals;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AlertAceptWait implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
	try {
		WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(theActorInTheSpotlight()).getDriver(), 240);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().switchTo().alert();	
		alert.accept();
		Serenity.takeScreenshot();
	} catch (NoAlertPresentException e) {
		 throw new ExceptionsGenerals(e.getMessage(), e);
	}
	

	}

	public static AlertAceptWait cinte() {

		return Tasks.instrumented(AlertAceptWait.class);
	}

}
