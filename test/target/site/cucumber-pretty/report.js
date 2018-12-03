$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("heroku.feature");
formatter.feature({
  "line": 3,
  "name": "Heroku Search Feature",
  "description": "",
  "id": "heroku-search-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Verify invalid email on registration",
  "description": "",
  "id": "heroku-search-feature;verify-invalid-email-on-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@heroku"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter name as \"testuser\" email as \u003cemail\u003e password as \"test12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click \u0027submit\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify invalid email address",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "heroku-search-feature;verify-invalid-email-on-registration;",
  "rows": [
    {
      "cells": [
        "email"
      ],
      "line": 15,
      "id": "heroku-search-feature;verify-invalid-email-on-registration;;1"
    },
    {
      "cells": [
        "test.com"
      ],
      "line": 16,
      "id": "heroku-search-feature;verify-invalid-email-on-registration;;2"
    },
    {
      "cells": [
        "test@test@test.com"
      ],
      "line": 17,
      "id": "heroku-search-feature;verify-invalid-email-on-registration;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on the Threely register page",
  "keyword": "Given "
});
formatter.match({
  "location": "HerokuSD.user_is_on_the_Threely_register_page()"
});
formatter.result({
  "duration": 5097182109,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify invalid email on registration",
  "description": "",
  "id": "heroku-search-feature;verify-invalid-email-on-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@heroku"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter name as \"testuser\" email as test.com password as \"test12345\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click \u0027submit\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify invalid email address",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "HerokuSD.i_click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HerokuSD.i_verify_invalid_email_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on the Threely register page",
  "keyword": "Given "
});
formatter.match({
  "location": "HerokuSD.user_is_on_the_Threely_register_page()"
});
formatter.result({
  "duration": 2091770460,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify invalid email on registration",
  "description": "",
  "id": "heroku-search-feature;verify-invalid-email-on-registration;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@heroku"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter name as \"testuser\" email as test@test@test.com password as \"test12345\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click \u0027submit\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify invalid email address",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "HerokuSD.i_click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HerokuSD.i_verify_invalid_email_address()"
});
formatter.result({
  "status": "skipped"
});
});