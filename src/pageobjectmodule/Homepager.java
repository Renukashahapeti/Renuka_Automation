package pageobjectmodule;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepager {
	
	WebDriver driver;
    public Homepager(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    
    public void goTo()
    {
        driver.get("https://mobileworld.banyanpro.com/");
           
    }



  //home
       @FindBy(xpath = "//nav[@id='navbar']//li[1]//a[1]")
       WebElement home;
       
   //
       @FindBy(css = "body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
       WebElement latest;
       @FindBy(css = "body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(2) > a:nth-child(1)")    
       WebElement samsung;
       @FindBy(xpath = "//a[normalize-space()='Lenovo']")
       WebElement lenovo;
       @FindBy(css = "body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(2) > a:nth-child(4)")
       WebElement apple;
       
       
       //allmobiles
       @FindBy(css = "body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
       WebElement allmob;
       
       //home button
       @FindBy(xpath = "//a[normalize-space()='Home']")
       WebElement homebtn;
       
       
       public void h1() throws InterruptedException
       {
           home.click();
           Thread.sleep(1000);
       }
       
       public void lands() throws InterruptedException
       {
           latest.click();
           Thread.sleep(1000);
           samsung.click();
           Thread.sleep(1000);
           home.click();
           Thread.sleep(1000);
           latest.click();
           Thread.sleep(1000);
           lenovo.click();
           Thread.sleep(1000);
           home.click();
           Thread.sleep(1000);
           latest.click();
           Thread.sleep(1000);
           apple.click();
           Thread.sleep(1000);
           home.click();
       
       }
       
       public void allmob() throws InterruptedException
       {
           Thread.sleep(2000);
           allmob.click();
           Thread.sleep(2000);
           home.click();
           Thread.sleep(2000);
       }




       public void homesupport() throws InterruptedException {
           
           driver.findElement(By.xpath ( "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
           driver.findElement(By.linkText("Order")).click();
           Set<String>window=driver.getWindowHandles(); // for window handling
           Iterator<String>it=window.iterator();
           String parentId =it.next();
           String childId =it.next();
           driver.switchTo().window(childId);
           Thread.sleep(2000);
           driver.switchTo().window(parentId);
       }
       
       public void scrollDown() throws InterruptedException {
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(0,800)", "");
           Thread.sleep(2000);
           
       }




       public void downlinks1() throws InterruptedException {
           driver.findElement(By.cssSelector("body > footer:nth-child(6) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
           Thread.sleep(2000);
           
           driver.findElement(By.linkText("Terms & Conditions")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//span[@class='footer-title']//a[@href='#'][normalize-space()='Contact Us']")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']")).click();
           System.out.println(driver.getWindowHandle());
           Thread.sleep(2000);
           driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();     
           System.out.println(driver.getWindowHandle());
           Thread.sleep(2000);
           driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//body/section[@id='mobiles']/div[@class='container m-5']/div[@id='samsung']/div[1]")).click();
           Thread.sleep(2000);
           
       }
}

