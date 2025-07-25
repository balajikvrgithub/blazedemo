package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {

	 public WebDriver ldriver;

	    public Blazedemo(WebDriver rdriver)
	    {
	        ldriver = rdriver;
	        PageFactory.initElements(ldriver, this);
	    }

	    @FindBy(xpath="//select[@name='fromPort']")
	    @CacheLookup
	    WebElement from;

	    @FindBy(xpath="//select[@name='toPort']")
	    @CacheLookup
	    WebElement to;


	    @FindBy(xpath="//input[@value='Find Flights']")
	    @CacheLookup
	    WebElement btnFind;

	    //
	    @FindBy(xpath="/html/body/div[2]/table/thead/tr/th[3]")
	    @CacheLookup
	    WebElement airline;

	    public void setFrom(String fromPlace) {
	        Select s = new Select(ldriver.findElement(By.name("fromPort")));
	        s.selectByVisibleText(fromPlace);

	    }

	    public void setTo(String toPlace) {
	        Select s1 = new Select(to);
	        s1.selectByVisibleText(toPlace);
	    }

	    public void clickBtnFind() {
	        btnFind.click();
	    }

	    public String airlineElementPresence()
	    {
	        return airline.getText();
	    }


	
}
