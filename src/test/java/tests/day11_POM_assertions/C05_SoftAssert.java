package tests.day11_POM_assertions;


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SoftAssert {

    @Test
    public  void  amazonTesti(){



        //amazon anasayfaya gidip dogru sayfaya gittigimizi dogrulayin

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik));


        //nutella icin arama yapup sonuclarin nutella icerdigini DOGRULAYIN

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"  + Keys.ENTER);

         expectedIcerik ="Nutella";
         String actualAramaSonucSayisi=amazonPage.aramaSonucElementi.getText();
         softAssert.assertTrue(actualAramaSonucSayisi.contains(expectedIcerik));

        //ilk urune tiklayip urun isminde nutella gectigini dogrulatin

        amazonPage.ilkUrun.click();
        expectedIcerik="Nutella";
        String actualUrunisim=amazonPage.ilkUrunIsimElementi.getText();
        softAssert.assertTrue(actualUrunisim.contains(expectedIcerik));

        softAssert.assertAll();
        Driver.closeDriver();


    }




    }

