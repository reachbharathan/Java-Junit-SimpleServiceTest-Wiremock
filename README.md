# Java Junit Simple Service Test
This project contains two simple service test to demonstrate how to write service test.
This project has a stub(a web service test double) creator[**Wiremock**](https://github.com/tomakehurst/wiremock) in order to showcase a simple service.

### Description
Two test have been configured in this sample project
 1. for verify_Get_UserDetails
 2. for verify_Post_AddNewUser

The sample stub can be extensified for different scenarios and tested accordingly


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

