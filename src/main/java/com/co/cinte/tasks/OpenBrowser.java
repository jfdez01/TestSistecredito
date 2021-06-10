package com.co.cinte.tasks;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import java.util.Map;

import com.co.cinte.utils.maps.UrlMaps;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenBrowser implements Task{

	
	private static final String URLBASE="URLBASE";

	
	@Override
	public <T extends Actor> void performAs(T actor) {

	    Map<String, String> urlsEnviroment = UrlMaps.urlInit();
	    theActorInTheSpotlight().attemptsTo(Open.url(urlsEnviroment.get(URLBASE)));
      
	}

	public static OpenBrowser cinte() {
		
		 return Tasks.instrumented(OpenBrowser.class);
	}

	

}
