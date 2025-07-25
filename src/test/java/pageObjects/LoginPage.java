package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(name="name")
	@CacheLookup
	WebElement Name;
	
	@FindBy(name="phone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(name="email")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[4]/select")
	@CacheLookup
	WebElement country;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[6]/input")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[7]/input")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="(//*[@id=\"load_form\"]/div[1]/div[2]/input)[2]")
	@CacheLookup
	WebElement btn_submit;
	
	@FindBy(xpath="//*[@id=\"alert\"]")
	@CacheLookup
	WebElement alertmsg;
	
	// 
	
	public void setName(String name) {
		this.Name.sendKeys(name);
	}

	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setCountry(String country) {
		//this.country.sendKeys(country);
		Select objSelect =new Select(ldriver.findElement(By.name("country")));
		objSelect.selectByVisibleText(country);
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void setBtn_submit() {
		this.btn_submit.click();
	}

	public String getAlertmsg() {
		return this.alertmsg.getText();
	}
	
	
	
	
	
	

}
