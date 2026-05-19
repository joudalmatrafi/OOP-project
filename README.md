# OOP Project - Student Records Management System

## Project Description
This project is a Java console application for managing student records at Qassim University.  
The system allows the user to add students, display all students, generate a GPA report, and save student data to a text file.

## Features
- Add new student information
- Display all student records
- Generate a report for honor students with GPA 3.5 or above
- Save and load student data using a text file
- Auto-save records using a background thread
- Validate student GPA using exception handling

## OOP Concepts Used
- Classes and Objects
- Inheritance
- Abstraction
- Encapsulation
- Method Overriding
- Exception Handling
- File Handling
- Threads
- ArrayList

## Main Classes
- Person: Abstract parent class for common personal information.
- Student: Represents student data such as ID, name, GPA, department, and address.
- Address: Stores city and street information.
- StudentManager: Manages adding, removing, and retrieving students.
- FileHandler: Saves and loads student records from students.txt.
- ReportGenerator: Generates GPA report for honor students.
- AutoSaveThread: Automatically saves records every 30 seconds.
- InvalidStudentDataEx: Custom exception for invalid student data.
- Main: Runs the program and displays the menu.

## Tools Used
- Java
- Apache NetBeans
- GitHub

## How to Run
1. Open the project in Apache NetBeans.
2. Open the Main.java file.
3. Click Run.
4. Choose from the menu:
   - Add Student
   - Show All
   - Generate Report
   - Exit

## Team Members
- joud Al-Matrafi
- Layan Saleh Al-harbi
- Danah Mohammed Alolayan
- Ghand Alhabib
