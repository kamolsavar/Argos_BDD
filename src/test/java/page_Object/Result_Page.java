package page_Object;

import drivers.Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Result_Page extends Driver_Factory {
    public void selectFilter(String filterValue) {
    List<WebElement> allFilters=   driver.findElements(By.className("ac-facet__label"));
    for (WebElement filter: allFilters){
        if (filter.getText().equalsIgnoreCase(filterValue)){
            filter.click();
            break;
        }
    }
        sleep(5000);
    }
    public List<Double>getAllReviewRating(){
        List<Double>collectedRatings=new ArrayList<>();
        List<WebElement>ratings=driver.findElements(By.cssSelector(".ac-star-rating"));

        for (WebElement rating:ratings){
            String ratingString=rating.getAttribute("data-star-rating");
            Double ratingInDouble=Double.parseDouble(ratingString);
            collectedRatings.add(ratingInDouble);
        }
        return collectedRatings;
    }
}
