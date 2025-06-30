package com.stepdefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpAndTearDown 
{
	static WebDriver driver;
	@Before
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://ecommerce.artoftesting.com/");
		
		driver.manage().window().maximize();
	}
	
	@After
	public void Teardown()
	{
		driver.close();
	}
	

}
