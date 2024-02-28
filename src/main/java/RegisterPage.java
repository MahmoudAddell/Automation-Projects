import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    private By genderMale = By.id("gender-male");
    private WebElement genderMaleElement ;
    private By firstName =By.id("FirstName");
    private WebElement firstNameElement ;
    private By lastName = By.id("LastName");
    private WebElement lastNameElement ;

    private By emailField =By.id("Email");
    private WebElement emailFieldElement ;

    private By passwordField = By.id("Password");
    private WebElement passwordFieldElement ;

    private By repasswordField =By.id("ConfirmPassword");
    private WebElement repasswordFieldElement ;

    private By registerButton = By.id("register-button");
    private WebElement registerButtonElement ;
    public void EnterFirstName(String fname)
    {
    firstNameElement = driver.findElement(firstName);
    sendtext(firstNameElement,fname);
    }
    public void EnterLastName(String lname)
    {
        lastNameElement = driver.findElement(lastName);
        sendtext(lastNameElement,lname);
    }
    public void EnterEmail(String email)
    {
        emailFieldElement = driver.findElement(emailField);
        sendtext(emailFieldElement,email);
    }
    public void EnterPassword(String password)
    {
        passwordFieldElement = driver.findElement(passwordField);
        sendtext(passwordFieldElement,password);
    }
    public void EnterRepassword(String repassword)
    {
        repasswordFieldElement = driver.findElement(repasswordField);
        sendtext(repasswordFieldElement,repassword);
    }
    public void chooseGender()
    {
    genderMaleElement = driver.findElement(genderMale);
    Clicking(genderMaleElement);
    }
    public void clickonRegisterButton()
    {
        registerButtonElement = driver.findElement(registerButton);
        Clicking(registerButtonElement);
    }

}
