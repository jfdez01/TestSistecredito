package com.co.cinte.stepdefinitions.falabella;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.co.cinte.tasks.falabella.ListOfFavoritesTask;
import com.co.cinte.tasks.falabella.VerifyListOfFavoritesTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListOfFavorites {

	@When("I add a article to the favorites list")
	public void iAddAArticleToTheFavoritesList() {
		theActorInTheSpotlight().wasAbleTo(ListOfFavoritesTask.cinte());
	   
	}

	@Then("I validate the favorites list")
	public void iValidateTheFavoritesList() {
		theActorInTheSpotlight().wasAbleTo(VerifyListOfFavoritesTask.cinte());
	}
	
}
