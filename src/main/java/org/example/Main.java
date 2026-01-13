package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args){

        // remote changes
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.guru99.com/test/newtours/");

            // Verify page title
            String expectedPageTitle = "Welcome: Mercury Tours";
            String actualPageTitle = driver.getTitle();
            if (expectedPageTitle.contains(actualPageTitle)) {
                System.out.println("Test is pass");
            } else {
                System.out.println("Test is fail");
            }

            //Login Page
            WebElement userNameTextField = driver.findElement(By.name("userName"));
            userNameTextField.sendKeys("test");
            WebElement passwordTextField = driver.findElement(By.name("password"));
            passwordTextField.sendKeys("test");
            WebElement submitButton = driver.findElement(By.name("submit"));
            submitButton.click();
            //Dashboard
            WebElement successMessageHeading = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"));
            String actualSuccessMessageHeadingText = successMessageHeading.getText();
            String expectedSuccessMessageHeadingText = "Login Successfully";

            if (actualSuccessMessageHeadingText.contains(expectedSuccessMessageHeadingText)) {
                System.out.println("Success message is matched.Test is pass");
            } else {
                System.out.println("Success message is not matched.Test is fail");
            }


        driver.quit();

    }
}
