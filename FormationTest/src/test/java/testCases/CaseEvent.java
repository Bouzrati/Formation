package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaseEvent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demoqa.com/text-box");
        WebElement currentadress;
        WebElement permanentadress;
        currentadress = driver.findElement(By.id("currentAddress"));
        permanentadress = driver.findElement(By.id("permanentAddress"));
        Actions action = new Actions(driver);
        currentadress.sendKeys("Tunis, Mnihla");
        action.keyDown(currentadress, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(permanentadress, Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	}

}
