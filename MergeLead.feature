Feature: Merge Lead in the LeafTaps Application

Background:
Given Open the Crome Browser
And Load the Application Url
Given Enter the Username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When click on Login button
Then HomePage should be displayed
When Click on CRMSFA link
And Click on Leads

Scenario: Merge Lead
Given Click on Merge Leads
Given Click on first lookup
Given Go to the new window
Given Enter the lead first name "lasya"
And Click on Search Leads
And Get the lead id
And Click on the Lead Record
And Go to main window
Given Click on second lookup
Given Go to the new window
Given Enter the lead first name "Varya"
And Click on Search Leads
And Click on the Lead Record
And Go to main window
Then Click on Merge Button
Then Accept the Alert
Given Click on Find Leads
Given Enter the LeadID
And Click on Search Leads
Then Verify the lead is merged