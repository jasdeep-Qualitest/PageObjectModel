package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logOut {
	
	WebDriver driver;
	public logOut(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
By logoutBy=By.xpath("//*[@href='Logout.php']");
public void logout123() {
	driver.findElement(logoutBy).click();
}
}

