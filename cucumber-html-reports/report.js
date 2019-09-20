$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:package1/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success Login with actual values",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter \"sam\" and \"abcd123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.enter_user_name_in_the_userid_field(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login buttin",
  "keyword": "When "
});
formatter.match({
  "location": "Step.click_on_login_buttin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});