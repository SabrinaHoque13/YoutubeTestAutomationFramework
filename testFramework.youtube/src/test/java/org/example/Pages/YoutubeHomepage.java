package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YoutubeHomepage {
    private WebDriver driver;
    private String homepageUrl = "https://www.youtube.com/";
    private By searchBarID = By.id("search");
    private By searchButtonID = By.id("search-icon-legacy");
    public YoutubeHomepage (WebDriver driver) {
        this.driver = driver;
    }

    public YoutubeHomepage goToYoutubeHomepageURL(){
        driver.navigate().to(homepageUrl);
        return this;
    }
    public YoutubeHomepage inputSearch(String searchwords){
        driver.findElement(searchBarID).sendKeys(searchwords);
        return this;
    }
    public YoutubeHomepage clickSearchButton(){
        driver.findElement(searchButtonID).click();
        return this;
    }
}
