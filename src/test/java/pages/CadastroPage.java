package pages;

import org.openqa.selenium.By;
import runners.Runner;

public class CadastroPage extends Runner {

    private String urlCadastroPage = "https://seubarriga.wcaquino.me/cadastro";
    private By campoNome = By.id("nome");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By submitButton = By.xpath("/html/body/div[2]/form/input");

    private By campoAlerta = By.xpath("/html/body/div[1]");

    public void acessarCadastroPage(){
        getDriver().get(urlCadastroPage);
    }

    public void preencherNome(String nome){
        getDriver().findElement(campoNome).sendKeys(nome);
    }

    public void preencherEmail(String email){
        getDriver().findElement(campoEmail).sendKeys(email);
    }
    public void preencherSenha(String senha){
        getDriver().findElement(campoSenha).sendKeys(senha);
    }

    public void clicarSubmit(){
        getDriver().findElement(submitButton).click();

    }
    public String verificarCadastro(){
        return getDriver().findElement(campoAlerta).getText();
    }


}
