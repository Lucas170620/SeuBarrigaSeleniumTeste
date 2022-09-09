package pages;

import org.openqa.selenium.By;
import runners.Runner;

public class LoginPage extends Runner {

    private String urlLoginPage = "https://seubarriga.wcaquino.me/login";
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");

    private By submitButton = By.xpath("/html/body/div[2]/form/button");
    private By campoAlerta = By.xpath("/html/body/div[1]");

    public void acessarLoginPage(){
        getDriver().get(urlLoginPage);
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
