package Online;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class StuctClass {
	public static WebDriver driver;   //Global declaration for Access 
	public String browser="Chrome";
	public StuctClass()               //Automatic run when created object for this class
	{
	if(driver==null)	              //check driver status
	{
	if(browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M SuriyaKumar\\Desktop\\Driver tools\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	else if(browser.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\M SuriyaKumar\\Desktop\\Driver tools\\geckodriver.exe");
		driver=new FirefoxDriver();	
	}
		
	driver.get("http://automationpractice.com/index.php");     //Set URL
	driver.manage().window().maximize();                       //Maximize the window
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //waiting for next process(driver)
	
	}
	}
	
	public void IsDisplayed(WebElement Location)                           //Method used to checkTag displayed or not
	{   String NameOfTag= Location.getText();
		System.out.println(NameOfTag +" Tag "+Location.isDisplayed());
	}
	
    public void GetTitle()                                                 //Method used to get a current title of the page
    {
    	System.out.println("Title is "+driver.getTitle());
    }
    
    public void TextBox(WebElement Location,String Name)                  //Method used to send a value to TextBox
    {
    	Location.sendKeys(Name);
    
    }
    public void GetText(WebElement Location)                             //Get a value from Text box
    {
    	String BoxValue=Location.getAttribute("value");
    	System.out.println("Text Box Value:"+BoxValue);	
    }
    public int ConvertValue(WebElement Location)                        //String Convertion Applicable for Dress Page only
    {
    	String Product=Location.getText();
    	String Array[]=Product.split(" ");
    	String Value=Array[2];
    	int Productval=Integer.parseInt(Value);
    	return Productval;
    }
   public void GetTextFromText(WebElement Location)                        //GetTextFromTex
    {
    System.out.println(Location.getText());	
    }
    
public void Mousehover(WebElement Location)
{
Actions action=new Actions(driver);	
action.moveToElement(Location).build().perform();
//action.doubleClick(Location);
}
public void ClickMouse(WebElement Location)
{
	Actions action=new Actions(driver);
	action.doubleClick(Location).build().perform();
	
}

public void ScrollDown()                                      // scroll
{
	
	JavascriptExecutor Java=(JavascriptExecutor)driver;
	Java.executeScript("window.scrollBy(0,1000)");
}
public void Wait()
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public void processWait() throws InterruptedException
{
	Thread.sleep(1000);
}
}
