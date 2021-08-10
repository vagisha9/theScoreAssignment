    Feature: Verify selection of league,team and verify details screen

    Background: User clicks on Get started
        When User clicks on get started button

    Scenario Outline: User chooses a league and verify league details
        Then Verify that league "<league>" is displayed
        And User clicks on "<league>" league
        And User clicks on continue
        And Verify that team "<team>" is displayed
        Then User clicks on "<team>" team
        And User clicks on continue on choose team
        Then User should be on favourites tab on home screen
        And User should see label "<label>" is present
        And User clicks on "<label>" label
        And User should see title "<league>" as expected
        Then User clicks on standings tab
        And User should see that standings tab is selected
        And User should see that team "<team>" standings is displayed
        Then User clicks back button from standings
        And User should see label "<label>" is present
        And User should see search bar
        Examples:
        |league|          |team|                 |label|
        |NHL Hockey|      |Montreal Canadiens|   |NHL  |


