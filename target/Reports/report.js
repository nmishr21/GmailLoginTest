$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Gmail.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail Testing",
  "description": "",
  "id": "gmail-testing",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on the gmail Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user has entered the username",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefintion.user_is_on_the_gmail_Login_page()"
});
formatter.result({
  "duration": 15469865277,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_has_entered_the_username()"
});
formatter.result({
  "duration": 3119956468,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Compose Email",
  "description": "",
  "id": "gmail-testing;compose-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user has entered the password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is on gmail page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user has clicked on the compose button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user has filled the to subject content",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user has clicked on the sent button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefintion.user_has_entered_the_password()"
});
formatter.result({
  "duration": 4426785374,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_is_on_gmail_page()"
});
formatter.result({
  "duration": 37207328583,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_has_clicked_on_the_compose_button()"
});
formatter.result({
  "duration": 3187929091,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_has_filled_the_to_subject_content()"
});
formatter.result({
  "duration": 11690062711,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_has_clicked_on_the_sent_button()"
});
formatter.result({
  "duration": 961772749,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on the gmail Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user has entered the username",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefintion.user_is_on_the_gmail_Login_page()"
});
formatter.result({
  "duration": 14056245523,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_has_entered_the_username()"
});
formatter.result({
  "duration": 3469710906,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Gmail logout",
  "description": "",
  "id": "gmail-testing;gmail-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user has entered the password",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user is on gmail page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user sees the logout button visible",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user clicks on logout",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefintion.user_has_entered_the_password()"
});
formatter.result({
  "duration": 5403621529,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_is_on_gmail_page()"
});
formatter.result({
  "duration": 37378137836,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_sees_the_logout_button_visible()"
});
formatter.result({
  "duration": 1820877352,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_clicks_on_logout()"
});
formatter.result({
  "duration": 6690240174,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_closes_the_browser()"
});
formatter.result({
  "duration": 3142439968,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on the gmail Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user has entered the username",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefintion.user_is_on_the_gmail_Login_page()"
});
formatter.result({
  "duration": 12858118935,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.user_has_entered_the_username()"
});
formatter.result({
  "duration": 4486690057,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Negative Scenario",
  "description": "",
  "id": "gmail-testing;negative-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user has entered wrong password",
  "keyword": "But "
});
formatter.step({
  "line": 23,
  "name": "wrong password message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefintion.user_has_entered_wrong_password()"
});
formatter.result({
  "duration": 4038964899,
  "status": "passed"
});
formatter.match({
  "location": "stepDefintion.wrong_password_message_is_displayed()"
});
formatter.result({
  "duration": 3032138344,
  "status": "passed"
});
});