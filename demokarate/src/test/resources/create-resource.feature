Feature: This feature file tests for creating a resource

Scenario: Test scenario to create a resource
* def expectedNumberofUsers = 10;
* def payload = 
"
{
      title: 'testTitle',
      body: 'Post creation body',
      userId: 1
      
}
"
Given url baseUrl
And path 'posts'
And header "Content-type" = "application/json"
And request payload
When method post
Then status 201

And match response.title == 'testTitle'
And match response.body == 'Post creation body'
And match response.userId == 1
