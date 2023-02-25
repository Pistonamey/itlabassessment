# Python Task

## Instructions

* This assessment is designed to evaluate your Python and Flask programming skills.
* You are expected to complete this assessment on your own, without any external help.
* You are free to use any online resources or IDEs that you are comfortable with.
* Your code will be evaluated based on correctness, efficiency, readability, and adherence to best practices.

## Getting Started

* After you have downloaded the code in the form oz a zip file or directly using the git command, cd into the 'python' folder in your IDE.
* Make sure that you have python and flask installed on your pc and where you have downloaded these files.
* In order to start the application, type the command 'python app.py' or 'python3 app.py' in your IDE's terminal based on how you have installed python in your system.
* You will be able to see a url in your IDE after you enter the above command. It will be something on the lines of 'http://127.0.0.1:5000/'. This points to your localhost.
* You should see the following page after you open the url:
![Screenshot (1700)](https://user-images.githubusercontent.com/83175234/221328870-b368f5bb-31bc-4058-8d9c-20d4b1c9f59d.png)
* In the url type '/students' in front. the entire url should look something like this: 'http://127.0.0.1:5000/students'.
* You should see the following page with '/students':
![Screenshot (1701)](https://user-images.githubusercontent.com/83175234/221328952-5ab7100f-67af-4f7b-be5a-7d1c91fe7c71.png)

## Problem Statement

* In your 'python' folder you are given 3 python files. 'app.py', 'courses.py', 'students.py'.
* app.py is the main flask application.
* courses.py consists of a dictionary (hash-map) that is in the format "term"->"course list". "course list" is a list of all the courses that are available for a particular "term".
* students.py consists of a dictionary (hash-map) that is in the format "id" -> {"Name"->Name of the student,"Term"->Term that the student is enrolled for,"Courses"->Courses that the student is taking}. "id" is the student-id.
