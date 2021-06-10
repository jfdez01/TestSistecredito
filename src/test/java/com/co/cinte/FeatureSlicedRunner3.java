package com.co.cinte;

import org.junit.runner.RunWith;

import com.co.cinte.runners.CucumberSerneityRunner3;

import cucumber.api.CucumberOptions;

@RunWith(CucumberSerneityRunner3.class)
@CucumberOptions(features = "classpath:features", glue = "com.co.cinte.stepdefinitions")
public class FeatureSlicedRunner3 {
}
