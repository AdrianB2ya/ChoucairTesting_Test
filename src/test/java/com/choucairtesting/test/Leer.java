package com.choucairtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leer extends Base {
	
	By readBtnLocator = new By.ByClassName("elementor-button-text");
	By msgLocator = new By.ByXPath("//h1");
	public Leer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void loadRead() {
		click(readBtnLocator);
	}
	
	public String message() {
		return getText(msgLocator);
	}
}
