# Autor: Yeisson
@stories
Feature: Academy Choucair
  as a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: search for a automation course
    Given than yeisson wants to learn automation at the academy Choucair
    | strUser   | strSpassword |
    | <strUser> | <strSpassword>      |
    When he search for the course on the choucair academy platform
    | strCourse   |
    | <strCourse> |
    Then he finds the course called
    | strCourse   |
    | <strCourse> |

    Examples:
    | strUser    | strPassword   | StrCourse               |
    | 1033774331 | Choucair2021* | Metodologia Bancolombia |

