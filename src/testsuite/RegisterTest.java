package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        driver.findElement(By.xpath("//h1[text() = 'Register']")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.name("FirstName")).sendKeys("Keval");
        driver.findElement(By.name("LastName")).sendKeys("Bhai");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("18");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("2016");
        driver.findElement(By.id("Email")).sendKeys("xyz1289@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("xyz123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz123");
        driver.findElement(By.name("register-button")).click();
        String expectedMessage = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
       String actualMessage = actualTextElement.getText();
       Assert.assertEquals("Not found ", expectedMessage, actualMessage);
    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){

        driver.findElement(By.name("//a[text() = 'Register']")).click();
        String expectedMessage = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not found ", expectedMessage, actualMessage);
    }
    @After
    public void closeDriver() {
        driver.close();
    }
    }




