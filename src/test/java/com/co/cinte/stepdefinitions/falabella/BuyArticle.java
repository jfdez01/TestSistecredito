package com.co.cinte.stepdefinitions.falabella;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.co.cinte.tasks.falabella.BuyArticleTask;
import com.co.cinte.tasks.falabella.ListOfFavoritesTask;
import com.co.cinte.tasks.falabella.VerifyBuyArticleTask;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyArticle {
	
	@When("I buy article on the page")
	public void iBuyArticleOnThePage() {
		theActorInTheSpotlight().wasAbleTo(ListOfFavoritesTask.cinte());
		theActorInTheSpotlight().wasAbleTo(BuyArticleTask.cinte());
	}

	@Then("I validate my buy")
	public void iValidateMyBuy() {
		theActorInTheSpotlight().wasAbleTo(VerifyBuyArticleTask.cinte());
	}

}
