package org.hooks;

import java.time.Duration;

import org.driverfactory.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hook extends DriverFactory
{
	@Before
	public void userShouldNavigateToTheLoginPage(Scenario step) {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}


	@After
	public void afterScenario(Scenario r) 
	{
		String id = r.getId();
		System.out.println("Id = "+id);


		String name = r.getName();
		System.out.println("Name = "+name);


		r.log("Thalapathy Vetri Kondan");


		System.out.println(r.getSourceTagNames());


		Status status = r.getStatus();
		System.out.println("Status = "+ status);


		System.out.println("Uri = "+r.getUri());


		System.out.println("Line = "+r.getLine());


		if (r.isFailed()) 
		{
			byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
			r.attach(screenshotAs, "image/png"," varadhan");
		}

	}

	@BeforeStep
	public void beforeStep()
	{
		System.out.println("starting point-steps");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("ending point-steps");
	}


}
