package class05;
/*
@here
HW2:
goto https://chercher.tech/practice/frames
click on check box
then select bay cat from drop down
then enter text in text box
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods{
    public static void main(String[] args) {
     String url="https://chercher.tech/practice/frames";
     String browser="chrome";
     openBrowserAndLaunchApplication(url,browser);

         driver.switchTo().frame(0);
        WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By .id("a")).click();
        //select baby cat from drop down

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        //find the WebElement animal
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
        //select baby cat
        WebElement dd=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();
        //switch to frame containing text box
        driver.switchTo().frame("frame1");
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abrcadabra");




    }
}
