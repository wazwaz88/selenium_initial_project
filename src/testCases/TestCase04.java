package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class TestCase04 {
    public static void main(String[] args) {
        /*
        Given user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And validate "First Name" input box
And validate "Last Name" input box
And validate "Email" input box
And validate "Message" input box
NOTE: Input validation includes input being displayed and user being able send keys to input box. It also requires validating the given labels and placeholders

         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");


        WebElement contactUs = driver.findElement(By.xpath("//nav[@class='x-el x-el-nav c1-1 c1-2 c1-4n c1-4o c1-b c1-c c1-d c1-e c1-f c1-g']/ul/li[3]"));

        contactUs.click();

        WebElement firstBox = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement firstBoxPlaceholder = driver.findElement(By.xpath("//div[@data-aid='First Name']/label"));

        WebElement secondBox = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement secondBoxPlaceholder = driver.findElement(By.xpath("//div[@data-aid='Last Name']/label"));

        WebElement thirdBox = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement thirdBoxPlaceholder = driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_EMAIL']/label"));

        WebElement fourthBox = driver.findElement(By.xpath("//textarea[@data-aid]"));
        WebElement fourthBoxPlaceholder = driver.findElement(By.xpath("//textarea[@placeholder]"));


        System.out.println(firstBoxPlaceholder.getText().equals("First Name*") ? "Passed" : "Failed");

        firstBox.sendKeys("Abdullah");

        System.out.println(firstBox.getAttribute("value").equals("Abdullah") ? "Passed" : "Failed");


        System.out.println(secondBoxPlaceholder.getText().equals("Last Name*") ? "Passed" : "Failed");


        secondBox.sendKeys("Wazwaz");

        System.out.println(secondBox.getAttribute("value").equals("Wazwaz") ? "Passed" : "Failed");

        System.out.println(thirdBoxPlaceholder.getText().equals("Email*") ? "Passed" : "Failed");

        thirdBox.sendKeys("abc123@gmail.com");

        System.out.println(thirdBox.getAttribute("value").equals("abc123@gmail.com") ? "Passed" : "Failed");


        System.out.println(fourthBoxPlaceholder.getAttribute("placeholder").equals("Message*") ? "Passed" : "Failed");

        fourthBox.sendKeys("This is a test");

        System.out.println(fourthBox.getText().equals("This is a test") ? "Passed" : "Failed");






        Driver.quitDriver();

    }
}
