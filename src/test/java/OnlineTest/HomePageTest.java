package OnlineTest;



import org.testng.annotations.Test;

import Online.HomePage;
import Online.StuctClass;



public class HomePageTest {
	
	StuctClass s;
	HomePage h;
	public HomePageTest()
	{
	s=new StuctClass();
	h=new HomePage();	
	}

	@Test(priority=1)
	public void HomePageDisplayed()  //displayed 3tags (women,dresses,t shirts)
	{
	s.IsDisplayed(HomePage.Women);
	s.IsDisplayed(HomePage.Dress);
	s.IsDisplayed(HomePage.Tshirt);
	
	}
	@Test(priority=2)
	public void PageNavigated()      //Page Checked navigate or not
	{
		HomePage.Women.click();
		s.GetTitle();
		HomePage.Dress.click();
		s.GetTitle();
		HomePage.Tshirt.click();
		s.GetTitle();
		
	}
	@Test(priority=3)
	public void EmailNewsLetter()      //Email Box Value
	{
	s.TextBox(HomePage.EmailBox,"natarajecec@gmail.com");
	s.GetText(HomePage.EmailBox);
	HomePage.EmailBoxButton.click();
	s.GetText(HomePage.EmailBox);
	
	
	}
	
}
