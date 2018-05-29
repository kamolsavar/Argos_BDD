package page_Object;

import drivers.Driver_Factory;
import org.openqa.selenium.By;

public class Header_Page extends Driver_Factory{

    public void doSearch(String Product) {
        driver.findElement(By.id("searchTerm")).sendKeys(Product);
        driver.findElement(By.className("argos-header__search-button") ).click();
        sleep(3000);
    }


}
