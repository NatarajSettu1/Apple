package Online;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPage extends StuctClass {
	public DressPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	public static WebElement Dress;
	@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[1]/label/a")
	public static WebElement Ssize;
	@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[2]/label/a")
	public static WebElement Msize;
	@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[3]/label/a")
	public static WebElement Lsize;
	@FindBy(xpath="//*[@id=\'center_column\']/h1/span[2]")
	public static WebElement ProductCount;
	@FindBys(@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div/div/a/img"))
	public static List<WebElement> ImageCount;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	public static WebElement ProductLocation;
	@FindBy(xpath="//*[@id=\'center_column\']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	public static WebElement AddCard; 
	@FindBy(xpath="//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a")
	public static WebElement Proceesed; 
	@FindBy(xpath="//*[@id=\'cart_quantity_up_3_13_0_0\']")
	public static WebElement AddButton;
	@FindBy(xpath="//*[@id=\'total_price\']")
	public static WebElement price;
	@FindBy(xpath="//*[@id=\'center_column\']/p[2]/a[1]")
	public static WebElement ProcesecedButton;
	@FindBy(xpath="//*[@id=\'email\']")
	public static WebElement EmailID;
	@FindBy(xpath="//*[@id=\'passwd\']")
	public static WebElement PassWord;
	@FindBy(xpath="//*[@id=\'SubmitLogin\']")
	public static WebElement LoginButton;
	
	
	
	
	

}
