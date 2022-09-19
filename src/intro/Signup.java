package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Signup {

	@Test(dataProvider="Signup") //SIGNUP
    public void sign(String Firstname,String Lastname,String Email,String password,String date,String phonenumber,String shortbio) throws Exception
    {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\renuka.shahapeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       Signup_LandingPage page=new Signup_LandingPage(driver);
       page.goTo();
       
       page.signin().click();
       Thread.sleep(1000);
       page.signup().click();
       Thread.sleep(1000);
       page.FirstName().sendKeys(Firstname);
       Thread.sleep(1000);
       page.LastName().sendKeys(Lastname);
       Thread.sleep(1000);
       page.Email().sendKeys(Email);
       Thread.sleep(1000);
       page.Password().sendKeys(password);
       Thread.sleep(1000);
       page.date().sendKeys(date);
       Thread.sleep(1000);
       page.gender().click();
       Thread.sleep(1000);
       page.phonenumber().sendKeys(phonenumber);
       Thread.sleep(1000);
       page.shortbio().sendKeys(shortbio);
       Thread.sleep(1000);
       page.register().click();
       Thread.sleep(1000);
       //driver.close();
    }
    @DataProvider(name="Signup")
       public Object[][] getdata()
       {
           Object [][] data=new Object[1][7];
           data [0][0]="Renuka";
           data [0][1]="Shahapeti";
           data [0][2]="rrs@123";
           data [0][3]="934t35";
           data [0][4]="08/20/2000";
           data [0][5]="9876543214";
           data [0][6]="Ok";
           
//           data [1][0]="Re";
//           data [1][1]="Shaha";
//           data [1][2]="rrs@123";
//           data [1][3]="764t35";
//           data [1][4]="20/08/2000";
//           data[1][5]="9876543214";
//           data[1][6]="Ok";
       return data;
   
   
}
}