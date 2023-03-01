package tests.day10_TestNGFremwork;

import net.bytebuddy.build.Plugin;
import org.junit.Assert;
import org.junit.Test;
import utilities.Driver;

public class C01_Priority {

     /*
        TestNG test method'larini calistirirken standart olarak harf siralamasina bakar
        Ancak TestNG siralamayi bizim kontrol etmemize olanak tanir
        istedigimiz test method'una istedigimiz onceligi priority ile tanimlayabiliriz
        Selenium test method'larini priority'si kucukten buyuge olacak sekilde calistirir
        priority degeri ayni olan test method'lari harf sirasina gore calisir
        priority degeri yazilmazsa default olarak priority=0 kabul edilir
     */


    public void youtubeTesti(){
        // youtube ana sayfaya gidip, youtube gittigimizi test edelim
        Driver.getDriver().get("https://www.youtube.com");

        // url youtube iceriyor mu test edelim
        String expectedIcerik = "youtube";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test
    public void amazonTesti(){
        // Amazon ana sayfaya gidip, amazona gittigimizi test edelim
        Driver.getDriver().get("https://www.amazon.com");

        // url amazon iceriyor mu test edelim
        String expectedIcerik = "amazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test
    public void wiseTesti() throws InterruptedException {
        // wisequarter ana sayfaya gidip, wisequarter'a gittigimizi test edelim
        Driver.getDriver().get("https://www.wisequarter.com");
        Thread.sleep(2000);
        Driver.getDriver().navigate().refresh();

        // url wisequarter iceriyor mu test edelim
        String expectedIcerik = "wisequarter";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();


    }



}














