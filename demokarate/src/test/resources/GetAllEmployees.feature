Feature: This feature file tests GET method

Scenario: Test to post the employee details
Given url 'http://dummy.restapiexample.com/api/v1/create'
Given header Content-Type = ctype
And request {"name":"sam12344567678911","salary":"123","age":"23"}
When method post
Then status 200
* def expectedNumberofUsers = response.tokenId;
When match reponse == {id: '#notnull', name: 'sam12344567678911'}


