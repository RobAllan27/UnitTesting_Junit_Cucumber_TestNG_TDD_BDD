package simpleWebTestPackage;

import org.testng.annotations.Test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseAlertsAndPopups {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCaseAlertsAndPopups() throws Exception {
    driver.get(baseUrl + "file:///C:/Users/Rob/Userdata/Selenium%20IDE/basicwebpagewithpopupalerts.html");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Alert'])[1]/preceding::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Alert'])[1]/preceding::li[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Alert'])[1]/preceding::li[1] | ]]
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Alert'])[1]/preceding::li[1]")).getText(), "Confirm");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirm'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirm'])[1]/following::li[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Confirm'])[1]/following::li[1] | ]]
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirm'])[1]/following::li[1]")).getText(), "Alert");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    acceptNextAlert = true;
    driver.findElement(By.id("btnConfirm")).click();
    assertEquals(closeAlertAndGetItsText(), "Chose an option Please.");
    driver.findElement(By.id("btnAlert")).click();
    assertEquals(closeAlertAndGetItsText(), "I'm blocking!");
    // ERROR: Caught exception [ERROR: Unsupported command [answerOnNextPrompt | Roberto | ]]
    driver.findElement(By.id("btnPrompt")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getPrompt |  | ]]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
