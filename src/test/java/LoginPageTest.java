import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    private HomePage homePage ;
    private LoginPage loginPage ;

    @Test
    public void ValidLoginTC()
    {
        homePage = new HomePage(driver);
        loginPage = homePage.ClickOnLogin();
        loginPage.Enteremail("mahmoud@gmail.com");
        loginPage.Enterpassword("123456789");
        loginPage.ClickonLoginButton();
    }

}
