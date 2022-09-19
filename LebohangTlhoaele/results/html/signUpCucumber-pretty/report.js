$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/SignUpForFocusInsights.feature");
formatter.feature({
  "name": "Sign Up To Receive Focus Insights",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user should be able to sign up to receive Focus insights successfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigates to the Investec website",
  "keyword": "Given "
});
formatter.step({
  "name": "user searches for \u003cCash Investment Rates information\u003e page",
  "keyword": "And "
});
formatter.step({
  "name": "user navigates to Understanding Cash Investment Interest Rates page",
  "keyword": "Then "
});
formatter.step({
  "name": "user is on the Understanding Cash Investment Interest Rates page",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on the sign up button",
  "keyword": "Then "
});
formatter.step({
  "name": "user inputs name \u003cname\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user inputs surname \u003csurname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user inputs email \u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on myself radio button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks the submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "user has signed up to receive Focus insights successfully",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "surname",
        "email",
        "Cash Investment Rates information"
      ]
    },
    {
      "cells": [
        "Lebohang",
        "Tlhoaele",
        "test@investec.co.za",
        "Cash Investment Rates"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user should be able to sign up to receive Focus insights successfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the Investec website",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefinition.user_navigates_to_the_Investec_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for Cash Investment Rates page",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinition.user_searches_for_Cash_Investment_Rates_information_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Understanding Cash Investment Interest Rates page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinition.user_navigates_to_Understanding_Cash_Investment_Interest_Rates_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Understanding Cash Investment Interest Rates page",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefinition.user_is_on_the_Understanding_Cash_Investment_Interest_Rates_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the sign up button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinition.user_clicks_on_the_sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs name Lebohang",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinition.user_inputs_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs surname Tlhoaele",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinition.user_inputs_surname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user inputs email test@investec.co.za",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinition.user_inputs_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on myself radio button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinition.user_clicks_on_myself_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinition.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has signed up to receive Focus insights successfully",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinition.user_has_signed_up_to_receive_Focus_insights_successfully()"
});
formatter.result({
  "status": "passed"
});
});