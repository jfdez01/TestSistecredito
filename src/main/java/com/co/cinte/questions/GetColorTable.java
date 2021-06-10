package com.co.cinte.questions;
import org.openqa.selenium.support.Color;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.targets.Target;

public class GetColorTable implements Question<String>{

	
	private Target target;
	public GetColorTable(Target target) {
		this.target=target;
	}
	@Override
	public String answeredBy(Actor actor) {
		
		

		return Color.fromString(target.resolveFor(actor).getCssValue("background-color")).asHex();
	}
	
	  public static Question<String> color(Target target) {
		    return new GetColorTable(target);
		  }

}
