package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utilities;

import java.io.IOException;

public class GoogleSearchPage {
    @FindBy(name = "q")
    public WebElement textSearch;
    String longtString;
    String shortString;
    public GoogleSearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public  void goTOBrowser(String name){
        textSearch.sendKeys(name);
    }

    public void readAndWriteData(int index,int longindex,int shortindex) throws IOException, InterruptedException {
        String[] str2 = Utilities.readData();
        String name = str2[index];
        textSearch.sendKeys(name);
        Thread.sleep(2000);
        int i;
        for (i = 1; i <= 10; i++) {
            textSearch.sendKeys(Keys.ARROW_DOWN);
            if (i == longindex) {
                longtString = textSearch.getAttribute("value");
            }
            if (i == shortindex) {
                shortString = textSearch.getAttribute("value");
            }
        }
        System.out.println(longtString);
        System.out.println(shortString);
        Utilities.writeData(index, 2, longtString);
        Utilities.writeData(index, 3, shortString);
        Thread.sleep(3000);
    }
}
