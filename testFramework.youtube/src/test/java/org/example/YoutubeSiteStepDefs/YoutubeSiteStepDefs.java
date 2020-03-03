package org.example.YoutubeSiteStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.example.Pages.SearchedPage;
import org.example.Pages.YoutubeSite;
import org.example.SeleniumConfig.SeleniumConfig;
import org.junit.Assert;

public class YoutubeSiteStepDefs {
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\sabri\\OneDrive\\Documents\\Java\\chromedriver_win32\\chromedriver.exe");
    private YoutubeSite youtubeSite = new YoutubeSite(seleniumConfig.getDriver());


    @Given("I am on youtube.com")
    public void i_am_on_youtube_com() {
        youtubeSite.getYoutubeHomepage().goToYoutubeHomepageURL();
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I type something into the search bar and click the search button")
    public void i_type_something_into_the_search_bar_and_click_the_search_button() {
        youtubeSite.getYoutubeHomepage().goToYoutubeHomepageURL().inputSearch("unbox therapy").clickSearchButton();
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Then("I will see videos and channels related to the searched items.")
    public void i_will_see_videos_and_channels_related_to_the_searched_items() {
        youtubeSite.getSearchedPage().goToSearchedPageURL();
        Assert.assertEquals("https://www.youtube.com/results?search_query=unbox+therapy", seleniumConfig.getDriver().getCurrentUrl());
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
}

