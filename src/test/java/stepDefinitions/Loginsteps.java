package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.Blazedemo;
import pageObjects.LoginPage;
import utils.Log;

public class Loginsteps {
	
	public WebDriver driver;
	public LoginPage lp;
    public Blazedemo b;
    public static Logger logger;
    
	

@Given("User lands in url {string}")
public void user_lands_in_url(String url) {
  Log.info("starting webdriver");
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\Downloads\\chromedriver-win64\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get(url);
  Log.info("url " + url + " launched");
}

@When("User provides name {string}")
public void user_provides_name(String name) {
   
   lp = new LoginPage(driver);
   lp.setName(name);
   
}

@When("User provides phone {string}")
public void user_provides_phone(String phone) {
	lp.setPhone(phone);
}

@When("User provides email {string}")
public void user_provides_email(String email) {
	lp.setEmail(email);
}

@When("User provides country {string}")
public void user_provides_country(String country) {
	lp.setCountry(country);  
}

@When("User provides city {string}")
public void user_provides_city(String city) {
	lp.setCity(city);
}

@When("User provides username {string}")
public void user_provides_username(String uname) {
	lp.setUsername(uname);
}

@When("User provides password {string}")
public void user_provides_password(String password) {
	lp.setPassword(password);
}

@When("user clicks on login button")
public void user_clicks_on_login_button() throws InterruptedException {
   lp.setBtn_submit();
   Thread.sleep(5000);
}

@Then("user should see success message of {string}")
public void user_should_see_success_message_of(String alertmsg) {
	Assert.assertEquals(lp.getAlertmsg(), alertmsg);
}

//------------------------------------
//blaze steps

@When("User selects {string} and {string}")
public void user_selects_and(String fromPlace, String toPlace) {
    b = new Blazedemo(driver);
    b.setFrom(fromPlace);
    b.setTo(toPlace);
}

@When("User click on find button")
public void user_click_on_find_button() throws InterruptedException {
    b.clickBtnFind();
    Thread.sleep(3000);
}

@Then("User should land on flight booking page")
public void user_should_land_on_flight_booking_page() {
    Assert.assertEquals("Airline",b.airlineElementPresence());

}




}
