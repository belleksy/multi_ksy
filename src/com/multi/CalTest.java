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
		assertEquals(30, cal.sum(10, 20)); //expected=actual ���̸� ����� ���, Ʋ���� ����
		
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
 * ��ǥ���� ������
assertArrayEquals(a,b) : �迭 a��b�� ��ġ���� Ȯ�� 
assertEquals(a,b) : ��ü a��b�� ���� ������ Ȯ�� 
assertSame(a,b) : ��ü a��b�� ���� ��ü���� Ȯ�� 
assertTrue(a) : a�� ������ Ȯ�� 
assertNotNull(a) : a��ü�� null�� �ƴ��� Ȯ�� 
�̿ܿ��� �پ��� �������� �����մϴ�. 
�ڼ��� ������ �Ʒ� ��ũ�� ���ø� Ȯ���Ͻ� �� �ֽ��ϴ�.http://junit.sourceforge.net/javadoc/org/junit/Assert.html

 */
}

