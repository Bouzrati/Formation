package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAuth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com/");
        WebElement creercompte;
        creercompte = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
        creercompte.click();
        WebElement prenom;
        WebElement nom;
        WebElement email;
        WebElement confirmemail;
        WebElement pswd;
        prenom = driver.findElement(By.name("firstname"));
        prenom.sendKeys("Lamine");
        nom = driver.findElement(By.name("lastname"));
        nom.sendKeys("Lamal");
        email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("Lamal@gmail.com");
        confirmemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        confirmemail.sendKeys("Lamal@gmail.com");
        pswd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        pswd.sendKeys("Lamal1234/");
        WebElement jour;
        WebElement mois;
        WebElement année;
        jour = driver.findElement(By.id("day"));
        Select select = new Select(jour);
        select.selectByValue("8");
        mois = driver.findElement(By.id("month"));
        Select select2 = new Select(mois);
        select2.selectByValue("5");
        année = driver.findElement(By.id("year"));
        Select select3 = new Select(année);
        select3.selectByValue("1994");
        WebElement genre;
        genre = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
        genre.click();
        
        
        
       
        
        
        

	}

}
