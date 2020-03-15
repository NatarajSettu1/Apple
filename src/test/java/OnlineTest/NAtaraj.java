package OnlineTest;



import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Online.DressPage;
import Online.StuctClass;



public class DressPageTest {
	
	StuctClass s;

	DressPage F;
	DressPage E;

	public DressPageTest()
	{
		s=new StuctClass();
		d=new DressPage();
	}
	
@Test
	public void DressSizeDisplayed()         //method is used to  check displayed or not(Dress size)
	{
		DressPage.Dress.click();
		s.IsDisplayed(DressPage.Ssize);
		s.IsDisplayed(DressPage.Msize);
		s.IsDisplayed(DressPage.Lsize);
	}
	@Test
	public void ProductCheck()           //used to check the No'f product
	{DressPage.Dress.click();
		Assert.assertEquals(DressPage.ImageCount.size(), s.ConvertValue(DressPage.ProductCount));
s.GetTextFromText(DressPage.ProductCount);
	} 
@Test
public void AddCartVerification() throws InterruptedException
{DressPage.Dress.click();
s.ScrollDown();
s.Mousehover(DressPage.ProductLocation);
s.ClickMouse(DressPage.AddCard);
DressPage.Proceesed.click();
s.GetTextFromText(DressPage.price);
s.ScrollDown();
DressPage.AddButton.click();
s.processWait();
s.GetTextFromText(DressPage.price);
DressPage.ProcesecedButton.click();
s.TextBox(DressPage.EmailID, "natarajecec@gmail.com");
s.TextBox(DressPage.PassWord, "%nataraj%3");
DressPage.LoginButton.click();
DressPage.Dress.click();
	


}
	
}
