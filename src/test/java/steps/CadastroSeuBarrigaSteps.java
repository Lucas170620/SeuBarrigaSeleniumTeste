package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroPage;
import pages.LoginPage;
import runners.Runner;

import static org.junit.Assert.*;

public class CadastroSeuBarrigaSteps extends Runner {
    CadastroPage cadastroPage = new CadastroPage();
    LoginPage loginPage = new LoginPage();
    @Dado("que eu acesso a tela de cadastro do SeuBarriga")
    public void que_eu_acesso_a_tela_de_cadastro_do_seu_barriga() {
        cadastroPage.acessarCadastroPage();
    }
    @Quando("preencho os campos de {string} {string} e {string}")
    public void preencho_os_campos_de_e(String nome, String email, String senha) {
        cadastroPage.preencherNome(nome);
        cadastroPage.preencherEmail(email);
        cadastroPage.preencherSenha(senha);

    }
    @Quando("clico em cadastrar")
    public void clico_em_cadastrar(){
        cadastroPage.clicarSubmit();
    }
    @Quando("volto para a tela de cadastro")
    public void volto_para_a_tela_de_cadastro(){
        cadastroPage.acessarCadastroPage();
    }
    @Entao("aparece na tela {string}")
    public void aparece_na_tela(String valorEsperado) {
        assertEquals("Cadastro Invalido",valorEsperado,loginPage.verificarCadastro());
    }
}
