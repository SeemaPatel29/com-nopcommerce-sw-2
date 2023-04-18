package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedMessage = "Welcome, Please Sign In!";

        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not redirected to login page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find the Username (email) Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type the Email address to email field element
        emailField.sendKeys("primet1234@gmail.com");
        //Find the password Field Element and send password on password field
        driver.findElement(By.name("Password")).sendKeys("Prime12340");
        //Find the Login Button element and click
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        String expectedMessage = "Log out   ";
        WebElement actualTextElement = driver.findElement(By.xpath("//a[text()='Log out']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Logout not valid", expectedMessage, actualMessage);


    }

    @Test
    public void verifyTheErrorMessage() {
       //  Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
     // Find username field and enter username on username field
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
      // find the password field and enter password on password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");
      // Find the Login button Element and click
        WebElement loginBtn = driver.findElement(By.xpath("//button [contains(text(),'Log in')]"));
        loginBtn.click();
      // String expectedMessage = "Login was successfully\n";
      // WebElement actualTextElement = driver.findElement(By.xpath();
      // String actualMessage = actualTextElement.getText();
     // Assert.assertEquals("Error message not displayed", expectedMessage,actualMessage);
    }

    //closing the browser
    @After
    public void closeDriver() {
       driver.close();
    }
}
