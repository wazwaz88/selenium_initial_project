package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase06 {
    public static void main(String[] args) {
        /*
        Given user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And validate "SEND" button is displayed and clickable
And validate button text is displayed as “SEND”

         */


        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//nav[@class='x-el x-el-nav c1-1 c1-2 c1-4n c1-4o c1-b c1-c c1-d c1-e c1-f c1-g']/ul/li[3]"));

        contactUs.click();

        WebElement button = driver.findElement(By.xpath("//button[@data-aid]"));

        System.out.println(button.isDisplayed() && button.isEnabled() ? "Passed" : "Failed");

        System.out.println(button.getText().equals("SEND") ? "Passed" : "Failed");

        Driver.quitDriver();




    }
}
