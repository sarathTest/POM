package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;


	public LoginPage typeUserName(String data) {
		// eleUName = locateElement("username");
		type(eleUserName, data);		
		return this;
	}


	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	public LoginPage typePassword(String data) {
		type(elePassword, data);
		return this;
	}


	@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit")
	private WebElement eleLogin;
	public HomePage clickLogin() {
		click(eleLogin);	
		return new HomePage();
	}
	
	
	public LoginPage verifyLogin() {
		verifyEnabled(eleLogin);	
		return this;
	}
	
	
	
	
	
	
	
	
	
	




}
