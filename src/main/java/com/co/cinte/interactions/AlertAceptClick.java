package com.co.cinte.interactions;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.co.cinte.exceptions.ExceptionsGenerals;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class AlertAceptClick implements Interaction{
	private Target target;

	public AlertAceptClick(Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			WebElement action = target.resolveFor(actor);
			action.click();
			ExpectedConditions.alertIsPresent();
			BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
		}catch (ElementNotVisibleException e) {

			throw new ExceptionsGenerals(ExceptionsGenerals.MESSAGE_ELEMNT_NOT_FOUND, e);
		} catch (ElementNotSelectableException e) {
			throw new ExceptionsGenerals(ExceptionsGenerals.MESSAGE_ELEMENT_NOT_SELECT, e);
		} catch (ElementClickInterceptedException e) {
			throw new ExceptionsGenerals(ExceptionsGenerals.MESSAGE_NOT_CLICK, e);
		}
	
	}

	public static AlertAceptClick cinte(Target target) {
	
		return Tasks.instrumented(AlertAceptClick.class,target);
	}
}
