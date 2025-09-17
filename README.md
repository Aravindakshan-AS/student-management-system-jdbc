# student-management-system-jdbc
Basic student management app in Java using JDBC for CRUD operations.

# Student Management System (Java + JDBC + MySQL)

A simple console-based CRUD application using Java and MySQL.  
This project allows you to add, view, update, and delete student records.

## Features
- Add new student
- View all students
- Update student grade
- Delete student

## Tech Stack
- Java
- JDBC
- MySQL

## Setup Instructions
1. Install MySQL.
2. Open MySQL Workbench or CLI.
3. Run the `studentdb.sql` script to create database & table.
4. Update your DB credentials in `DBConnection.java`:
   ```java
   private static final String USER = "root";
   private static final String PASSWORD = "your_password";
