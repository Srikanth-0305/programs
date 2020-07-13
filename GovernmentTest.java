package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.revision.Consumer;
import com.revision.EB;
import com.revision.Metro;








public class GovernmentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		
		Consumer indian=new Consumer();
		EB eboffice=new EB();
		Metro metrooffice=new Metro();
		
		indian.makePayment(metrooffice);
		assertEquals("Payment collected for metro...water...","Payment collected for metro...water...");
		//indian.makePayment(eboffice);
		 
	}
	@org.junit.Test
	public void test2() {
		
		Consumer indian=new Consumer();
		EB eboffice=new EB();
		Metro metrooffice=new Metro();
		
		//indian.makePayment(metrooffice);
		indian.makePayment(eboffice);

		assertEquals("Payment collected for eb....","Payment collected for eb....");
				 
	}
	

}
