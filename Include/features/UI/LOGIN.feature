#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  I want to use dashboard for login

  @tag1
  Scenario Outline: As a user, I want to login dashboard with role student
  	Given I want to login dashboar
    When I want to input valid username <name>
    And I want to input valid password <pwd>
    And I click button submit
    Then I verify after Login <scenario>
    
    Examples:
     | name 	| pwd 											| scenario |
     |student	| p4y+y39Ir5PJb2ispxT0Ew==	| POSITIVE |
     |student	| tzH6RvlfSTg=							| NEGATIVE |
