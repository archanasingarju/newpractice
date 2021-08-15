Feature: Sign in testcases

Scenario Outline: SignIn Testcase001
Given Open browser Navigate to "http://www.automationpractice.com"
When Click on the ContactUs
When user fills the form using Sheet name <Sheetname> and rowno <Rowno>
#When click on submit button
#Then it show a successfull message "Your message has been successfully sent to our team."
Examples:
|Sheetname |Rowno|
|contact|0|
