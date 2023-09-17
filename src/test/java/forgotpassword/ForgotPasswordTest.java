package forgotpassword;

import base.BaseTests;
import org.junit.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void forgotPasswordTest(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail();
        forgotPasswordPage.clickSubmitButton();
//Este caso tendría pasos adicionales pero esta caída la pagina :P
    }
}
