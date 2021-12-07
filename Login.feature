Feature: Login Functionaloty for LeafTaps Application

Background:
Given Open the Crome Browser
And Load the Application Url	
	
Scenario Outline: Login using Postive Credentials

And Enter the Username as <username>
And Enter the Password as <password> 
When click on Login button
Then HomePage should be displayed

Examples:  
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: Login using Negative Credentials
And Enter the Username as 'Demo'
And Enter the Password as 'crmsfa'
When click on Login button
But Error Message should be displayed


