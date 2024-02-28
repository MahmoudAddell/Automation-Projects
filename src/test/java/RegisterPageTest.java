import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    private HomePage homePage ;
    private RegisterPage registerPage ;

    @Test
    public void ValidRegisterTC()
    {
        homePage = new HomePage(driver);
      registerPage =  homePage.ClickOnRegisterButton();
      registerPage.chooseGender();
      registerPage.EnterFirstName("Mahmoud");
      registerPage.EnterLastName("Khaled");
      registerPage.EnterEmail("mahmoud@gmail.com");
      registerPage.EnterPassword("123456789");
      registerPage.EnterRepassword("123456789");
      registerPage.clickonRegisterButton();
    }









}
