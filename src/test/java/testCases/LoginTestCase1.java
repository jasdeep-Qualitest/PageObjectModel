package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.logOut;

public class LoginTestCase1 {
	@Test
	public void logintesting() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jasdeep.singh\\eclipse-workspace\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserId("mngr364069");

		loginPage.enterPass("hUhutEv");

		loginPage.loginbtn();

		String abcString = loginPage.getext();
		System.out.println("title   " + abcString);
		Assert.assertTrue(abcString.toLowerCase().contains("guru99 bank"));

		HomePage homePage = new HomePage(driver);
		String homeString = homePage.getHomePageDashboardUserName();
		System.out.println("manager id    " + homeString);
		Assert.assertTrue(homeString.contains("Manger Id : mngr364069"));

		logOut logOutGuru99 = new logOut(driver);
		logOutGuru99.logout123();
		driver.switchTo().alert().accept();

	}

}
