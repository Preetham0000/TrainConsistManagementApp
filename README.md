# TrainConsistManagementApp

## UC1: Initialize Train and Display Consist Summary
- Initializes the Train Consist Management Application and displays a welcome banner when the program starts.
- Creates a dynamic data structure using ArrayList to store train bogies.
- Demonstrates the use of the Java Collections Framework with List.
- Initializes the train consist as an empty list, representing a newly created train.
- Sets the initial bogie count to 0 to indicate that no bogies are attached yet.
- Displays the initial state of the train consist to the user.
- Uses Scanner to prepare the application for future user input operations.
- Illustrates basic program startup flow and system initialization.

## UC2: Add Passenger Bogies to Train (ArrayList Operations)
- Demonstrates dynamic management of passenger bogies using ArrayList.
- Initializes an empty List to represent passenger bogies.
- Adds Sleeper, AC Chair, and First Class bogies using `add()`.
- Displays the train consist after insertion.
- Removes AC Chair bogie using `remove()`.
- Displays updated list after removal.
- Uses `contains()` to check if a bogie type exists.
- Demonstrates CRUD operations with ArrayList.
- Displays final passenger bogie configuration.
- Confirms successful consist operations.

## UC3: Track Unique Bogie IDs (Set – HashSet)
- Demonstrates managing unique bogie IDs using HashSet.
- Adds IDs BG101, BG102, BG103.
- Displays initial set.
- Attempts to add duplicate IDs.
- Shows HashSet preventing duplicates.
- Ensures uniqueness and integrity.
- Demonstrates Set behavior.
- Prints messages explaining duplicate handling.
- Confirms successful operations.

## UC4: Maintain Ordered Bogie IDs (LinkedList)
- Manages ordered bogies using LinkedList.
- Adds Engine, Sleeper, AC, Cargo, Guard.
- Displays initial order.
- Inserts Pantry Car using indexed insertion.
- Removes first and last bogies.
- Displays updated consist.
- Demonstrates dynamic restructuring similar to real coupling/decoupling.
- Confirms successful operations.


## UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
- Uses LinkedHashSet to store bogies while preserving insertion order.
- Adds Engine, Sleeper, Cargo, Guard.
- Attempts adding duplicates.
- Demonstrates uniqueness + order preservation.
- Displays final formation.
- Confirms success.

## UC6: Map Bogie to Capacity (HashMap)
- Uses `Map<String, Integer>` to manage bogie capacities.
- Adds First Class, Cargo, Sleeper, AC Chair with `put()`.
- Stores seating/load capacity.
- Displays full mapping.
- Demonstrates fast lookup and associative storage.
- Confirms success.

## UC7: Sort Bogies by Capacity (Comparator)
- Bogie objects contain name + seating capacity.
- Stored in ArrayList.
- Displays unsorted list.
- Uses Comparator to sort by capacity ascending.
- Shows sorted output.
- Demonstrates custom sorting logic with Collections.sort().


## UC8: Filter Passenger Bogies Using Streams
- Uses Stream API filtering.
- Converts list to stream.
- Filters bogies with capacity > 60.
- Collects results into new list using `toList()`.
- Displays filtered output.
- Demonstrates functional-style processing.

## UC9: Group Bogies by Type (Collectors.groupingBy)
- Uses groupingBy to classify bogies by type.
- Creates map: key = bogie name, value = list of bogies.
- Displays groups with capacity details.
- Demonstrates grouping operations.


## UC10: Count Total Seats in Train (reduce)
- Uses Stream.reduce() to aggregate seating capacities.
- Maps bogies to capacity using `map()`.
- Sums capacities using `reduce()`.
- Displays total capacity.
- Demonstrates aggregation.

## UC11: Validate Train ID & Cargo Codes (Regex)
- Accepts Train ID and Cargo Code via Scanner.
- Valid Train ID: `TRN-1234`.
- Valid Cargo Code: `PET-AB`.
- Uses `matches()` for validation.
- Patterns:
  - Train ID: `TRN-\d{4}`
  - Cargo Code: `PET-[A-Z]{2}`
- Displays validity results.
- Demonstrates regex-based validation.


## UC12: Safety Compliance Check for Goods Bogies
- Uses Streams to validate safety rules.
- Each GoodsBogie has type + cargo.
- Applies safety rules using `allMatch()`.
- Flags unsafe combinations.
- Demonstrates rule validation using functional programming.

## UC13: Performance Comparison (Loops vs Streams)
- Compares filtering performance using:
  - Traditional for-loop
  - Stream API filter()
- Uses `System.nanoTime()` for timing.
- Displays durations.
- Demonstrates benchmarking.

## UC14: Handle Invalid Bogie Capacity (Custom Exception)
- Defines custom `InvalidCapacityException`.
- PassengerBogie constructor validates capacity.
- Throws exception if capacity ≤ 0.
- Demonstrates fail-fast design.
- Uses try-catch for safe execution.

## UC15: Safe Cargo Assignment Using try-catch-finally
- Defines runtime exception `CargoSafetyException`.
- GoodsBogie.assignCargo() validates cargo safety.
- Throws exception for unsafe combinations.
- Uses try-catch-finally to log attempts.
- Demonstrates robust runtime validation.

## UC16: Sort Passenger Bogies by Capacity (Bubble Sort)
- Demonstrates manual Bubble Sort implementation.
- Converts List to array.
- Swaps adjacent values when necessary.
- Ensures ascending order.
- Displays sorted capacities.
- Demonstrates algorithmic logic.

## UC17: Sort Bogie Names Using Arrays.sort()
- Creates ArrayList of bogie names.
- Converts to String array.
- Uses `Arrays.sort()` to alphabetically sort names.
- Displays sorted output.
- Demonstrates built-in sorting.

## UC18: Linear Search for Bogie ID
- Sequential search using for-loop.
- Compares elements using `equals()`.
- Displays found/not-found result.
- Demonstrates basic search logic.

## UC19: Binary Search for Bogie ID
- Requires sorted list.
- Uses divide-and-conquer searching.
- Checks middle element to adjust search range.
- Demonstrates optimized searching technique.

## UC20: Exception Handling During Search Operations
- Validates if list is empty before searching.
- Throws `IllegalStateException` if empty.
- Otherwise performs sequential search.
- Demonstrates defensive programming + fail-fast validation.
