import org.testng.Assert;
import org.testng.annotations.Test;


public class LanguageTest extends BaseTest {

    @Test(priority = 1)
    public void testSetLanguage() throws InterruptedException{

        Thread.sleep(3000);
        ceHomePage.setLanguage();
        System.out.println("Dil değiştirme butonu testi başarılı!");
    }

    @Test(priority = 2)
    public void testGetWord1() throws InterruptedException{

        Thread.sleep(500);
        Assert.assertEquals(ceHomePage.getWord1(),"Academic Calendar", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarısız!");
    }

    @Test(priority = 3)
    public void testGetWord2() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord2(),"Accreditation", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }

    @Test(priority = 4)
    public void testGetWord3() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord3(),"Department Introduction Presentation", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }

    @Test(priority = 5)
    public void testGetWord4() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord4(),"Quality", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }

    @Test(priority = 6)
    public void testGetWord5() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord5(),"SIS", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarısız!");
        Thread.sleep(500);
    }

    @Test(priority = 7)
    public void testGetWord6() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord6(),"Project Coordinator", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }

    @Test(priority = 8)
    public void testGetWord7() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord7(),"Internship Documents", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }

    @Test(priority = 9)
    public void testGetWord8() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord8(),"Internship and Job Opportunities", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }

    @Test(priority = 10)
    public void testGetWord9() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord9(),"Erasmus Program", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }

    @Test(priority = 11)
    public void testGetWord10() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord10(),"Farabi Program", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }

    @Test(priority = 12)
    public void testGetWord11() throws InterruptedException{

        Assert.assertEquals(ceHomePage.getWord11(),"Mevlana Program", "Word value is not correct!");
        System.out.println("Kelime çeviri testi başarılı!");
        Thread.sleep(500);
    }
}
