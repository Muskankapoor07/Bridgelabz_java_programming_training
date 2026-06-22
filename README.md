# Design Modeling

## Overview

This repository contains implementations of Software Design Principles and GoF (Gang of Four) Design Patterns developed as part of the BridgeLabz Java Training Program.

The objective of this module is to learn how to design scalable, maintainable, reusable, and loosely coupled software systems by applying industry-standard design principles and design patterns.

A Library Management System is used as the primary project to demonstrate the practical application of these concepts.

---

## Topics Covered

### Design Principles

#### DRY (Don't Repeat Yourself)
- Avoid code duplication
- Improve maintainability
- Promote code reusability

#### SOLID Principles

##### S - Single Responsibility Principle (SRP)
A class should have only one reason to change.

##### O - Open/Closed Principle (OCP)
Software entities should be open for extension but closed for modification.

##### L - Liskov Substitution Principle (LSP)
Derived classes should be substitutable for their base classes.

##### I - Interface Segregation Principle (ISP)
Clients should not be forced to depend on interfaces they do not use.

##### D - Dependency Inversion Principle (DIP)
Depend on abstractions, not concrete implementations.

#### YAGNI (You Aren't Gonna Need It)
- Implement only required features
- Avoid unnecessary complexity

---

### Test Driven Development (TDD)

- Writing Test Cases First
- Red-Green-Refactor Cycle
- Unit Testing Concepts
- Improving Code Quality through Testing

---

## GoF Design Patterns

### Creational Design Patterns

#### Singleton Pattern
Ensures only one instance of a class exists throughout the application.

#### Factory Pattern
Creates objects without exposing object creation logic.

#### Factory Method Pattern
Defines an interface for creating objects while allowing subclasses to decide the object type.

#### Builder Pattern
Constructs complex objects step-by-step.

#### Abstract Factory Pattern
Provides an interface for creating families of related objects.

---

### Structural Design Patterns

#### Decorator Pattern
Adds new functionality to objects dynamically without modifying existing code.

---

### Behavioral Design Patterns

#### Observer Pattern
Defines a one-to-many dependency where changes in one object automatically notify dependent objects.

---

## Project: Library Management System

A Library Management System developed using Design Principles and Design Patterns.

### Features

#### Book Management
- Add Books
- Remove Books
- Search Books
- Update Book Details

#### User Management
- Student Users
- Faculty Users
- Librarian Users

#### Catalog Management
- Centralized Library Catalog
- Book Availability Tracking

---

## Design Pattern Implementations

### Singleton Pattern
Used to maintain a single Library Catalog instance across the application.

### Factory Pattern
Used to create different user types:
- Student
- Faculty
- Librarian

### Builder Pattern
Used to create complex Book objects with:
- Multiple Authors
- Editions
- Genres
- Additional Metadata

### Observer Pattern
Used to notify subscribed users about:
- New Book Arrivals
- Book Availability Updates
- Library Notifications

---

## Technologies Used

- Java
- Object-Oriented Programming
- Design Principles
- Design Patterns
- JUnit (TDD)
- Git
- GitHub

---

## Learning Outcomes

Through this module, I gained practical experience in:

- Applying SOLID Principles
- Writing Maintainable and Scalable Code
- Implementing GoF Design Patterns
- Designing Real-World Applications
- Following TDD Practices
- Reducing Code Coupling
- Improving Code Reusability
- Creating Extensible Software Architectures

---

## Repository Structure

```text
design-modeling/
├── Design-Principles/
├── Design-Patterns/
├── Library-Management-System/
└── README.md
```

---

## Key Design Patterns Implemented

| Pattern | Purpose |
|----------|----------|
| Singleton | Single instance management |
| Factory | Object creation abstraction |
| Factory Method | Flexible object creation |
| Builder | Complex object construction |
| Abstract Factory | Related object families |
| Decorator | Dynamic feature addition |
| Observer | Event notification system |

---

## Author

**Muskan Kapoor**

B.Tech Computer Science Engineering  
BridgeLabz Java Training Program

---
