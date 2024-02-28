import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) { super(driver); }
    private  By emailField =By.className("email");
    private WebElement emailFieldElement ;

    private By passwordField = By.className("password");
    private WebElement passwordFieldElement ;
    private By loginButton = By.className("login-button");
    private  WebElement loginButtonElement ;

    public void Enteremail(String email)
    {
        emailFieldElement = driver.findElement(emailField);
        sendtext(emailFieldElement,email);
    }
    public void Enterpassword(String password)
    {
        passwordFieldElement = driver.findElement(passwordField);
        sendtext(passwordFieldElement,password);
    }

    public void ClickonLoginButton()
    {
        loginButtonElement = driver.findElement(loginButton);
        Clicking(loginButtonElement);

    }

}
