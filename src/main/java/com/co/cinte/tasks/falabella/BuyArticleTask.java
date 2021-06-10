package com.co.cinte.tasks.falabella;

import com.co.cinte.userinterfaces.BuyArticleUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class BuyArticleTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Click.on(BuyArticleUI.BTN_BUY));
		actor.attemptsTo(Scroll.to(BuyArticleUI.BTN_CONTINUE).andAlignToTop());
		actor.attemptsTo(Click.on(BuyArticleUI.BTN_CONTINUE));
	}
	
	public static BuyArticleTask cinte() {

		return Tasks.instrumented(BuyArticleTask.class);
	}

}
