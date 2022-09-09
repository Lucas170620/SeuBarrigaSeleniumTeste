package pages;

import org.openqa.selenium.By;
import runners.Runner;

public class UserPage extends Runner {
    private By campoAlerta = By.xpath("/html/body/div[1]");

    public String verificarLogin(){
        return getDriver().findElement(campoAlerta).getText();
    }
}
