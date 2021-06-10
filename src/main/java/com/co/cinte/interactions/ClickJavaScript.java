package com.co.cinte.interactions;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class ClickJavaScript implements Interaction {

	
	public static final String WaitInteraction = null;
	private Target target;

	public ClickJavaScript(Target target) {
		
		this.target=target;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement element = target.resolveFor(actor);
		
		JavascriptExecutor executor = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();

		executor.executeScript("arguments[0].click();", element);
		
	}
	
	public static ClickJavaScript element(Target target) {
		return Tasks.instrumented(ClickJavaScript.class, target);
	}

}
