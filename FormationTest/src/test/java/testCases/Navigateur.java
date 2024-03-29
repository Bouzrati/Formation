package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {
		// identification (chemin Chromedriver)
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver;
		driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		//ouvrir URL
		driver.navigate().to("https://www.google.com/?hl=fr");
		//déclaration des variables
		WebElement recherche;
		//Identification des variables
		recherche = driver.findElement(By.name("q"));
		//action
		recherche.sendKeys("Tunisia");
		//close chrome
		//driver.close();
		

	}

}
