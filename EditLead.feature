Feature: Edit Lead in the LeafTaps Application

Background:
Given Open the Crome Browser
And Load the Application Url
Given Enter the Username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When click on Login button
Then HomePage should be displayed
When Click on CRMSFA link
And Click on Leads

Scenario Outline: Edit Lead
Given Click on Find Leads
Given Click on Phone
Given Enter the phone <phNo>
And Click on Search Leads
And Click on the Lead Record
And Click on the Edit Button
Then Update the company name <company>
Then Click on Update Button


Examples:
|company|phNo|
|'wipro'|'976543210'|
|'Aspire'|'8283848586'|