package org.steps;

import static org.testng.Assert.assertEquals;


import org.driverfactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends DriverFactory
{
	
	
	@When("user enter the user name {string}")
	public void userEnterTheUserName(String string) 
	{
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(string);
	}


	@Then("user enter the password {string}")
	public void userEnterThePassword(String string) 
	{
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(string);
	}


	@When("user clicks on login button")
	public void userClicksOnLoginButton() 
	{
		WebElement lgbtn = driver.findElement(By.xpath("//button[text()=' Login ']"));
		lgbtn.click();
	}

	@Then("user should navigate to the dashboard")
	public void userShouldNavigateToTheDashboard() {

		WebElement element = driver.findElement(By.xpath("//h6 [text()='Dashboard']"));
		String actual = element.getText();
		assertEquals(actual, "dashboard");
	}

	@When("user should see invalid credetial")
	public void userShouldSeeInvalidCredetial() 
	{ 	
	}

}
