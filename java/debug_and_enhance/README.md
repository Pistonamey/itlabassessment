# Java Problem 2: Debugging and Enhancement

## Objective
This exercise is designed to test your abilities in debugging, enhancing existing Java code, and integrating it with a real-world application scenario. The task involves a Java class intended for a task management system, but it contains errors and inefficiencies that need to be addressed.

## Scenario
You are contributing to a task management application where users can add, update, and delete tasks. The application uses a TaskManager class to handle these operations. However, the initial implementation of the TaskManager class has bugs that prevent the application from running correctly. Additionally, the class needs enhancements for better error handling and efficiency.

## Code
The Code is in the file TaskManager.java

## Your Tasks
* Debugging: Identify and correct the logical and syntactical errors in the provided code.
* Enhancement:
    - Improve the addTask method to correctly check if the task is valid before adding it.
    - Implement error handling in updateTask to throw an appropriate exception if the index is out of bounds or the newTask is invalid.
    - Optimize the displayTasks method to use Java 8 streams for displaying tasks.
* Integration: Add a feature to the TaskManager class that allows filtering tasks based on a keyword. This method should return a list of tasks that contain the given keyword.
* Documentation: Document your code with appropriate comments to explain the logic behind your implementations and any assumptions you made.

### This exercise not only tests your coding and debugging skills but also assesses your ability to enhance and integrate new features into existing code, reflecting common tasks in real-world software development projects.