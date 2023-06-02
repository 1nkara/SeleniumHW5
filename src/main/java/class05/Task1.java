package class05;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {


        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement alert1Btn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();
        Thread.sleep(2000);
        Alert confirmationAlert2=driver.switchTo().alert();
        confirmationAlert2.accept();
        WebElement alert3Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Thread.sleep(2000);
        Alert confirmationAlert3=driver.switchTo().alert();
        confirmationAlert3.sendKeys("Kara");
        confirmationAlert3.accept();




    }
}
