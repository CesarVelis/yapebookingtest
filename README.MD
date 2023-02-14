
##**README YAPE BOOKING TEST**


# The test was developed using Android Studio / Cucumber / Serenity / Appium / Appium Inspector 
# A Happy Path scenario was covered, and you can run it executing the @CucumberTestSuite class
# Also, next in this document you can find commands to runs this using the console
# To automate this test a Pixel 2 Emulator with Android 11 was used
# You can change the capabilities configuration on the file senerity.properties
# Important Note: this booking application does not have defined id or accessibilityId to its element, so mayor or the 
# search was done using the XPATH
# As the retrieve result page use several criteria to determine the order of the results, that part of test can fail, 
# already try adding several filter to always return the same result order but i was not able to accomplish that
# Also, as im using a simulator and appium inspector, I was not able to validate the content of the screen
# were we need to add the paymentdata so the flow of the test in until you pick the room option  



##**Run tests with gradle:**

```
./gradlew clean test
```

To run tests in Firefox:

```
./gradlew clean test -Dwebdriver.driver=firefox
```

In windows:
```
gradlew clean test
```

##**Run tests with Maven:**

```
mvn clean verify -Ddriver=firefox
```
or try this:

```
mvn clean verify -Dwebdriver.driver=firefox
```



