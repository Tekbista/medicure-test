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
        driver.get("http://54.196.141.116:8082/");
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);

        WebElement contactBtn = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a"));
        contactBtn.click();
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
        name.sendKeys("Tek Bista");
        Thread.sleep(2000);

        WebElement phone = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
        phone.sendKeys("9848234567");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
        email.sendKeys("test@medicure.com");
        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
        message.sendKeys("This is a test message");
        Thread.sleep(2000);

        WebElement submitBtn = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
        submitBtn.click();
        Thread.sleep(2000);

        driver.close();
    }
}
