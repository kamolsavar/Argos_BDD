package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver_Factory {

    private String browser="";
    public static WebDriver driver;

    public void openBrowser(){
        switch (browser){
            case"ie":
                driver=new InternetExplorerDriver();
                break;
            case"chrome":
                driver=new ChromeDriver();
                break;
            case"opera":
                driver=new OperaDriver();
                break;
            default:
                driver=new FirefoxDriver();
                break;
        }
    }

    public void closeBrowser(){
        driver.quit();
    }

    public void maximixeBrowser(){
        driver.manage().window().maximize();
    }

    public void navigate(String url){
        driver.get(url);
    }
    public void applyImplicitWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void sleep(int ms){
        try{
            Thread.sleep(ms);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
