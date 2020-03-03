package org.example.ProjectTests.YoutubeSiteTest;

import org.example.Pages.YoutubeSite;
import org.example.SeleniumConfig.SeleniumConfig;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.beans.BeanProperty;

public class YoutubeSiteTest {
    private static SeleniumConfig seleniumConfig;
    private static YoutubeSite youtubeSite;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\sabri\\OneDrive\\Documents\\Java\\chromedriver_win32\\chromedriver.exe" );
        youtubeSite = new YoutubeSite(seleniumConfig.getDriver());
    }
    @Test
    public void checkURLisOpened(){
        youtubeSite.getYoutubeHomepage().goToYoutubeHomepageURL();
        Assert.assertEquals("https://www.youtube.com/",seleniumConfig.getDriver().getCurrentUrl());

    }
    @Test
    public void searchYoutube(){
        youtubeSite.getYoutubeHomepage().goToYoutubeHomepageURL().inputSearch("unbox therapy").clickSearchButton();
        Assert.assertEquals("https://www.youtube.com/results?search_query=unbox+therapy", seleniumConfig.getDriver().getCurrentUrl());
    }
}
