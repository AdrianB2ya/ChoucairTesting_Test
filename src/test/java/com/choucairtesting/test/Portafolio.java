package com.choucairtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Portafolio extends Base{
	By digitalLocator;
	
	public Portafolio(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void portafolioLoad(String a){
		digitalLocator = By.linkText(a) ;
		click(digitalLocator);
	}
}
