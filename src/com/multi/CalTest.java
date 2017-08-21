package com.multi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After");

	}

	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		assertEquals(30, cal.sum(10, 20)); //expected=actual 값이면 결과가 녹색, 틀리면 적색
		
	}
	@Test
	public void testSubtract(){
		Calculator cal = new Calculator(); 
		assertEquals(-10, cal.subtract(10, 20));
	}
	
	@Test(timeout=1)
	public void testSubstract(){
		Calculator cal = new Calculator(); 
		assertEquals(-10, cal.subtract(10, 20));
	}
/*
 * 대표적인 단정문
assertArrayEquals(a,b) : 배열 a와b가 일치함을 확인 
assertEquals(a,b) : 객체 a와b의 값이 같은지 확인 
assertSame(a,b) : 객체 a와b가 같은 객체임을 확인 
assertTrue(a) : a가 참인지 확인 
assertNotNull(a) : a객체가 null이 아님을 확인 
이외에도 다양한 단정문이 존재합니다. 
자세한 내용은 아래 링크를 가시면 확인하실 수 있습니다.http://junit.sourceforge.net/javadoc/org/junit/Assert.html

 */
}

