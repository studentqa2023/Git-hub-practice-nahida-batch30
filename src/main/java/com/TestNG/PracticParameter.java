package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticParameter {
@Test	
@Parameters("myName")	
public void getName(String myName) {
	System.out.println(myName);
	
	
}	
	
	

}
