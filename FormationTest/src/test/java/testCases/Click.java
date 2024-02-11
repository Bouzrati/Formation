package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://demoqa.com/buttons");
        Thread.sleep(5000);
        WebElement ClickMe;
        ClickMe = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]"));
        //Action Right Click
        Actions action = new Actions(driver);
        action.click(ClickMe).perform();
        //Vérification
        WebElement message;
        message = driver.findElement(By.id("dynamicClickMessage"));
        String text;
        text= message.getText();
        Assert.assertEquals(text, "You have done a dynamic click");
        System.out.println("click done");
     
	}

}

