package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage {

	private static final String HOME_PAGE_URL = "http://automationpractice.com/index.php";

	@FindBy(xpath = "(a[rel='nofollow').first()")
	WebElement btnSingIn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void homePage() {
		driver.get(HOME_PAGE_URL);
		wait.esperarCarregamentoDaPagina(5);
	}

	public void btnSingIn() {
		WebElement login = driver.findElement(By.cssSelector(".login"));
		wait.esperarElementoSerExibido(5, login, "Sign in");
		login.click();

	}
}
