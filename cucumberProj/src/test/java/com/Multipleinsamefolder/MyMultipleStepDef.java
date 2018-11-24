package com.Multipleinsamefolder;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class MyMultipleStepDef {
	
	
	@Given("open facebook page")
	
	public void openFacebookPage(){
		
			System.setProperty("webdriver.chrome.driver", "C:\\RadicalSoftware\\SeleniumNew\\chromedriver_win32_B39\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("http://www.2shared.com");
			driver.get("http://www.freefileconvert.com/");
		
	}

}
