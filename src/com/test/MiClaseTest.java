package com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ejemplo.MiClase;

public class MiClaseTest {

	MiClase  obj = new MiClase();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test1() {
		
		 assertEquals("Hello world", obj.method1());
	}
	
	@Test
	public void test2() {
		
		 assertEquals(1, obj.method2());
	}

}
