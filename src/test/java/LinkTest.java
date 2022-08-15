import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

    @Test(priority = 1)
    public void testClickAnasayfaButton() throws InterruptedException {

        ceHomePage.navigationBar().clickAnasayfaButton();
        String URL = driver.getCurrentUrl(); Assert.assertEquals(URL, "https://ce.yildiz.edu.tr/" );
        System.out.println("Anasayfa linki çalışıyor!");
    }


    @Test(priority = 2)
    public void testClickEtkinliklerButton() throws InterruptedException{

        ceHomePage.navigationBar().clickEtkinliklerButton();
        String URL = driver.getCurrentUrl(); Assert.assertEquals(URL, "https://ce.yildiz.edu.tr/etkinlikler" );
        System.out.println("Etkinlikler linki çalışıyor!");
    }


    @Test(priority = 3)
    public void testClickHaberlerButton() throws InterruptedException{

        ceHomePage.navigationBar().clickHaberlerButton();
        String URL = driver.getCurrentUrl(); Assert.assertEquals(URL, "https://ce.yildiz.edu.tr/haberler" );
        System.out.println("Haberler linki çalışıyor!");
    }


    @Test(priority = 4)
    public void testElementFindBolum() throws InterruptedException {

        ceHomePage.navigationBar().elementFindBolum();
    }

    @Test(priority = 5)
    public void testElementFindPersonel() throws InterruptedException{

        ceHomePage.navigationBar().elementFindPersonel();
    }

    @Test(priority = 6)
    public void testElementFindEgitim() throws InterruptedException{

        ceHomePage.navigationBar().elementFindEgitim();
    }

    @Test(priority = 7)
    public void testElementFindArastirma() throws InterruptedException{

        ceHomePage.navigationBar().elementFindArastirma();
    }

    @Test(priority = 8)
    public void testElementFindOgrenci() throws InterruptedException{

        ceHomePage.navigationBar().elementFindOgrenci();
    }
}
