# AwaazDe-Automation-Interview

This project consists of a testcase about adding products to the cart on the basis of the conditions and then doing the payment for the products added to the cart.The project that has been created is a testNG Project.

Import the git project in eclipse IDE. //GIT URL

Dependencies to run the Project:
1. Java 8+
2. Eclipse IDE
3. Chrome Browser
4. Chrome Driver
5. Selenium Jars
6. TestNG Library1

Detailed Steps for dependencies and setup:
1. Java 8+
This project will run on Java8+ version as the library that has been added for Java in the project is JRE1.8

2. Eclipse IDE
Eclipse IDE, that I use is Neon.

3. Chrome Browser
The automation code will run on Chrome Browser only as only chrome driver is added in the drivers folder. The version of Chrome that I have used is Version 81.0.4044.113 (64-bit)

4. chromedriver
The chromedriver vesrion depends on the Chrome browser version. If the chromedriver version does not support your Chrome Browser Version, then the chrome browser will not be initiated in automation. Kindly check the version of chrome browser and correspondingly download the chromedriver from :
https://chromedriver.chromium.org/downloads

Lets say if chrome browser version is 81.0.4044.113, then from the website mentioned above, under current releases, Click on ChromeDriver 81.0.4044.69 If you are using Chrome version 81, please download ChromeDriver 81.0.4044.69

Place the downloaded chrome driver in the folder:
AwaazDeAutomation_Version2\drivers\chrome

5. Selenium Jars 
Download Selenium standalone server jar from https://selenium-release.storage.googleapis.com/index.html?path=3.9/
Click on selenium-server-standalone-3.9.0.jar 

6. TestNG Library
In Eclipse Help -> Install New Software:
Click on Add Button on the new window Opened. Give name as TsetNG and give location as https://dl.bintray.com/testng-team/testng-eclipse-release/7.0.0/
Click on OK button
Click on Next, Next until TestNG gets installed.

Once the setup is done:
1. Right Click on the Project imported and Click on Properties.
2. Click on Java Build Path in the left corner Menu
3. Click on Libraries Tab
4. Click on Add Library and Click on TestNG. Click on Next and Click on Finish. TestNG will be installed.
5. Click on Add external Jars and select the selenium standalone jar that you have downloaded earlier.
6. If java library is not installed or different, then please add Java library also .

This completes the setup process.

To run the flow:
1. Expand src folder in the project.
2. Right click on TestClass.java and Click on Run as -> TestNG Test.
3. Report will be generated after execution in the folder - test-outpt folder with name as index.html. Open this and you will see the report generated.

Overview of the Project - 
1. projet.properties is the properties file, where I tried to add the xpaths as in the locators of the webelements on which operations will be performed.
2. BaseClass contains the webdriver code which helps in performing the operations like initiate webdriver, click, type, select, launch browser, open url, etc.
3. Operations class is basically about the operations that are performed while running the testcase1 like function to fetch the temperature, function to fetch the minimum price of item and function to validate the sum of price of items.
4. TestClass consists of testcase as in end to endflow of the assignment.
