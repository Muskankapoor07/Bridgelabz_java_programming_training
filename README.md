# Advanced Java Programming

A comprehensive collection of Advanced Java concepts, assignments, and hands-on projects completed during the BridgeLabz Java Full Stack Training Program.

---

## Overview

This module focuses on advanced Java development concepts including Generics, Collection Framework, I/O Streams, Exception Handling, Regular Expressions, Unit Testing with JUnit, SonarQube Code Quality Analysis, and Annotations.

The objective is to develop scalable, maintainable, and industry-standard Java applications while following best coding practices.

---

## Java Collections, Generics and Streams

### Generics

#### Topics Covered

* Introduction to Generics
* Type Parameters
* Generic Classes
* Generic Methods
* Bounded Type Parameters
* Wildcards

#### Practice Programs

* Generic Class Demo
* Generic Method Demo
* Bounded Type Example
* Wildcard Example

---

### Collection Framework

#### Topics Covered

* ArrayList
* LinkedList
* Stack
* Queue
* Set
* Map

#### Practice Programs

##### Employee Records Management

Store employee records (ID, Name, Department) and search employees using HashMap.

##### LinkedList Operations

Remove all occurrences of a specified value from a LinkedList.

##### Balanced Parentheses Checker

Validate balanced parentheses using Stack.

##### Printer Queue Simulation

Implement First-In-First-Out (FIFO) processing using Queue.

---

### I/O Streams

#### Topics Covered

* File Streams
* Object Streams
* Byte Streams
* Buffered Streams
* Reader and Writer Classes

#### Practice Project

##### Address Book File Management System

Perform the following operations using Java Streams:

* Store Contacts
* Retrieve Contacts
* Modify Existing Contacts
* Delete Contacts

---

## Exception Handling

### Topics Covered

* Checked Exceptions
* Unchecked Exceptions
* Custom Exceptions
* Try-Catch Blocks
* Finally Block
* Throw vs Throws
* Creating Custom Exceptions
* Extending Exception Class
* Defining Constructors

### Practice Programs

#### User Input Validation

Create a custom exception to validate user input and throw the exception when invalid data is entered.

#### File Handling Exception

Read a file, handle checked exceptions, and throw a custom unchecked exception when the file is not found.

#### Banking Application

Handle insufficient balance using custom exceptions and demonstrate:

* try
* catch
* finally
* throw

---

## Regex and JUnit

### Regular Expressions

#### Topics Covered

* Email Validation
* Password Validation
* Phone Number Validation
* Pattern Class
* Matcher Class
* find()
* matches()
* replaceAll()

#### Practice Programs

##### Email Validator

Validate email addresses using Regex.

##### Phone Number Extractor

Extract phone numbers from a text document using Pattern and Matcher.

##### Password Pattern Recognition

Validate strong and secure password patterns.

---

### Unit Testing with JUnit

#### Topics Covered

* JUnit Framework
* JUnit Annotations
* Writing Test Cases
* Test Class Structure
* Assertions

#### Practice Programs

##### Arithmetic Operations Testing

Create JUnit test cases for:

* Addition
* Subtraction
* Multiplication
* Division

##### StringUtils Testing

Methods Tested:

* reverse()
* isPalindrome()

Write JUnit test cases for each method.

---

## Code Quality

### SonarQube

#### Topics Covered

* Static Code Analysis
* Code Coverage
* Code Smells Detection
* Maintainability Analysis
* Best Coding Practices

#### Benefits

* Improved Code Quality
* Better Maintainability
* Reduced Bugs
* Cleaner Architecture

---

## Annotations

### Topics Covered

* Introduction to Annotations
* Common Built-in Annotations
* Creating Custom Annotations
* Defining Annotations

### Built-in Annotations

* @Override
* @Deprecated
* @SuppressWarnings

### Practice Programs

#### Important Task Annotation

Create a custom annotation `@ImportantTask` to mark important tasks and use Reflection API to retrieve and display them.

#### Built-in Annotation Demonstration

Demonstrate the usage of:

* @Override
* @Deprecated
* @SuppressWarnings

#### Developer Information Annotation

Create a custom annotation `@DeveloperInfo` to store developer details and retrieve the information using Reflection API.

---

## Technologies Used

| Category           | Technology                      |
| ------------------ | ------------------------------- |
| Language           | Java                            |
| IDE                | IntelliJ IDEA Community Edition |
| Testing Framework  | JUnit 5                         |
| Code Quality       | SonarQube                       |
| Version Control    | Git                             |
| Repository Hosting | GitHub                          |

---

## Repository Structure

```text
Advance-Java-Programming
│
├── Java-Collections-Streams
│   ├── Generics
│   ├── Collection-Framework
│   └── IO-Streams
│
├── Exception-Handling
│
├── Regex-JUnit
│
├── Annotations
│
└── README.md
```

---

## Learning Outcomes

After completing this module, the following skills were developed:

* Generic Programming
* Collection Framework Mastery
* File Handling using Streams
* Exception Management
* Regular Expression Processing
* Unit Testing with JUnit
* Code Quality Analysis
* Annotation Processing
* Reflection API Usage
* Clean Code Practices
* Software Development Best Practices
