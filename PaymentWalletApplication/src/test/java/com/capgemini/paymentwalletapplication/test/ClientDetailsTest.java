package com.capgemini.paymentwalletapplication.test;

import org.junit.Test;
import com.capgemini.paymentwalletapplication.bean.ClientDetails;
import com.capgemini.paymentwalletapplication.service.ClientService;

import junit.framework.Assert;

public class ClientDetailsTest {
	ClientDetails details;
	ClientService service =new ClientService();
	
	@Test
	public void testGetFullName() {
		details.setFullName("banukumargade");
		
		Assert.assertEquals("banukumar",details.getFullName());
		Assert.assertNotSame("banukumargade", details.getFullName() );
		
	}



	@Test
	public void testGetPassword() {
		details.setPassword("bk123645@");
	
		Assert.assertEquals("Banukumar@",details.getPassword());
		Assert.assertTrue("bk".equalsIgnoreCase(details.getPassword()));
		Assert.assertFalse("bk123645@".equalsIgnoreCase(details.getPassword()));
	}

	

	@Test
	public void testGetGender() {
		details.setGender("male");
		
		Assert.assertNotSame("male",details.getGender());
		Assert.assertEquals("m",details.getGender());
		Assert.assertTrue(" ".equals(details.getGender()));
	}



	@Test
	public void testGetAge() {
		
		details.setAge("22");
		Assert.assertNotNull(getClass());
		Assert.assertEquals("21",details.getAge());
		Assert.assertNotSame("21",details.getAge());
	}

	

	@Test
	public void testGetPhoneNumber() {
		
		details.setPhoneNumber("9502518489");
		Assert.assertEquals("8919759512",details.getPhoneNumber());
		Assert.assertNotSame("9502518489","  ");
		
	}



	@Test
	public void testGetUserName() {
		details.setUserName("");
		Assert.assertEquals("banugade",details.getUserName());
		Assert.assertNotSame("banugade","  ");
	}

	

	@Test
	public void testGetEmail() {
		details.setEmail("xyz@capgemini.com");
		
		Assert.assertEquals("xyz12@capgemini.com",details.getEmail());
		Assert.assertNotSame("xyz@gmail.com","  ");
	}

	

	@Test
	public void testGetAccNo() {
		
		Assert.assertNotNull(details.getAccNo());
		
		Assert.assertEquals(1012235," " );
		Assert.assertNotSame(1234567890,1235689);
	}

	

	@Test
	public void testGetTransactionId() {
		
		Assert.assertNotNull(details.getTransactionId());

		details.setTransactionId(12233442);
		Assert.assertNull(details.getTransactionId());
		Assert.assertEquals(122334421,details.getTransactionId());
		
	}

	

	@Test
	public void testGetDate() {
		Assert.assertNotNull(details.getDate());
		Assert.assertEquals(22/8/2005,details.getDate());
		Assert.assertNotSame(10/7/2018," ");
	}

	

	@Test
	public void testGetAmount() {
		Assert.assertNotNull(details.getAmount());
		details.setAmount(2500);
		Assert.assertEquals(10500,details.getAmount());
		Assert.assertNotSame(22500," ");
	}



}
