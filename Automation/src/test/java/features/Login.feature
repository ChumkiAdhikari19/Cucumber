Feature: Applicaion Login

//Background:
//Given validate the browser
//When Browser is triggers
//Then check if browser is started


@WebTest
Scenario: home page default login
Given User is on Landing page
When User login into application with "jin" and password "12345"
Then Home page is populated
And Cards disaplayed are "true"

@MobileTest
Scenario: home page default login
Given User is on Landing page
When User login into application with "jhon" and password "4321"
Then Home page is populated
And Cards disaplayed are "false"

@SmokeTest
Scenario: home page default login
Given User is on Landing page
When User signup with following details
|jenny |abc |jenny@abc.com | Canada |1234566547 |
Then Home page is populated
And Cards disaplayed are "false"

@WebTest
Scenario Outline: home page default login   //execute multiple time with diff data
Given User is on Landing page
When User login in to application with <Username> and password <Password>
Then Home page is populated
And Cards disaplayed are "true"

Examples:
| Username | Password |
|User1     | pass1    |
|User2     | pass2    |
|User3     | pass3    |
