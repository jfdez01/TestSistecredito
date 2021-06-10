package com.co.cinte.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/falabella/falabella.feature",
		tags = "@ListOfFavorites",
		glue = "com.co.cinte.stepdefinitions", snippets = SnippetType.CAMELCASE, monochrome = true, dryRun = false)


public final class RunnerFalabella {

	private RunnerFalabella() {
		
		throw new IllegalStateException("Runner class");
	}

}
