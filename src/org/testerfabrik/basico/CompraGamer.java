package org.testerfabrik.basico;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompraGamer {
    static  WebDriver driver;

    public static void main(String[] args){

        try{
        String baseURL= "https://compragamer.com/";
        String actualResult = "";
        String expectedResult="COMPRA GAMER | Compra Gamer";


        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        driver=new ChromeDriver();

        driver.get(baseURL);

        actualResult = driver.getTitle();

        System.out.println(actualResult.contentEquals(expectedResult)?"TEST OK = " + actualResult : "TEST FAIL");
            WebElement modalAceptar= driver.findElement(By.id("aceptarNotificacion"));
            modalAceptar.click();
            WebElement busqueda = driver.findElement(By.id("searchQuery"));
            busqueda.click();
    }catch (NoSuchElementException NSEE){
            System.err.println("nosuchelementexception" + NSEE);
        }catch (WebDriverException WDE){
            System.err.println("WebDriverException" + WDE);
        }catch (Exception ex){
            System.err.println(ex);
        }finally {
            driver.close();
        }
    }
}