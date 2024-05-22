package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//*[contains(text(),'mazad')])[1]")
	private WebElement mazad;
	
	@FindBy(xpath="//*[contains(text(),'Sign Up')]")
	private WebElement signUpBtn;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean validateMazad() {
		return mazad.isDisplayed();
	}
	
	public SignUpPage clickOnSignUpBtn() {
		signUpBtn.click();
		return new SignUpPage(driver);
	}
	

}
