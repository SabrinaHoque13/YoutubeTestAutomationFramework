package org.example.Pages;

import org.openqa.selenium.WebDriver;

public class YoutubeSite {
    private WebDriver driver;
    private YoutubeHomepage youtubeHomepage;
    private SearchedPage searchedPage;
    private UnboxTherapyPage unboxTherapyPage;

    public YoutubeSite (WebDriver driver){
        this.driver = driver;
        this.youtubeHomepage = new YoutubeHomepage(driver);
        this.searchedPage = new SearchedPage(driver);
        this.unboxTherapyPage = new UnboxTherapyPage(driver);

    }
    public WebDriver getDriver() {
        return driver;
    }

    public YoutubeHomepage getYoutubeHomepage() {
        return youtubeHomepage;
    }

    public SearchedPage getSearchedPage() {
        return searchedPage;
    }

    public UnboxTherapyPage getUnboxTherapyPage() {
        return unboxTherapyPage;
    }
}
