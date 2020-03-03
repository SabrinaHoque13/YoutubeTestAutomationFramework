Feature: Search something on the youtube homepage in youtube.com
  As a user I want to access the youtube homepage and search something
  So that I can view the channels and videos relevant to the searched words

  Scenario: Visit youtube.com and type something in to the search bar
    Given I am on youtube.com
    When I type something into the search bar and click the search button
    Then I will see videos and channels related to the searched items.
