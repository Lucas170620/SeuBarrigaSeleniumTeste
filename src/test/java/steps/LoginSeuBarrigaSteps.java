package steps;
import static org.junit.Assert.*;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;
import pages.UserPage;

public class LoginSeuBarrigaSteps {
    LoginPage loginPage = new LoginPage();
    UserPage userPage = new UserPage();
    @Dado("que eu acesso a tela de login do SeuBarriga")
    public void que_eu_acesso_a_tela_de_login_do_seu_barriga() {
        loginPage.acessarLoginPage();
    }
    @Quando("preencho os campos de {string} e {string}")
    public void preencho_os_campos_de_e(String email, String senha) {
        loginPage.preencherEmail(email);
        loginPage.preencherSenha(senha);
    }
    @Quando("clico em entrar")
    public void clico_em_entrar() {
        loginPage.clicarSubmit();
    }
    @Entao("aparece na tela do user {string}")
    public void aparece_na_tela_do_user(String mensagem) {
        assertEquals("Cadastro Invalido",mensagem,userPage.verificarLogin());
    }
}
