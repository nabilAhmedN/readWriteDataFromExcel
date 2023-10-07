package tests;

import drivers.BaseDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

import java.io.IOException;

public class ReadAndWriteTest extends BaseDriver {
    GoogleSearchPage readAndWriteExcelPage;
    @Test
    public void getBrowser(){
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void readAndWriteData1() throws IOException, InterruptedException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.readAndWriteData(1,4,2);
    }
    @Test(priority = 2)
    public void readAndWriteData2() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        Thread.sleep(2000);
        readAndWriteExcelPage.readAndWriteData(2,2,1);
    }
    @Test(priority = 3)
    public void readAndWriteData3() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        Thread.sleep(2000);
        readAndWriteExcelPage.readAndWriteData(3,10,2);
    }
    @Test(priority = 4)
    public void readAndWriteData4() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        Thread.sleep(2000);
        readAndWriteExcelPage.readAndWriteData(4,3,1);
    }
    @Test(priority = 5)
    public void readAndWriteData5() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        Thread.sleep(2000);
        readAndWriteExcelPage.readAndWriteData(5,8,3);
    }
    @Test(priority = 6)
    public void readAndWriteData6() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        Thread.sleep(2000);
        readAndWriteExcelPage.readAndWriteData(6,7,3);
    }
    @Test(priority = 7)
    public void readAndWriteData7() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        Thread.sleep(2000);
        readAndWriteExcelPage.readAndWriteData(7,2,9);
    }
    @Test(priority = 8)
    public void readAndWriteData8() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        readAndWriteExcelPage.readAndWriteData(8,9,1);
    }
    @Test(priority = 9)
    public void readAndWriteData9() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        Thread.sleep(2000);
        readAndWriteExcelPage.readAndWriteData(9,4,1);
    }
    @Test(priority = 10)
    public void readAndWriteData10() throws InterruptedException, IOException {
        readAndWriteExcelPage = new GoogleSearchPage(driver);
        readAndWriteExcelPage.textSearch.clear();
        Thread.sleep(2000);
        readAndWriteExcelPage.readAndWriteData(10,6,10);
    }
    @AfterTest
    public  void browserClose(){
        driver.quit();
    }
}
