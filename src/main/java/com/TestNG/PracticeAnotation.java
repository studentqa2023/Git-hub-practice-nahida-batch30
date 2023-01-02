package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeAnotation {
	
@BeforeSuite	
	public void method1() {
	System.out.println("This is method 1");
	
	}
@BeforeTest
public void method2() {
System.out.println("This is method 2");	
	}
@BeforeClass	
public void method3() {	
System.out.println("This is method3");	
  }	
@BeforeMethod

public void method4() {
System.out.println("This is method4");	
	}
@Test
public void method5() {
System.out.println("This is method5");

}
@AfterMethod
public void method6() {
	System.out.println("This is method 6");
}
@AfterClass
public void method7() {
	System.out.println("This is method 7");
}

@AfterTest
public void method8() {
	System.out.println("This is method 8");
	}

@AfterSuite
public void method9() {
	System.out.println("This is method 9");
	}


}

		





