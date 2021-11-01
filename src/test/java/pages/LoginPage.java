/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty9.io.ByteBufferPool.Bucket;

/**
 * @author jasdeep.singh
 *
 */
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		
	}
	
	By UserId=By.name("uid");
	By Password=By.name("password");
	By titleText =By.className("barone");
	By login = By.name("btnLogin");
	
	
	public void enterUserId(String userId) {
		driver.findElement(UserId).sendKeys(userId);
		
	}
	public void enterPass(String pass) {
		driver.findElement(Password).sendKeys(pass);
		
	}
	public void loginbtn() {
		driver.findElement(login).click();
		
		
	}
public String getext() {
	return driver.findElement(titleText).getText();
	
}
}
