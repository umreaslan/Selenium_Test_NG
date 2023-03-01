package tests.day10_TestNGFremwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class C02_dependsOnMethods {


    /*

    priorty oncelik belirler ama testleri biribirine baglamaz

    eger bir test methodun calismasi baska bir test methoduna bagli ise
    bu durumda depedsonmethod kullanmak daha guzel olur
     */
    // 3 test method'u olusturun
    // 1. amazona gidip amazona gittigimizi test edin
    // 2. Nutella aratip, sonucun Nutella icerdigini test edin
    // 3. ilk urune click yapip, urun isminin Nutella icerdigini test edin
    AmazonPage amazonPage = new AmazonPage();
    @Test
    public void amazonTesti(){

        Driver.getDriver().get("https://www.amazon.com");

        String expectedIcerik="amazon";
        String actualurl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualurl.contains(expectedIcerik));
    }

    @Test
    public void nutellaTesti(){


        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }

    @Test()
    public  void IlkUruntestii(){




    }

}




