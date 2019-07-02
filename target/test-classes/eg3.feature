Feature: signup
Scenario Outline: test signup functionality with diff input
Given user opens signup page
When user enters fn "<firstname>"
And user enters ln "<lastname>"
And user enters dob "<dob>"
And user enters pwd "<pwd>"
And user enters confirm pwd "<confirm_pwd>"
Then click signup button
And verify signup success msg

Examples:
|firstname|lastname|dob|pwd|confirm_pwd|
|saranya|shan|23/04/1995|abc123|abc123|
|fath|riz|11/02/1998|ab12|ab12|