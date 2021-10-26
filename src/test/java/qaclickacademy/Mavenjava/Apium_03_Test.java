package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class Apium_03_Test {
	
//Here we will learn how to control multiple testng.xml files . Create 2nd XML FILE, testng2.xml
//For Example, consider in testng.xml file we need to run "Smoke" test where we will run only 2 tests and through testng2.xml we run "Regression" test where we run all the tests
//Now if we want to run only "Smoke" or "Regression" through Maven, we use profiles(where we create 2 profiles) in pom.xml
//So just below the url, we will create a tag called <profiles> and inside profiles we create 2 child <profile> and inside each <profile> tag we create <id> where we specify "Regression" and "Smoke"
//Now inside the each <id> we copy and paste the entire build tag which includes "Surefire" plugin and Testng <configuration> tag and change the name of the testng xml file respectively
//Now in command prompt, we use the syntax "mvn test -PRegression". Here "P" stands for profile	
	
	@Test
	public void NativeAppAndroid() {
		
		System.out.println("NativeAppAndroid");
	}
	
	@Test
	public void iOSApp() {
		
	 System.out.println("iOSApp");	
	}

}
