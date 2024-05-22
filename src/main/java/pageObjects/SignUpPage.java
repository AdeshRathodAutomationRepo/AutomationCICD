package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='modal-title']")
	private WebElement signUpWindow;
	
//	public void clickOnSignUpBtn() {
//		signUpBtn.click();
//	}
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean validateSignUpWindow() {
		return signUpWindow.isDisplayed();
	}

}
