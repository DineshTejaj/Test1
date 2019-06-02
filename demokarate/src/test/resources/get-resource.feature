Feature: This feature file tests GET method

Scenario: Test to get the user details
* def expectedNumberofUsers = 10;
Given url baseUrl
And path 'users'
When method get
Then status 200
* def actualNumberofUsers = response.length
And match actualNumberofUsers == expectedNumberofUsers