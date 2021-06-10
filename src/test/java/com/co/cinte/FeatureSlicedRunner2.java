package com.co.cinte;

import org.junit.runner.RunWith;

import com.co.cinte.runners.CucumberSerneityRunner2;

import cucumber.api.CucumberOptions;

@RunWith(CucumberSerneityRunner2.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.co.cinte.stepdefinitions")
public class FeatureSlicedRunner2 {
}
