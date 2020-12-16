package tests;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginSteps {
	
	
	public HomePage telaInicial;
	public LoginPage telaDeLogin;
	public MyAccountPage telaUsuarioLogado;
	
	public LoginSteps() {
		this.telaInicial = new HomePage();
		this.telaDeLogin = new LoginPage();
		this.telaUsuarioLogado = new MyAccountPage();
	}
	
	@Dado("eu faço login com {string} e {string}")
	public void eu_faþo_login_com_e(String email, String senha) {
	    telaInicial.homePage();
	    telaInicial.btnSingIn();
	    telaDeLogin.informarEmail(email);
	    telaDeLogin.informarSenha(senha);
	   
	}
	
	@Então("devo ser autenticado")
	public void devo_ser_autenticado() {
		telaDeLogin.clicarBtnSign();
	}
	
	@E("devo ver {string} na area logada")
	public void devo_ver_na_area_logada(String usuario) {
		telaUsuarioLogado.validarUsuarioLogado(usuario);
	}
	
	@Então("não devo ser autenticado")
	public void nÒo_devo_ser_autenticado() {
		telaDeLogin.clicarBtnSign();
	}

	@E("devo ver a mensagem de alerta {string}")
	public void devo_ver_a_mensagem_de_alerta(String mensagem) {
		telaDeLogin.valdiarMensagemErro(mensagem);
	}

}
