package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractisetestNGallanotation {
	
@BeforeSuite	
public void	beforeSuite() {
System.out.println("its beforeSuite method");	
	}
@BeforeClass	
public void	beforeClass() {
System.out.println("its beforeClass method");	
}
@BeforeTest
public void	beforeTest() {
System.out.println("its beforeTest method");	
}
@Test
public void testRun() {
System.out.println("its resposible for testcase");	
	}
@BeforeMethod
public void	beforeMethod() {
System.out.println("its beforeMethod");	
}
@AfterMethod
public void afterMethod() {
System.out.println("this is after method");	
	}
@Test
public void testRun1() {
System.out.println("this is testRun method");	
	}
}