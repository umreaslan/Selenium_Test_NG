
package tests.day11_POM_assertions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PozitifLoginTesti {
    @Test(groups = "smoke")
    public void pozitifLoginTesti(){
        // qd anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
     // Driver.getDriver().findElement(By.linkText("Accept")).click();
        QdPage qdPage= new QdPage();
        // login linkine tiklayin
       qdPage.cookies.click();
        qdPage.ilkLoginLinki.click();

        // gecerli kullanici adi ve password ile giris yapin
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        qdPage.loginButonu.click();

        // basarili bir sekilde giris yapildigini test edin
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());

        Driver.closeDriver();
    }
}


