package Day24;

public class logintest {
    package Test;

import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TestLogin {
    private static WebDriver driver;

    public static void main(String[] args) {
        // Initialize WebDriver (ChromeDriver)
        driver = new ChromeDriver();

        // Test with correct credentials
        System.out.println("Testing with correct credentials...");
        testCorrectCredentials();

        // Test with incorrect credentials
        System.out.println("Testing with incorrect credentials...");
        testIncorrectCredentials();

        // Close the browser after the test completes
        System.out.println("Tests completed. Closing the browser.");
        driver.quit();
    }

    // Test with correct credentials
    public static void testCorrectCredentials() {
        // Navigate to the login page
        System.out.println("Navigating to the login page...");
        driver.get("https://aiworksquad.com/login");

        // Create an instance of the LoginPage class

        LoginPage loginPage = new LoginPage(driver);

        // Enter valid email and password
        System.out.println("Entering valid email and password");
        loginPage.enterEmail("omendra108@gmail.com");
        loginPage.enterPassword("1234");
        loginPage.clickLogin();

        // Use WebDriverWait to wait for page load or specific element visibility

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("chat")); // Wait until URL contains "chat"

        // Add assertions to verify successful login
        System.out.println("Verifying successful login");
        assert driver.getCurrentUrl().contains("Before you start") : "Login was successful";
        System.out.println("Login was successful.");
    }

    // Test with incorrect credentials
    public static void testIncorrectCredentials() {
        // Navigate to the login page
        driver.get("https://aiworksquad.com/login");

        // Create an instance of the LoginPage class
        LoginPage loginPage = new LoginPage(driver);

        System.out.println("Entering invalid email and password");// Enter invalid email and password
        loginPage.enterEmail("abc@gmail.com");
        loginPage.enterPassword("1234");
        loginPage.clickLogin();

        // Use WebDriverWait to wait for error message element visibility
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getErrorMessageLocator())); // Wait until error message is visible

        System.out.println("Verifying error message for incorrect credentials");// Add assertions to verify error message for incorrect credentials
        assert loginPage.getErrorMessage().equals("Invalid username or password") : "Error message is incorrect";
    }
}

}
