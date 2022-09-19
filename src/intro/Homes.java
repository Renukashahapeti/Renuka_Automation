package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import pageobjectmodule.Homepager;




public class Homes {

	    
	 @Test
	    
     public void home() throws InterruptedException
     {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\renuka.shahapeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         Homepager hp= new Homepager(driver);
         hp.goTo();
         hp.h1();
         hp.lands();
         hp.allmob();
         hp.homesupport();
         hp.scrollDown();
         hp.downlinks1();
     }



}