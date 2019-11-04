package com.choucairtesting.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Leer_test {

	private WebDriver driver;
	Leer leer;
	
	@Before
	public void setUp() throws Exception {
			leer = new Leer(driver);
			driver = leer.chromeDriverConnection();
			leer.visit("https://www.choucairtesting.com/servicio/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		leer.loadRead();
		assertEquals("No disponible", leer.message());
	}

}
