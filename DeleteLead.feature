Feature: Delete Lead in the LeafTaps Application

Background:
Given Open the Crome Browser
And Load the Application Url
Given Enter the Username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When click on Login button
Then HomePage should be displayed
When Click on CRMSFA link
And Click on Leads

Scenario Outline: Delete Lead
Given Click on Find Leads
Given Click on Phone
Given Enter the phone <phNo>
And Click on Search Leads
And Get the lead id
And Click on the Lead Record
When Click on the Delete Button
Given Click on Find Leads
Given Enter the LeadID
And Click on Search Leads
Then Verify the lead is deleted

Examples:
|phNo|
|'7172737475'|