# Train Consist Management App

A console-based Java application that simulates railway train consist management. The project demonstrates how passenger and goods bogies are attached, managed, validated, sorted, and processed using core Java concepts, collections, streams, algorithms, and exception handling.

---

## Overview

The application models a train consist as a collection of bogies connected to an engine. It supports passenger bogies, goods bogies, cargo validation, seat capacity tracking, and train safety compliance.

# UC1 – Initialize Train and Display Consist Summary
 
## Actions performed
- Start the application.
- Print welcome message.
- Initialize an empty train consist.
- Display initial bogie count.
 
## Functions / Methods Used
- `public static void main(String[] args)`
- `System.out.println()`
- `new ArrayList<>()`
- `size()`
 
# UC2 – Add Passenger Bogies to Train
 
##  Actions performed
- Create a list of passenger bogies.
- Add bogies (Sleeper, AC Chair, First Class).
- Remove a bogie.
- Check if a bogie exists.
 
## Functions / Methods Used
- `add()`
- `remove()`
- `contains()`
- `System.out.println()`
 
# UC3 – Track Unique Bogie IDs
 
## Actions performed
- Store bogie IDs in a set.
- Add duplicate IDs intentionally.
- Verify duplicates are automatically removed.
 
## Functions / Methods Used
- `HashSet`
- `add()`
- `System.out.println()`
 
# UC4 – Maintain Ordered Train Consist
 
## Actions performed
- Create train consist using LinkedList.
- Add engine and bogies.
- Insert a pantry car in middle.
- Remove first and last bogies.
 
## Functions / Methods Used
- `addFirst()`
- `addLast()`
- `add(index, element)`
- `removeFirst()`
- `removeLast()`
 
# UC5 – Preserve Insertion Order
 
## Actions performed
- Use LinkedHashSet to maintain bogie order.
- Add bogies.
- Attempt duplicate insertion.
- Print formation.
 
## Functions / Methods Used
- `LinkedHashSet`
- `add()`
- `System.out.println()`
 
# UC6 – Map Bogie to Capacity
 
## Actions performed
- Store bogie name and capacity.
- Create key-value mapping.
- Print capacity for each bogie.
 
## Functions / Methods Used
- `HashMap`
- `put()`
- `entrySet()`
- `forEach / loop`
 
# UC7 – Sort Bogies by Capacity
 
## What You Do
- Create Bogie class.
- Store bogies in a list.
- Sort them by capacity.
 
## Functions / Methods Used
- `Comparator.comparingInt()`
- `sort()`
- `List.add()`
 
# UC8 – Filter Passenger Bogies Using Streams
 
##  Actions performed
- Convert bogie list to stream.
- Filter bogies with capacity greater than threshold.
- Collect results.
 
## Functions / Methods Used
- `stream()`
- `filter()`
- `collect()`
- `toList()`
 
# UC9 – Group Bogies by Type
 
##  Actions performed
- Convert list into stream.
- Group bogies based on type.
- Store grouped result in map.
 
## Functions / Methods Used
- `stream()`
- `Collectors.groupingBy()`
- `Map`
 
# UC10 – Count Total Seats
 
## Actions performed
- Extract capacities from bogies.
- Sum them to calculate total seating.
 
## Functions / Methods Used
- `map()`
- `reduce()`
- `Integer::sum`
 
# UC11 – Validate Train ID and Cargo Codes
 
## Actions performed
- Accept Train ID and Cargo Code.
- Validate format using regex.
 
## Functions / Methods Used
- `Pattern.compile()`
- `Matcher`
- `matches()`
 
# UC12 – Safety Compliance Check
 
## Actions performed
- Validate cargo assignment rules.
- Ensure cylindrical bogies carry petroleum only.
 
## Functions / Methods Used
- `stream()`
- `allMatch()`
- `lambda expressions`
 
# UC13 – Performance Comparison
 
## Actions performed
- Measure execution time for loop-based logic.
- Measure execution time for stream-based logic.
- Compare results.
 
## Functions / Methods Used
- `System.nanoTime()`
- `stream()`
- `filter()`
- `for loop`
 
---
 
# UC14 – Handle Invalid Bogie Capacity
 
## Actions performed
- Create custom exception.
- Validate capacity during bogie creation.
- Throw exception if capacity ≤ 0.
 
## Functions / Methods Used
- `throw`
- `throws`
- `extends Exception`
 
# UC15 – Safe Cargo Assignment
 
##  Actions performed
- Validate cargo during runtime.
- Handle unsafe cargo assignment using exception handling.
 
## Functions / Methods Used
- `try`
- `catch`
- `finally`
- `throw`
 
# UC16 – Manual Sorting (Bubble Sort)
 
## Actions performed
- Sort capacities manually using Bubble Sort.
- Compare adjacent elements and swap.
 
## Functions / Methods Used
- `for loops`
- `array indexing`
- `swap logic`
 
# UC17 – Sort Using Arrays.sort()
 
## Actions performed
- Sort bogie names alphabetically using built-in method.
 
## Functions / Methods Used
- `Arrays.sort()`
- `Arrays.toString()`
 
# UC18 – Linear Search for Bogie ID
 
## Actions performed
- Search bogie ID sequentially from list.
 
## Functions / Methods Used
- `for loop`
- `equals()`
 
# UC19 – Binary Search for Bogie ID
 
## Actions performed
- Search bogie ID in sorted list using binary search.
 
## Functions / Methods Used
- `compareTo()`
- `while loop`
- `mid calculation`
 
 
# UC20 – Exception Handling During Search
 
## Actions performed
- Check if bogie list is empty.
- Prevent searching when no bogies exist.
 
## Functions / Methods Used
- `if condition`
- `throw new IllegalStateException()`
