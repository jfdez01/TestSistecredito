package com.co.cinte.tasks.falabella;

import com.co.cinte.interactions.Helpers;
import com.co.cinte.userinterfaces.ListOfFavoritesUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

public class ListOfFavoritesTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Helpers helper = new Helpers();
		actor.attemptsTo(Scroll.to(ListOfFavoritesUI.TXT_ACCESSORIE).andAlignToTop());
		actor.attemptsTo(Click.on(ListOfFavoritesUI.TXT_ACCESSORIE));
		actor.attemptsTo(Scroll.to(ListOfFavoritesUI.BTN_WATCH).andAlignToTop());
		helper.sleepSeconds(2);
		actor.attemptsTo(MoveMouse.to(ListOfFavoritesUI.BTN_WATCH));
		actor.attemptsTo(Click.on(ListOfFavoritesUI.BTN_ADD_BAG));
		actor.attemptsTo(Click.on(ListOfFavoritesUI.BTN_VIEW_BAG));
		
	    
	}
	
	public static ListOfFavoritesTask cinte() {

		return Tasks.instrumented(ListOfFavoritesTask.class);
	}
}
