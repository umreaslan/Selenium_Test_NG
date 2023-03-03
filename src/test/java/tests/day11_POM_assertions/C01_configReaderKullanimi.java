package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_configReaderKullanimi {

    @Test(groups = "smoke")
    public void test01(){


        //amazon anasayfaya gidelim

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        //nutella icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);


        //arama sonuclarinin nutella icerdigini test edelim

        String expectedIcerik=ConfigReader.getProperty("amazonAranacakKelime");
        String actualAramaSonucyazisi=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucyazisi.contains(expectedIcerik));

        Driver.closeDriver();
    }
}
