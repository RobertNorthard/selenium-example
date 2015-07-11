package com.robertnorthard.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * This is an example Selenium test to browse google.
 *
 */
public class App  {
    public static void main( String[] args ) {

		// This creates a new HtmlUnitDriver from the Web Driver interface. 
		WebDriver driver = new HtmlUnitDriver();

		// This tells our web driver to navigate to google.com
		driver.get("http://www.google.com");

		// This tells our web driver to look for the elemnt with the name ‘q’ on the current webpage (‘google.com’)
		WebElement element = driver.findElement(By.name("q"));

		// This tells the element object to enter the word ‘selenium’ in the Google search bar and submit the form. 
		element.sendKeys("Selenium");
		element.submit();

		// This print to the standard output the title of the webpage defined in the <title></title> HTML tags
		System.out.println("Page title is: " + driver.getTitle());

		// Quits the web driver and closes all associated open browser windows. 
		driver.quit();
    }
}
