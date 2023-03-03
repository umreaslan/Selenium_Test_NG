package tests.day12_xmlFiles;


import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverSingletonPattern {


    @Test
    public  void  test01(){


        /*

        POM webdriver olarak driver class'indaki
        getdriver() methodunun kullanilmasi uzerine kurgulanmistir

        Driver.getdriver();

        Driver class'inin obje olusturularak kullanilmasini engellemek icin
        POM tasarlayanlar bir onlem koymak istemisler

        Java'da bir class'tan obje olusturulmasini engellemk isterseniz
        SINGLETON PATTERN kullanabilirsiniz

        Singleton pattern :bir class'tan obje olusturulmasini engellemek veya sinirlamak
                      icin kullanilan bir yontemdir

        temel fikir obje olusturmak icin kullanilan default cons.yerine gorunur
        parametresiz bir cons.olusturp bu cons.un accesmodifier 'ini privite yapip
        kullanilmasini engellemektir




         */

       // Driver objeDriver=new Driver();
    }
}
