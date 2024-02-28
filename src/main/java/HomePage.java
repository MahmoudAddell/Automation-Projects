import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {


    public HomePage(WebDriver driver) {
        super(driver);
    }
    By registerButton = By.className("ico-register");
    By loginButton = By.className("ico-login");
    WebElement registerButtonElement ;
    WebElement LoginButtonElement ;
    public RegisterPage ClickOnRegisterButton()
    {
        registerButtonElement = driver.findElement(registerButton) ;
    Clicking(registerButtonElement);
    return new RegisterPage(driver);
    }

    public LoginPage ClickOnLogin()
    {
        LoginButtonElement = driver.findElement(loginButton) ;
    Clicking(LoginButtonElement);
      return   new LoginPage(driver);
    }


}
