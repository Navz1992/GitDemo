package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class Selenium01_Test {

//We have a plugin called "Maven SureFire Plugin" which is used to execute all test cases in our Maven Project at once 
//This above plugin will not be there in pom.xml. We need to go to there official website and copy and paste it in pom.xml	
//Google Maven SureFire Plugin and click on first link and click on "usage" tab on left-side. Copy from <build> tag and paste it in pom.xml
//Check pom.xml file once.. In mine the above plugin was already there	

//----Clean-1>Also before running a test, its recommended to go to command prompt and enter "mvn clean"	which clear all the caches
//2>To clean, basically we have to clean pom.xml. Since pom file is in the project level we have to give project name
//3>To find the path of the project, right click on project and click on properties	and on the resource tab, there will be path and copy and paste it on cmd
//4> to copy the path exactly, first type cd space and paste the location and click enter. After that mvn clean and press enter
//5> Cleaning is optional
//----Compile >>"mvn compile" is used to compile the test case of entire project. It will look for any syntax errors and lets us know 
//----Test >>1. "mvn test" is the command which triggers all the executions. This is the most important command
// 2. Actually you dont need the clean and compile commands, since "mvn test" does both before executing the test
// 3. how it works is first check the pom.xml and see checks whether all the dependency in it is already in its repository. Since any of the dependencies is not present it will then go maven repository to get. This will happen only once before execution.
// 4. Since it chceks all the dependencies in the beginning, it will not take much time to run tests	
//My project path C:\Users\navee\eclipse-workspace\Mavenjava> since pom.xml is at project level
//Imp** If maven has to recognise the test cases, all the test cases must end with keyword "Test"	
// **Now we want to run testNg xml file from Maven --- look at RestAPI_02_Test class	
	@Test
	public void BrowserInvoke() {
		
		System.out.println("BrowserInvoke");
	}
	
	@Test
	public void ElementsUI() {
		System.out.println("ElementsUI");
		System.out.println("ElementsUI");
		System.out.println("ElementsUI");
		System.out.println("ElementsUI");
		
	}

}
