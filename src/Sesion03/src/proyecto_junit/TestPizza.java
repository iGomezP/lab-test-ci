package proyecto_junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPizza {
	
	CommonMethods Common;
	PizzaOrden nuevaOrden;
	String stdOutputPath;
	
	 @BeforeClass
	 public void initialConditions() {
		 Common = new CommonMethods();
		 stdOutputPath = "output_files/output.txt";
	 }
	 
	 @BeforeTest
	 public void preConditions() {
		 nuevaOrden = new PizzaOrden();
	 }
	 
	 @Test
	 // Test de ejemplo 1
	 public void verificarMensajeDeInicioSeDespliega() throws FileNotFoundException {
		 Common.redirectStdOutput(stdOutputPath);
		 nuevaOrden.desplegarMensajeInicio();
		 
		 String actualResult = Common.readFileContents(stdOutputPath);
		 String expectedResult = "Bienvenido a la aplicación para ordenar pizza.\n\n"
					+
					"Sigue las instrucciones por favor.\n\n";
		 
		 Assert.assertEquals(actualResult, expectedResult);
	 }
	
	//@Test
	// Test de ejemplo
	/*public void verificarOpcionVeganaVerdadera() {
		nuevaOrden.setOpcionVeg("Y");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
	}*/
	
	/*
	 * Ejercicio 1: Formula al menos 8 pruebas unitarias
	 * */
	
	@Test
	// Test 1
	public void verificarOpcionVeganaFalso() {
		nuevaOrden.setOpcionVeg("N");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = false;
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	// Test 2
	public void verificaIngredientesVeganos() {
		nuevaOrden.setOpcionVeg("Y");
		
	}
}
