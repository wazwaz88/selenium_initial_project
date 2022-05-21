package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase03 {
    public static void main(String[] args) {

        /*
        Given user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And user should be able to see heading2 as "Contact Us"
And user should be able to see heading4 as "SEND US A MESSAGE"

         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//nav[@class='x-el x-el-nav c1-1 c1-2 c1-4n c1-4o c1-b c1-c c1-d c1-e c1-f c1-g']/ul/li[3]"));


        contactUs.click();

        WebElement heading2Link = driver.findElement(By.xpath("//span[@class='x-el x-el-span c1-37 c1-t c1-36 c1-8r c1-7g c1-66 c1-8s c1-8t c1-l c1-8u c1-8v c1-8w c1-8x c1-8y c1-8z c1-90 c1-91 c1-92 c1-o c1-93 c1-94 c1-95 c1-96 c1-97 c1-98 c1-99 c1-67 c1-68 c1-69 c1-6a']"));

        WebElement sendMessage = driver.findElement(By.xpath("//h4[@class='x-el x-el-h4 c2-1f c2-1g c2-c c2-d c2-42 c2-n c2-43 c2-3b c2-44 c2-3 c2-45 c2-4 c2-1n c2-5 c2-6 c2-7 c2-8']"));

        System.out.println(heading2Link.isDisplayed() ? "Validation passed" : "Validation failed");

        System.out.println(sendMessage.isDisplayed() ? "Validation passed" : "Validation failed");



        Driver.quitDriver();







    }
}
