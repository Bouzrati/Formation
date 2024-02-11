package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://demoqa.com/menu");
        Thread.sleep(5000);
        WebElement MainItem2;
        WebElement SubSubList;
        MainItem2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[2]/a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(MainItem2).perform();
      
        SubSubList = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
        action.moveToElement(SubSubList).perform();
        System.out.println("Test OK");
        

	}

}
