package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class RestAPI_02_Test {
	
//Here we see how we can run testNg xml file from Maven	
//Create TestNg xml file ..to see how to create see testNg section.. When you create you can run all the test case by rightclicking testNg xml file and run as Suite.But we want to run this xml file through Maven	
//We use TestNg Suite xml files since it allows flexible configuration of the tests to be run(Basically we can control all our tests)
//To run testcases through testNg xml, we need to insert <configuration> tag inside the maven Surefire Plugin
//To get the configuration tag, go to maven surefire plugin on google and enter the first link. On the left side click on "using TestNg" and scroll to the bottom and you can find a SureFire <dependency> tag with <Configartion> tag
//Later we copy and pasted the <configuration> tag inside the surefire plugin in pom.xml
//so basically when you add configartion, it will help run the test through testNg xml instead of just regular MAVEN
//Also you want to just run one of tbe test (Ex: Apium_03_Test)	in the mvn, the syntax for that is "mvn -Dtest=TestCircle test"
//This syntax is also availabe on the website.Basically you have to pass the test case name in place of TestCircle in the above test
//***Now we need to know how to control multiple testng.xml files.. Look into Apium_03_Test please	
	@Test
	public void PostJira() {
		
		System.out.println("PostJira");	
		System.out.println("PostJira2");	
		System.out.println("PostJira3");	
		System.out.println("PostJira4");	
	}
	
	@Test
	public void DeleteTwitter() {
		
		System.out.println("DeleteTwitter");
		
	}

}
