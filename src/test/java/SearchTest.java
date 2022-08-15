import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void testSetSearch() throws InterruptedException{
        Thread.sleep(2000);
        ceHomePage.setSearch("bilgisayar");
        System.out.println("Başarılı!");
        Thread.sleep(5000);
        System.out.println("Dil değiştirme butonu testi başarılı!");
    }
}
