$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/eg3.feature");
formatter.feature({
  "name": "signup",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "test signup functionality with diff input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens signup page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters fn \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters ln \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters dob \"\u003cdob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters pwd \"\u003cpwd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters confirm pwd \"\u003cconfirm_pwd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify signup success msg",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "dob",
        "pwd",
        "confirm_pwd"
      ]
    },
    {
      "cells": [
        "saranya",
        "shan",
        "23/04/1995",
        "abc123",
        "abc123"
      ]
    },
    {
      "cells": [
        "fath",
        "riz",
        "11/02/1998",
        "ab12",
        "ab12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "test signup functionality with diff input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "Diff_ip.user_opens_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters fn \"saranya\"",
  "keyword": "When "
});
formatter.match({
  "location": "Diff_ip.user_enters_fn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ln \"shan\"",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.user_enters_ln(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dob \"23/04/1995\"",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.user_enters_dob(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters pwd \"abc123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.user_enters_pwd(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters confirm pwd \"abc123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.user_enters_confirm_pwd(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Diff_ip.click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify signup success msg",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.verify_signup_success_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "test signup functionality with diff input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "Diff_ip.user_opens_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters fn \"fath\"",
  "keyword": "When "
});
formatter.match({
  "location": "Diff_ip.user_enters_fn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ln \"riz\"",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.user_enters_ln(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dob \"11/02/1998\"",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.user_enters_dob(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters pwd \"ab12\"",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.user_enters_pwd(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters confirm pwd \"ab12\"",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.user_enters_confirm_pwd(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Diff_ip.click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify signup success msg",
  "keyword": "And "
});
formatter.match({
  "location": "Diff_ip.verify_signup_success_msg()"
});
formatter.result({
  "status": "passed"
});
});