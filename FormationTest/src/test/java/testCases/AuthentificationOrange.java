package testCases;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class AuthentificationOrange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username;
		username = driver.findElement(By.name("username"));
	    username.sendKeys("Admin");
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement login;
		login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		Thread.sleep(5000);
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text = profil.getText();
		Assert.assertEquals(text, "Vei Chance");
		System.out.println("Test OK");
		
		

	}

}
