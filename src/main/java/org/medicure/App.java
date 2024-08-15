package org.medicure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        //initialize the chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        //open the web application
        driver.get("http://54.164.136.19:8082/");
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);

        WebElement contactBtn = driver.findElement(By.id("contact"));
        contactBtn.click();
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Tek Bista");
        Thread.sleep(2000);

        WebElement phone = driver.findElement(By.id("phone"));
        phone.sendKeys("9848234567");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test@medicure.com");
        Thread.sleep(2000);

        WebElement message = driver.findElement(By.id("message"));
        message.sendKeys("This is a test message");
        Thread.sleep(2000);

        WebElement submitBtn = driver.findElement(By.id("send"));
        submitBtn.click();
        Thread.sleep(2000);

        driver.close();
    }
}
