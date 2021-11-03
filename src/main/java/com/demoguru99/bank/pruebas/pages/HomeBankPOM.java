package com.demoguru99.bank.pruebas.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeBankPOM {

	By txtUsuario = By.name("uid"); 
	By txtClave = By.name("password");
	By bntLogin = By.name("btnLogin");
	
	WebDriver driver;
	
	public HomeBankPOM(WebDriver driver) {
		 
		 this.driver=driver;
	}
	public void escribirUsuario(String usuario) {
		driver.findElement(txtUsuario).sendKeys(usuario);
	}
	public void escribirClave(String clave) {
		driver.findElement(txtClave).sendKeys(clave);
	}
	public void clickEnLogIn() {
		driver.findElement(bntLogin).click();
		
	}
	 
	
}
