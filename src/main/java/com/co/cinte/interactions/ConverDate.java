package com.co.cinte.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConverDate implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
	}
	
	public static ConverDate cinte() {
		return Tasks.instrumented(ConverDate.class);
	}
	

}
