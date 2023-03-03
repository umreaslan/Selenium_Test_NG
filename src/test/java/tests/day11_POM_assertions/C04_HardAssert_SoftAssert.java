package tests.day11_POM_assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class C04_HardAssert_SoftAssert {


    @Test
    public  void  hardAssertionTesti(){

        Assert.assertTrue(5>8);
        Assert.assertFalse(8==8);
        Assert.assertEquals(5,8);
        Assert.assertNotEquals(6,6);
    }

    @Test
    public  void  softAssertionTesti(){

        /*
        Junitteki asser classi testNG de de vardir
        ancak bir test methodunda birden fazla failed olan assertion varsa
        ilk failed olan assertion  da calismayi durdurup exeption firlattigindan
        tum hatayi bir defa da gorup hepsini duzeltme sansimiz olmaz

        TestNG bunun icin bir alternatif uretmistir

        bu altenatifte assert class inda ki statik methodlari kullanmak yerine

        SoftAssert classindan bir obje olusturup
        o obje uzerinden istedigimiz testleri yapiyoruz

        softassert objesi ile yapilan assertion 'lar failed olsa da testimiz calismaya devam eder

        ancak testlerin sonucunu gormek istedigimizde
        softassert.assertAll ()ile tum yaptigi testleri raporlamasini soyleyebiliriz

        AssertAll () methodunun calistigi satirda
        exeption olabilir

         */

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(5>8, "true testi failed");
        softAssert.assertFalse(8==8,"false testi failed");
        softAssert.assertEquals(5,8,"equals  testi failed");
        softAssert.assertNotEquals(6,6,"not equals testi failed");


        softAssert.assertAll();
        Driver.closeDriver();
    }
}
