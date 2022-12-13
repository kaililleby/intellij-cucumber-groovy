Feature: a simple test

  Scenario: do something
    #this one is NOT supported
    Given i write "hello" to console
    #this one IS supported - using regexp in the name-pattern in stepDefs.groovy
    And you write "hello" to console
