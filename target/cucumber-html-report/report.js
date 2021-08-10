$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LeagueTest.feature");
formatter.feature({
  "line": 1,
  "name": "Verify selection of league,team and verify details screen",
  "description": "",
  "id": "verify-selection-of-league,team-and-verify-details-screen",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User chooses a league and verify league details",
  "description": "",
  "id": "verify-selection-of-league,team-and-verify-details-screen;user-chooses-a-league-and-verify-league-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Verify that league \"\u003cleague\u003e\" is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on \"\u003cleague\u003e\" league",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on continue",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify that team \"\u003cteam\u003e\" is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on \"\u003cteam\u003e\" team",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on continue on choose team",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be on favourites tab on home screen",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User should see label \"\u003clabel\u003e\" is present",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on \"\u003clabel\u003e\" label",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should see title \"\u003cleague\u003e\" as expected",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on standings tab",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User should see that standings tab is selected",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should see that team \"\u003cteam\u003e\" standings is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks back button from standings",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User should see label \"\u003clabel\u003e\" is present",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should see search bar",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "verify-selection-of-league,team-and-verify-details-screen;user-chooses-a-league-and-verify-league-details;",
  "rows": [
    {
      "cells": [
        "league",
        "",
        "team",
        "",
        "label"
      ],
      "line": 24,
      "id": "verify-selection-of-league,team-and-verify-details-screen;user-chooses-a-league-and-verify-league-details;;1"
    },
    {
      "cells": [
        "NHL Hockey",
        "",
        "Montreal Canadiens",
        "",
        "NHL"
      ],
      "line": 25,
      "id": "verify-selection-of-league,team-and-verify-details-screen;user-chooses-a-league-and-verify-league-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 31056414300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User clicks on Get started",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User clicks on get started button",
  "keyword": "When "
});
formatter.match({
  "location": "LandingScreenStepDefs.user_clicks_on_get_started_button()"
});
formatter.result({
  "duration": 772842700,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User chooses a league and verify league details",
  "description": "",
  "id": "verify-selection-of-league,team-and-verify-details-screen;user-chooses-a-league-and-verify-league-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Verify that league \"NHL Hockey\" is displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on \"NHL Hockey\" league",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on continue",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify that team \"Montreal Canadiens\" is displayed",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on \"Montreal Canadiens\" team",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on continue on choose team",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be on favourites tab on home screen",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User should see label \"NHL\" is present",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on \"NHL\" label",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should see title \"NHL Hockey\" as expected",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on standings tab",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User should see that standings tab is selected",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should see that team \"Montreal Canadiens\" standings is displayed",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks back button from standings",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User should see label \"NHL\" is present",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should see search bar",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "NHL Hockey",
      "offset": 20
    }
  ],
  "location": "ChooseLeagueScreenStepDefs.verify_league_is_displayed(String)"
});
formatter.result({
  "duration": 2183408100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NHL Hockey",
      "offset": 16
    }
  ],
  "location": "ChooseLeagueScreenStepDefs.user_clicks_on_league(String)"
});
formatter.result({
  "duration": 460057000,
  "status": "passed"
});
formatter.match({
  "location": "ChooseLeagueScreenStepDefs.user_clicks_on_continue()"
});
formatter.result({
  "duration": 2695635300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Montreal Canadiens",
      "offset": 18
    }
  ],
  "location": "ChooseTeamScreenStepDefs.verify_team_is_displayed(String)"
});
formatter.result({
  "duration": 310266700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Montreal Canadiens",
      "offset": 16
    }
  ],
  "location": "ChooseTeamScreenStepDefs.user_clicks_on_team(String)"
});
formatter.result({
  "duration": 356264900,
  "status": "passed"
});
formatter.match({
  "location": "ChooseTeamScreenStepDefs.user_clicks_on_continue_on_choose_team()"
});
formatter.result({
  "duration": 2529465300,
  "status": "passed"
});
formatter.match({
  "location": "HomeScreenStepDefs.user_should_be_on_favourites_tab_n_home_screen()"
});
formatter.result({
  "duration": 3480885700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NHL",
      "offset": 23
    }
  ],
  "location": "HomeScreenStepDefs.user_should_see_label_is_present(String)"
});
formatter.result({
  "duration": 291409000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NHL",
      "offset": 16
    }
  ],
  "location": "HomeScreenStepDefs.user_clicks_on_label(String)"
});
formatter.result({
  "duration": 316480000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NHL Hockey",
      "offset": 23
    }
  ],
  "location": "LeagueDetailsScreenStepDefs.user_should_see_title_as_expected(String)"
});
formatter.result({
  "duration": 1568820900,
  "status": "passed"
});
formatter.match({
  "location": "LeagueDetailsScreenStepDefs.user_clicks_on_standings_tab()"
});
formatter.result({
  "duration": 2294550400,
  "status": "passed"
});
formatter.match({
  "location": "LeagueDetailsScreenStepDefs$StandingsScreenStepDefs.user_should_see_that_standings_tab_is_selected()"
});
formatter.result({
  "duration": 334433000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Montreal Canadiens",
      "offset": 27
    }
  ],
  "location": "LeagueDetailsScreenStepDefs$StandingsScreenStepDefs.user_should_see_that_team_standings_is_displayed(String)"
});
formatter.result({
  "duration": 111154600,
  "status": "passed"
});
formatter.match({
  "location": "LeagueDetailsScreenStepDefs$StandingsScreenStepDefs.user_clicks_back_button_from_standings()"
});
formatter.result({
  "duration": 1498958800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NHL",
      "offset": 23
    }
  ],
  "location": "HomeScreenStepDefs.user_should_see_label_is_present(String)"
});
formatter.result({
  "duration": 172151900,
  "status": "passed"
});
formatter.match({
  "location": "HomeScreenStepDefs.user_should_see_search_bar()"
});
formatter.result({
  "duration": 89331500,
  "status": "passed"
});
formatter.after({
  "duration": 581962300,
  "status": "passed"
});
});