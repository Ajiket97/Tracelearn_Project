Feature: Log in Automation Testing Practice
Scenario Outline: Automation Testing Practice form Filling
Given open new chrome browser
And  launch  Automation Testing Practice url
And fill the form as<name><email><phone>
And fill the<adress>
Examples: 
|name|email|phone|adress|
|"Ajit"|"Aj@123"|"987654321"|"pune"|
|"Ajikwt"|"jk@123"|"987654321"|"pune"|


 

