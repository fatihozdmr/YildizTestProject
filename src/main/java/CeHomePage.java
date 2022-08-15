import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class CeHomePage {

    private WebDriver driver ;
    private By language = By.xpath("//div/span[contains(text() , 'English')]");
    private By word1 = By.xpath("//div/a[contains(text() , 'Akademik Takvim')]");
    private By search = By.className("input");
    private By word2 = By.xpath("//div/a[contains(text() , 'Accreditation')]");
    private By word3 = By.xpath("//div/a[contains(text() , 'Department Introduction Presentation')]");
    private By word4 = By.xpath("//div/a[contains(text() , 'Quality')]");
    private By word5 = By.xpath("//div/a[contains(text() , 'OBS')]");
    private By word6 = By.xpath("//div/a[contains(text() , 'Project Coordinator')]");
    private By word7 = By.xpath("//div/a[contains(text() , 'Internship Documents')]");
    private By word8 = By.xpath("//div/a[contains(text() , 'Staj ve İş İmkanları')]");
    private By word9 = By.xpath("//div/a[contains(text() , 'Erasmus Program')]");
    private By word10 = By.xpath("//div/a[contains(text() , 'Farabi Program')]");
    private By word11 = By.xpath("//div/a[contains(text() , 'Mevlana Program')]");
    private By links = By.xpath("//div[@class='links']/a");


    private NavigationBar navigationBar;

    public CeHomePage(WebDriver driver){
        this.driver = driver;
        navigationBar = new NavigationBar(driver);
    }

    public NavigationBar navigationBar(){
        return this.navigationBar;
    }


    public void setLanguage(){
        WebElement languageButton = driver.findElement(language);
        languageButton.click();
    }
    public String getWord1(){
        WebElement wordChange = driver.findElement(word1);
        return wordChange.getText();
    }
    public String getWord2(){
        WebElement wordChange = driver.findElement(word2);
        return wordChange.getText();
    }
    public String getWord3(){
        WebElement wordChange = driver.findElement(word3);
        return wordChange.getText();
    }
    public String getWord4(){
        WebElement wordChange = driver.findElement(word4);
        return wordChange.getText();
    }
    public String getWord5(){
        WebElement wordChange = driver.findElement(word5);
        return wordChange.getText();
    }
    public String getWord6(){
        WebElement wordChange = driver.findElement(word6);
        return wordChange.getText();
    }
    public String getWord7(){
        WebElement wordChange = driver.findElement(word7);
        return wordChange.getText();
    }
    public String getWord8(){
        WebElement wordChange = driver.findElement(word8);
        return wordChange.getText();
    }
    public String getWord9(){
        WebElement wordChange = driver.findElement(word9);
        return wordChange.getText();
    }
    public String getWord10(){
        WebElement wordChange = driver.findElement(word10);
        return wordChange.getText();
    }
    public String getWord11(){
        WebElement wordChange = driver.findElement(word11);
        return wordChange.getText();
    }



    public void setSearch(String searchAsString){
        WebElement searchWord = driver.findElement(search);
        searchWord.click();
        searchWord.sendKeys(searchAsString);
    }


    public void anasayfaLinks() throws InterruptedException {
        Thread.sleep(2000);
        WebElement clickLinks = driver.findElement(links);

        Actions action = new Actions(driver);

        clickLinks.click();
        Thread.sleep(2000);
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@class='links']/a"));
        WebElement link;
        for (int i=0; i<tabs.size(); i++){
            link = tabs.get(i);

            action.keyDown(Keys.CONTROL).moveToElement(link).click().perform();
          /*link.click(); */
            Thread.sleep(2000);
            System.out.println(link.getText());
            System.out.println("linke tıkladı !");
        }

    }

}
