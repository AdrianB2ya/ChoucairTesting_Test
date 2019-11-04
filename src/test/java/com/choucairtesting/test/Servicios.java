package com.choucairtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Servicios extends Base {

	By services = By.linkText("Servicios");
	
	
	public Servicios(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void load () {
		click(services);
	}

}
