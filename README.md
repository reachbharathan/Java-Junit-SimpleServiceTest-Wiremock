# Simple Service Test using Wiremock
Project contains simple service test to validate get and post response.The framework construction is done in [testng](testng.org) in Java.
This project contains two simple service test to demonstrate how to write service test.
This project has a stub(a web service test double) called [**Wiremock**](https://github.com/tomakehurst/wiremock) in order to stimulate get and post response.

### Description
Two test have been configured in this sample project
 1. for verify_Get_UserDetails
 2. for verify_Post_AddNewUser

The sample stub can be extensified for different scenarios and tested accordingly.


###Libraries used
1. [restassured](http://rest-assured.io) for service validation
2. testng for framestructure
3. hamcrest for matching/comparison
4. maven for build and execution tool

### Steps to start the sample service
`cd Wiremock`

`java -jar wiremock-standalone-2.4.1.jar --verbose`

for more reference to wiremock, please have a look into wiremock github - [tomakehurst](https://github.com/tomakehurst/wiremock)

### Steps to execute the test
execute `mvn clean test` in the current folder


#### Note
1. Since there is no DB configured the delete and put operation are not provided in the example.
2. This is just a sample project feel free to add more tests and mocks if interested.