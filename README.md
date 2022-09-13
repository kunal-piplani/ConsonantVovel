# Interview Exercise for Agile QA role

Please note while taking this test, do not mention 90 Percent of Everything or 90poe anywhere on the code or repository name.

Clone this repo in your private git space. Once done, please add github username: shilpa-sethi as a collaborator/ reviewer.
While submitting please ensure to add a README explaining how to run the test and all related info.

## Testing Task
Product Owner wants a feature as described below. The developer has added the code and share with you as a QA for review/ testing.

### Feature

As a user I want to be able to add a list of strings. 
I want to see the number of vowels in each of the strings that I have entered.

### Acceptance Criteria

1. I should see the number of vowels and consonant for each string in the order they are keyed in.
2. I should be able to add up to 4 strings at once.

### QA Task

1. Review the user story and prepare a list of questions/ assumptions.
2. Review the code and provide feedback/ improvements. 
3. Extend the program to return the number of consonants for each string array passed.
4. Use BDD/ Cucumber to add test cases to test the program for both vowels and consonants.
5. Report any bugs you find. Include as much information as necessary and add the feedback as a file to the repo along with the Cucumber Test Report.

Bonus points if you can add failing test cases for the bugs you find. 

## Evaluation Points

1. Use of Git.
2. Use of BDD/TDD/Cucumber.
3. Code Review skills.
4. Coding skills.
5. Test Case Coverage.

## Time limits

There are no hard time limits. We suggest not to spend more than ~2 hours.

#################################################################################################################
# Cucumber Test Framework
## Author_Kunal_
#################################################################################################################
This is automation test Framework to Verify the consonant and Vowel Count In the Framework.
## Framework Details

- Maven
- Cucumber

##Cucumber  Features

- verify Vowel and Consonant  in the String(Positive Scenario)
-  verify Vowels in the String greater than 4 Length
- verify Vowels in the String  0 Length(Negative Scenario)

## dependencies Used
1) cucumber-java version : 1.0.2
2) cucumber-junit version : 1.0.2
3) junit version :  4.10

## Installation

Framework Requires Maven project to be imported 

below are the commands .

```sh
import maven Project 
Run Runner File inside src/test/java 
```
## Issues 
issues are in file src/test/resources
## Questions 
Questions are in file src/test/resources
## Future Enhancement 

- need to integrate the project in CI/CD pipeline. 
- need to work on parallel execution of Test Cases.
- retry of failure test cases .

## Reporting
- report can be found in target/cucumber/index.html





