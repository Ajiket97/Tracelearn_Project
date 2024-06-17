Feature: LoginPage
Scenario Outline: Login Automation Testing Practice Page
When open chrome browser
Then lauch Url
And fill the form <Name><E-mail><Phone><Adress>

Examples: 
|Name|E-mail |Phone |Adress |
|"Ajit"|"Ait@1235"|"9876543210"|"pune"|
|"Smita"|"Smita@1235"|"9876543210"|"pune"|
|"ShriSir"|"Shri@1235"|"9876543210"|"pune"|
|"Smit"|"Smit@1235"|"9876543210"|"pune"|


Scenario: Print list of fruits
Given i have a following list of fruits<fruits> and is Quantity<quantity>:

|fruits|quantity|
|"orange"|1|
|"mango"|5|
|"Banana"|15|
|"Apple"|8|


