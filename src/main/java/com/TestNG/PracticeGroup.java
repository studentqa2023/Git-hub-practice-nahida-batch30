package com.TestNG;

import org.testng.annotations.Test;

public class PracticeGroup {
	
@Test(priority=0,groups={"Smoke"})	
public void login() {
	System.out.println("This is log in method");
	}	
@Test(priority=1, groups= {"Smoke"},dependsOnMethods= {"login"})
public void Book() {
	System.out.println("This is Book method");
	}

@Test(priority=2,groups= {"Regression"},dependsOnMethods= {"login"})
public void Pen() {
	System.out.println("This is Pen method");
	}

@Test(priority=3, groups= {"Smoke"},dependsOnMethods= {"login"})
 public void WorkBook() {
	System.out.println("This is WorkBook method");
	}
@Test(priority=4,groups={"Smoke"},dependsOnMethods= {"login"})
public void Cart() {
	System.out.println("This is Cart method");
	}
@Test(priority=5,groups= {"Smoke"},dependsOnMethods= {"Cart"})
public void Payment() {
	System.out.println("This is Payment method");
	}

}



