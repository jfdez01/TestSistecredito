package com.co.cinte.stepdefinitions.common;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.co.cinte.models.Users;

import com.co.cinte.tasks.Login;
import com.co.cinte.tasks.OpenBrowser;
import com.co.cinte.utils.maps.MapUsers;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;

public class CommonSteps {

	MapUsers mapUser = new MapUsers();
	Users dateUser = mapUser.init();
	private static final Logger LOGGER = LoggerFactory.getLogger(CommonSteps.class);
	private static final String ACTOR = "Xm";

	@Managed(uniqueSession = true, clearCookies = ClearCookiesPolicy.BeforeEachTest)
	private WebDriver hisBrowser;

	@Before
	public void setTheStage() {

		OnStage.setTheStage(new OnlineCast());
		theActorCalled(ACTOR);
		theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
		getVersionBrow();

	}
	
	@Given("I want to login in web page falabella")
	public void iWantToLoginWebPageFalabella() {

		theActorInTheSpotlight().wasAbleTo(OpenBrowser.cinte());
		theActorInTheSpotlight().wasAbleTo(Login.cinte(dateUser.getUserAdmin(), dateUser.getPasswordAdmin()));
	}

		public void getVersionBrow() {
		WebDriver driver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();
		Capabilities capabilities = ((HasCapabilities) driver).getCapabilities();
		LOGGER.info("VERSION DEL NAVEGADOR --> " + capabilities.getVersion());

	}

	
}
