package com.co.cinte.tasks.falabella;

import com.co.cinte.interactions.Helpers;
import com.co.cinte.userinterfaces.BuyArticleUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VerifyBuyArticleTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Helpers helper = new Helpers();
		helper.sleepSeconds(3);
		actor.attemptsTo(Ensure.that(BuyArticleUI.BTN_TYPE_DELIVERY).text().isEqualTo("Tipo de entrega"));
		
	}
	
	public static VerifyBuyArticleTask cinte() {

		return Tasks.instrumented(VerifyBuyArticleTask.class);
	}

}
