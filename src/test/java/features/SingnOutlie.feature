#using scenario outlie
Feature: Sign in testcases

Scenario Outline: SignIn Testcase04
Given Open browser Navigate to "http://www.automationpractice.com"
When Click on the SignIn link
When user login in to application with username <Username> and password <Password>
Then Veirfy MyAccount Page displayed or not
		Examples:
		|Username				|Password|
		|santosh@test.com		|123456	|
		|digitalcutlet@test.com	|123456	|
		|teja@test.com			|123456	|
		|archana.s56@gmail.com	|123456	|