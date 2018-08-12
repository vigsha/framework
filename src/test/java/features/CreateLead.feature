Feature: CreateLead testcase

Background:
Given launchBrowser 
And maximizethepage 
And load the URL
And Set the Timeout
And Enter the user name as DemoSalesManager
And Enter the password as crmsfa
And click on the login button
And Click on CRMSFA link

@smoke
Scenario: lead creation with first data negative data
Given click on createlead menu
And Enter the compnyName as TCS
And Enter theLastname lakshmi
When click on CreateLeadButton
Then close the browser  

@sanity
Scenario Outline: CreateLead with second Data positive 

Given click on createlead menu
And Enter the compnyName as <cName>
And Enter the firstName as <fName>
And Enter theLastname as <lName>
When click on CreateLeadButton
Then close the browser

Examples:
|cName|fName|lName|
|TCS|Vignesh|R|   
