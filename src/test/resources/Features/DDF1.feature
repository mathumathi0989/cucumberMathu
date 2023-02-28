
@DDF
Feature: Verify data driven framework without External Files


  Scenario Outline: Verify data driven without using Examples Keyword
    Given Demo Open website
    When Demo user enters <uName> and <password>
    Then Demo user logged in

Examples:

|uName|password|
|Thanyasree|Success@1|
|Gurdev|Success@1|


