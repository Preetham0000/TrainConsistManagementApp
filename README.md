# Train Consist Management App

A console-based Java application that simulates railway train consist management. The project demonstrates how passenger and goods bogies are attached, managed, validated, sorted, and processed using core Java concepts, collections, streams, algorithms, and exception handling.

---

## Overview

The application models a train consist as a collection of bogies connected to an engine. It supports passenger bogies, goods bogies, cargo validation, seat capacity tracking, and train safety compliance.

---

## Features

- Train consist initialization
- Passenger bogie management
- Goods bogie handling
- Unique bogie ID tracking
- Ordered train formation management
- Bogie capacity mapping
- Sorting and searching operations
- Stream API processing
- Regex-based validation
- Safety compliance checks
- Performance benchmarking
- Custom exception handling
- Algorithm implementation using sorting and searching techniques

---

## Core Functionalities

### Train Initialization
- Initialize train consist
- Display train summary
- Maintain dynamic bogie collections

### Passenger Bogie Management
- Add and remove passenger bogies
- Track seating capacities
- Manage train composition

### Goods Bogie Management
- Handle cargo assignments
- Validate cargo safety rules
- Enforce goods transport constraints

### Bogie Tracking
- Maintain unique bogie IDs
- Preserve insertion order
- Manage ordered train formations

### Capacity Management
- Map bogies with seating/load capacities
- Calculate total train seating capacity
- Filter high-capacity bogies

### Sorting and Searching
- Sort bogies by capacity and names
- Implement Bubble Sort
- Use Arrays.sort()
- Perform Linear Search
- Perform Binary Search

### Stream API Operations
- Filter bogies using streams
- Group bogies by category
- Aggregate seat capacities
- Perform stream-based validations

### Validation and Safety
- Validate Train IDs and Cargo Codes using Regex
- Enforce safety compliance rules
- Prevent unsafe cargo assignments

### Exception Handling
- Handle invalid bogie capacities
- Manage runtime cargo assignment errors
- Apply defensive programming practices

### Performance Analysis
- Compare loop-based and stream-based execution
- Benchmark operations using System.nanoTime()

---

## Concepts Covered

### Java Collections
- ArrayList
- LinkedList
- HashSet
- LinkedHashSet
- TreeSet
- HashMap

### Algorithms
- Bubble Sort
- Linear Search
- Binary Search
- Sorting Techniques

### Stream API
- filter()
- map()
- reduce()
- groupingBy()
- collect()

### Functional Programming
- Lambda Expressions
- Comparator
- Method References

### Exception Handling
- Custom Exceptions
- try-catch-finally
- Checked and Unchecked Exceptions
- IllegalStateException

### Regex Validation
- Pattern
- Matcher
- Input format validation

### Performance Optimization
- Time complexity awareness
- Benchmarking techniques
- Loop vs Stream comparison

---

## Project Structure

```bash
Train-Consist-Management-App/
│
├── src/
│   ├── models/
│   │   ├── Bogie.java
│   │   ├── PassengerBogie.java
│   │   └── GoodsBogie.java
│   │
│   ├── exceptions/
│   │   ├── InvalidCapacityException.java
│   │   └── CargoSafetyException.java
│   │
│   ├── services/
│   │   ├── TrainService.java
│   │   ├── ValidationService.java
│   │   └── SearchService.java
│   │
│   ├── algorithms/
│   │   ├── BubbleSort.java
│   │   ├── LinearSearch.java
│   │   └── BinarySearch.java
│   │
│   └── Main.java
│
└── README.md
```
