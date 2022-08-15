import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.lang.InterruptedException;


public class NavigationBar {

    private WebDriver driver ;
    private By anasayfa = By.xpath("//li[@class='menu-items__item menu-items__item--active']/a[contains(text(),'Anasayfa')]");
    private By etkinlikler = By.xpath("//div//ul//li/a[contains(text() , 'Etkinlikler')]");
    private By haberler = By.xpath("*//li/a[contains(text() , 'Haberler')]");
    private By bolum = By.xpath("//li[@class='menu-items__item ']/span[contains(text() , 'Bölüm')]");
    private By personel = By.xpath("//li[@class='menu-items__item ']/span[contains(text() , 'Personel')]");
    private By egitim = By.xpath("//li[@class='menu-items__item ']/span[contains(text() , 'Eğitim' )]");
    private By arastirma = By.xpath("//li[@class='menu-items__item ']/span[contains(text() , 'Araştırma')]");
    private By ogrenci = By.xpath("//li[@class='menu-items__item ']/span[contains(text() , 'Öğrenci')]");

    private By find = By.xpath("//div[@class='menu-items__item__sub-items__item ']");

    public NavigationBar(WebDriver driver){
        this.driver = driver;
    }


    public void clickAnasayfaButton() throws InterruptedException{
        Thread.sleep(2000);
        WebElement clickAnasayfa = driver.findElement(anasayfa);
        clickAnasayfa.click();
        Thread.sleep(2000);
    }

    public void clickEtkinliklerButton() throws InterruptedException {
        WebElement clickEtkinlikler = driver.findElement(etkinlikler);
        clickEtkinlikler.click();
        Thread.sleep(2000);
    }

    public void clickHaberlerButton() throws InterruptedException{
        WebElement clickHaberler = driver.findElement(haberler);
        clickHaberler.click();
        Thread.sleep(2000);
    }

    public void elementFindBolum() throws InterruptedException {
        WebElement clickBolum = driver.findElement(bolum);
        clickBolum.click();
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@class='menu-items__item__sub-items__item ']"));
        WebElement bol;
        for (int i = 0; i<tabs.size(); i++) {
            bol = tabs.get(i);
            bol.click();
            Thread.sleep(2000);
            System.out.println(bol.getText());
            System.out.println("linke tıkladı !");
        }

    }


    public void elementFindPersonel() throws InterruptedException {
        WebElement clickPersonel = driver.findElement(personel);
        clickPersonel.click();
        Thread.sleep(2000);
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@class='menu-items__item__sub-items__item ']"));
        WebElement per;
        for (int i=0; i<tabs.size(); i++){
            per = tabs.get(i);
            per.click();
            Thread.sleep(2000);
            System.out.println(per.getText());
            System.out.println("linke tıkladı !");
        }
    }

    public void elementFindEgitim() throws InterruptedException {
        WebElement clickEgitim = driver.findElement(egitim);
        clickEgitim.click();
        Thread.sleep(2000);
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@class='menu-items__item__sub-items__item menu-items__item__sub-items__item--menu ']"));
        WebElement egit;
        for (int i=0; i<tabs.size(); i++){
            egit = tabs.get(i);
            egit.click();
            Thread.sleep(2000);
            System.out.println(egit.getText());
            System.out.println("linke tıkladı !");
        }
    }

    public void elementFindArastirma() throws InterruptedException {
        WebElement clickArastirma = driver.findElement(arastirma);
        clickArastirma.click();
        Thread.sleep(2000);
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@class='menu-items__item__sub-items__item ']"));
        WebElement ara;
        for (int i=0; i<tabs.size(); i++){
            ara = tabs.get(i);
            ara.click();
            Thread.sleep(2000);
            System.out.println(ara.getText());
            System.out.println("linke tıkladı !");
        }
    }

    public void elementFindOgrenci() throws InterruptedException {
        WebElement clickOgrenci = driver.findElement(ogrenci);
        clickOgrenci.click();
        Thread.sleep(2000);
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@class='menu-items__item__sub-items__item ']"));
        WebElement ogr;
        for (int i=0; i<tabs.size(); i++){
            ogr = tabs.get(i);
            ogr.click();
            Thread.sleep(2000);
            System.out.println(ogr.getText());
            System.out.println("linke tıkladı !");
        }

    }


}



