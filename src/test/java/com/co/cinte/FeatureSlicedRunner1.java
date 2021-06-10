package com.co.cinte;

import org.junit.runner.RunWith;

import com.co.cinte.runners.CucumberSerneityRunner1;

import cucumber.api.CucumberOptions;

@RunWith(CucumberSerneityRunner1.class)
@CucumberOptions(features = "classpath:features", glue = "com.co.gao.stepdefinitions")
public class FeatureSlicedRunner1 {
}
