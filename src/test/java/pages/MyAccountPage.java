package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class MyAccountPage extends BasePage {

	
	@FindBy(xpath = "//header[@id='header']/div[2]/div/div/nav/div/a")
	WebElement lblAccount;
	
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validarUsuarioLogado(String nomeUsuario) {
		wait.esperarElementoSerExibido(5, lblAccount, "Nome do usuario");
		assertEquals(nomeUsuario, lblAccount.getText());
	}
	

}
