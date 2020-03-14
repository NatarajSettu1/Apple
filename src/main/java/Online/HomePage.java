package Online;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  extends StuctClass {
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	public static WebElement Women;
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	public static WebElement Dress;
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[3]/a")
	public static WebElement Tshirt;
	@FindBy(xpath="//*[@id=\'newsletter-input\']")
	public static WebElement EmailBox;
	@FindBy(xpath="//*[@id=\'newsletter_block_left\']/div/form/div/button")
	public static WebElement EmailBoxButton;
	

}
