package com.co.cinte.tasks.falabella;

import com.co.cinte.userinterfaces.ListOfFavoritesUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class VerifyListOfFavoritesTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(ListOfFavoritesUI.BTN_ICON));
		actor.attemptsTo(Click.on(ListOfFavoritesUI.BTN_BAG));
		actor.attemptsTo(Click.on(ListOfFavoritesUI.BTN_DELETE));
	}
	
	public static VerifyListOfFavoritesTask cinte() {

		return Tasks.instrumented(VerifyListOfFavoritesTask.class);
	}

}
