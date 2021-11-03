package com.guru99.bank.pruebas.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/com/demoguru99/bank/pruebas/features/Login.feature",
glue="com.guru99.bank.pruebas.stepdefinitions", snippets=SnippetType.UNDERSCORE)

public class LoginRunner {


}
