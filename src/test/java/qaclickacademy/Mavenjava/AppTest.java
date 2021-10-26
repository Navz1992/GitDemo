package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;


//To create Maven project,
//1.click on file, move over new, and select project 2. Go to Maven and select Maven Project,click next and again next(use default)
//3. And select maven-archetype-quickstart (for this project) and click next
//4then you have to give groupId(WholeprojectUmbrella) and ArtifactId(our SubProject name,since there will be many SubProjects)
//5.Now when the project name will be created it will be ArtifactId and pavckage name will be groupId.ArtifactId
//When you expand the project there will be 2 folders, src/main/java (here we will write utilities, page object files etc) and src/test/java (here we write test cases) 
//Next we have created 3 class: Selenium_Test,pium_Test, RestAPI_Test since all these use JAVA API and  Maven is used across all these tools and framework development 

public class AppTest {
    
  @Test
  public void shouldAnswerWithTrue() {
    
  }
}
