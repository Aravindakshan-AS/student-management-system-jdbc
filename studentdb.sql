-- Create the database
CREATE DATABASE IF NOT EXISTS studentdb;
USE studentdb;

-- Create the table
CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(50),
    grade VARCHAR(5)
);

-- Insert sample data
INSERT INTO students (name, age, course, grade) VALUES
('John Doe', 20, 'CS', 'A'),
('Alice', 21, 'Math', 'B'),
('Bob', 19, 'Physics', 'C');
