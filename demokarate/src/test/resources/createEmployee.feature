Feature: This feature file tests for creating a resource
Scenario: Test to post the employee details
Given url 'http://dummy.restapiexample.com/api/v1/create'
And request {"name":"sam1234456767891156","salary":"123","age":"23"}
When method post
Then status 200
When match reponse == {id: '#notnull', name: 'sam1234456767891156'}
