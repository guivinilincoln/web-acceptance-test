package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class LoginPage extends BasePage {
	
	private static final String HOME_PAGE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	
	@FindBy(id = "email")
	WebElement inputEmail; 
	
	@FindBy(id = "passwd")
	WebElement inputPassword;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']/span")
	WebElement btnSign;
	
	@FindBy(xpath = "//div[@id='center_column']/div/ol/li")
	WebElement lblMensagemError;
	
	
	
    public LoginPage() {
    	 PageFactory.initElements(driver, this);
    }
    
	public void informarEmail(String email) {
	wait.esperarElementoSerExibido(5, inputEmail, "Campo email");
	inputEmail.click();
	inputEmail.sendKeys(email);
	}
	
	public void informarSenha(String senha) {
	wait.esperarElementoSerExibido(5, inputPassword, "Campo senha");
	inputPassword.click();
	inputPassword.sendKeys(senha);
	}
	
	public void clicarBtnSign() {
	wait.esperarElementoSerExibido(5, btnSign, "Botão Logar");
	btnSign.click();
	}
	
	public void valdiarMensagemErro(String mensagem) {
		wait.esperarElementoSerExibido(5, lblMensagemError, "Mensagem de erro Login em branco/invalido");
		assertEquals(mensagem, lblMensagemError.getText());	
	}
	

}
