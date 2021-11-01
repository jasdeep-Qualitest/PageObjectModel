package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
public HomePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	this.driver=driver;
}
By headingBy=By.xpath("//table//tr[@class='heading3']");

public String getHomePageDashboardUserName(){

    return    driver.findElement(headingBy).getText();

   }
}
