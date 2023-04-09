package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText = "My account")
	WebElement myAccountLink;
	
	@FindBy(linkText = "Change password")
	WebElement changePasswordLink;
	
	@FindBy(id = "OldPassword")
	WebElement oldPasswordTxt;
	
	@FindBy(id = "NewPassword")
	WebElement newPasswordTxt;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement confirmPasswordTxt;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
	WebElement changePasswordButton;
	
	public void OpenMyAccountPage() 
	{
		clickButton(myAccountLink);
		
	}
	
	public void OpenChangePasswordPage() 
	{
		clickButton(changePasswordLink);	
	}
	
	public void  ChangePassword(String oldPassword, String newPassword) 
	{
		setTxtElementTxt(oldPasswordTxt, oldPassword);
		setTxtElementTxt(newPasswordTxt, newPassword);
		setTxtElementTxt(confirmPasswordTxt, newPassword);
		clickButton(changePasswordButton);
		
	}
	

}
