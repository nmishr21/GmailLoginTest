package gmailLogin.GmailTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefintion extends stepFunctions { 


	@Given("^user is on the gmail Login page$")
	public void user_is_on_the_gmail_Login_page() throws Throwable {
		userOnGmailPage();

	} 

	@Then("^user has entered the username$")
	public void user_has_entered_the_username() throws Throwable {
		enterUserName();

	}

	@Then("^user has entered the password$")
	public void user_has_entered_the_password() throws Throwable {
		enterPassword();
	}

	@Then("^user is on gmail page$")

	public void user_is_on_gmail_page() throws Throwable {
		userhasloggedIntoHisAccount();
	}

	@When("^user has clicked on the compose button$")
	public void user_has_clicked_on_the_compose_button() throws Throwable {
		clickedOnComposeButton();

	} 

	@When("^user has filled the to subject content$")
	public void user_has_filled_the_to_subject_content() throws Throwable {
		userHasComposedAmail();


	}   

	@Then("^user has clicked on the sent button$")
	public void user_has_clicked_on_the_sent_button() throws Throwable {
		ClickedOnSentButton();

	}

	@When("^user sees the logout button visible$")
	public void user_sees_the_logout_button_visible() throws Throwable {
		LogoutButtonVisibility();

	}

	@Then("^user clicks on logout$")
	public void user_clicks_on_logout() throws Throwable {
		ClickedOnLogoutButton();

	}


	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		driver.quit();
	} 


	@Then("^user has entered wrong password$")
	public void user_has_entered_wrong_password() throws Throwable {
		userHasWrongPasswordEntered();
	}

	@Then("^wrong password message is displayed$")
	public void wrong_password_message_is_displayed() throws Throwable {
		MessageDisplayedForWrongPassword();
	}
}
