package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class signin {
	 @Test(dataProvider="login")//LOGIN
	    public void sign(String username,String Password) throws Exception
	    {
	    
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\renuka.shahapeti\\Downloads/chromedriver_win32\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	             
	            LandingPage page=new LandingPage(driver);
	            page.goTo();
	           // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	            page.signin.click();
	            Thread.sleep(2000);
	            page.username.sendKeys(username);
	            Thread.sleep(2000);
	            page.password.sendKeys(Password);
	            Thread.sleep(2000);
	            page.loginbutton.click();
	            driver.close();
	    }
	    @DataProvider(name="login")
	    public Object[][] getdata()
	    {
	        Object [][] data=new Object[4][2];
	      data [0][0]="Renuka";
	      data [0][1]="renuka@123";
	      data [1][0]="aa";
	      data [1][1]="934f34";
	      data [2][0]="renukashahapeti";
	      data [2][1]="rrs@9880";
	      data [3][0]=" ";
	      data [3][1]="A123456789";



	     return data;
	    }
}

	
	