Feature: Validate Booking Application

  Scenario: Happypath: Validate happy flow of a booking process

############################  Optional step in some emulator this message appears ############################
#    Given the cookies message appear randomly in some devices
############################  Optional step in some emulator this message appears ############################

    Given a new user is opening the application by first time

    When a new user want to login first time in the app using the email option

    When a valid email and password are entered

    Then a user successfully access to the application

    When the user press the Start Searching Button

    Then the user enter the destination city

    And select the second destination choice

    Then the user enter to the from and to dates

    And the user enter to the option select room and guess

    When the user press the search button

    Then the user select the option two JW Marriot Hotel

    Then the user press the button See your Option

    And the user press the button Reserve these options

