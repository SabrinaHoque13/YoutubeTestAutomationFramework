package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchedPage {
    private WebDriver driver;
    private String SearchedPageUrl = "https://www.youtube.com/results?search_query=unbox+therapy";

    public SearchedPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchedPage goToSearchedPageURL() {
        driver.navigate().to(SearchedPageUrl);
        return this;
    }


}
