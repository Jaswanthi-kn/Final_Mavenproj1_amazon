package Maven_Amazon_proj1.Amazon_proj1__Final_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Checkout_Page 
{
	WebDriver driver;
	@FindBy(id="orderSummaryPrimaryActionBtn")
	WebElement usethisaddress_button;
	
	public void usethisaddress_button_click()
	{
		usethisaddress_button.click();
	}
	public boolean usethisaddress_button_display()
	{
		boolean b1=usethisaddress_button.isDisplayed();
		return b1;
	}
	public Amazon_Checkout_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

}
