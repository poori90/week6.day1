Feature: Create Lead Functionality in LeafTaps

Background:
Given Open the Crome Browser
And Load the Application Url
And Enter the Username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When click on Login button
Then HomePage should be displayed
When Click on CRMSFA link
And Click on Leads

Scenario Outline: Create Lead with Mandatory Information

Given Click Create Lead
And Enter the Company name <company>
And Enter the First Name <firstname>
And Enter the Last Name <lastname>
And Enter the phone number <phno>
When Click on submit button
Then Lead created successfully


Examples: 
|company|firstname|lastname|phno|
|'wipro'|'lasya'|'reddy'|'976543210'|
|'Aspire'|'Thanishka'|'reddy'|'8283848586'|
|'Infosys'|'Varya'|'reddy'|'7172737475'|
