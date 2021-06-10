package com.co.cinte;

import org.junit.runner.RunWith;

import com.co.cinte.runners.CucumberSerneityRunner4;

import cucumber.api.CucumberOptions;

@RunWith(CucumberSerneityRunner4.class)
@CucumberOptions(features = "classpath:features", glue = "com.co.cinte.stepdefinitions")
public class FeatureSlicedRunner4 {
}
