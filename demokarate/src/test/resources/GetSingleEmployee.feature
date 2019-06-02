Feature: This feature file tests GET method

Scenario: Test to get the user details
Given url 'http://dummy.restapiexample.com/api/v1/employee/5343'
When method get
Then status 200
And match response.id == '5343'
And match response.employee_name == 'sam12344567678911'



