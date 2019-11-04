package com.choucairtesting.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Portafolio_test {

	private WebDriver driver;
	private String aux;
	Portafolio portafolio;
	
	@Before
	public void setUp() throws Exception {
		portafolio = new Portafolio(driver);
		driver=portafolio.chromeDriverConnection();
		portafolio.visit("https://www.choucairtesting.com/servicio");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	@Test
	public void test1() {
		aux="Capacidades";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test2() {
		aux="Cómo lo hacemos";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test3() {
		aux="Portafolio de Soluciones";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test4() {
		aux="Digital Performance Management";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test5() {
		aux="Pruebas Móviles";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test6() {
		aux="Business Intellingence";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test7() {
		aux="Pruebas de Usabilidad";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test8() {
		aux="Pruebas Contables y Financieras";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test9() {
		aux="Pruebas de Desempeño";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test10() {
		aux="Pruebas de Migración";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test11() {
		aux="Pruebas Generalistas";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test12() {
		aux="Automatización de Pruebas SAP";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test13() {
		aux="Automatización de Pruebas";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test14() {
		aux="Ambientes de Prueba";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test15() {
		aux="Switches Transaccionales";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test16() {
		aux="Pruebas de Nómina";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test17() {
		aux="Pruebas de Seguridad";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test18() {
		aux="Alta automatización";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	@Test
	public void test19() {
		aux="Cursos y Certificaciones";
		portafolio.portafolioLoad(aux);
		assertEquals(aux,driver.switchTo().activeElement().getText());
	}
	
	
}
