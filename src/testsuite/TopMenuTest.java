package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = " https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
// Find computer link and click on computer
//WebElement computerLink = driver.findElement(By.xpath("//a[contains(text(),'Computers ')] "));
// computerLink.click();
// Navigate to computer page
// driver.navigate().forward();


//click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[text()= 'Computers ']")).click();
        String expectedMessage = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()= 'Computers']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify computers text displayed", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
// click on 'electronics' Tab
        driver.findElement(By.xpath("//a[contains(text(),'Electronics' )]")).click();
        String expectedMessage = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics' )]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify electronics text display", expectedMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

//Find Apparel link and click on Apparel
        driver.findElement(By.xpath("(//a[contains(text(),'Apparel ')])[1]")).click();
        String expectedMessage = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify apparel text display",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully () {
//Find digital downloads
        driver.findElement(By.xpath("(//a[text()='Digital downloads '])[1]")).click();
        String expectedMessage = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify digital download text display",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully () {
//Find book page//
        driver.findElement(By.xpath("(//a[text()='Books '])[1]")).click();
        String expectedMessage = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify Book page display",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully () {
//Find Jewelry
        driver.findElement(By.xpath("(//a[text()='Jewelry '])[1]")).click();
        String expectedMessage = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify Jewelry page display",expectedMessage,actualMessage);
    }


    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully () {
//Find Jewelry
        driver.findElement(By.xpath("(//a[text()='Gift Cards '])[1]")).click();
        String expectedMessage = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Verify Gift Card page display",expectedMessage,actualMessage);

    }
    @After
    public void closeDriver() {
        driver.close();
    }
}



