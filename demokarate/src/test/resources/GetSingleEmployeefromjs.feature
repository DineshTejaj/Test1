Feature: This feature file tests GET method

Scenario: Test to get the user details
Given url empurl+empno
When method get
Then status 200
And match response.id == '5343'
And match response.employee_name == 'sam1234456767891156'
* def res = response
* print res
* def eval res1 = response.id
* print res1

Scenario: Test to get the user details2
Given url empurl+res1
When method get
Then status 200
And match response.id == '5343'
And match response.employee_name == 'sam1234456767891156'
* def res = response.employee_name
* print res
