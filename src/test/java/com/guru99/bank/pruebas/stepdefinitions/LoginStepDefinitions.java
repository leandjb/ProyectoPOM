package com.guru99.bank.pruebas.stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.demoguru99.bank.pruebas.pages.HomeBankPOM;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinitions {
	
	WebDriver driver;
	HomeBankPOM home;

	@Before
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		home= new HomeBankPOM(driver);            
	}
	
	@Given("Yo como usuario quiero ingresar a la pagina del banco")
	public void yoComoUsuarioQuieroIngresarALaPaginaDelBanco() {
		driver.get("http:demo.guru99.com/V1/index.php");
	}

	@When("Ingreso mi usuario y clave")
	public void ingresoMiUsuarioYClave(io.cucumber.datatable.DataTable dataTable)throws InterruptedException {
		List<String> listaDatos=dataTable.asList();
		home.escribirUsuario(listaDatos.get(0));
		Thread.sleep(3000);
		home.escribirClave(listaDatos.get(1));
		Thread.sleep(3000);
		home.clickEnLogIn();
	}

	@Then("Deberia ver el {string}")
	public void deberiaVerEl(String string) {
	}


	 }