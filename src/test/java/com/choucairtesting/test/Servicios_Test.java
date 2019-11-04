package com.choucairtesting.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Servicios_Test {
	
	private WebDriver driver;
	Servicios servicios;
	@Before
	public void setUp() throws Exception {
		servicios =	new Servicios(driver);
		driver = servicios.chromeDriverConnection();
		servicios.visit("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		servicios.load();
		Thread.sleep(2000);
		assertEquals("Servicios – Choucair Testing",driver.getTitle());
	}

}
