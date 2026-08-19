# ☕ Core Java – Complete Topics & Tasks

A structured, day-by-day Java learning series covering all fundamental concepts of Core Java through practical code examples and hands-on tasks.

---

## 📁 Project Structure

```
java293/
├── Day1.java          → Variables, Data Types & Operators
├── Day2.java          → Conditionals & Switch Statements (Tasks)
├── Day3.java          → Loops & Loop Control Statements
├── Day4.java          → Date & Time API
├── Day5.java          → String Methods & Math Methods
├── Day6.java          → StringBuffer & StringBuilder
├── Day7P1.java        → Methods – Types & Usage
├── Day7P2.java        → Methods – Practice (Add & Multiply)
├── Day8.java          → Arrays – Fundamentals & 2D Arrays
├── Day8tasks.java     → Arrays – Practice Tasks
├── Day9.java          → Scanner (User Input) – Practice
└── Day9P1.java        → File Handling – Create, Write & Access
```

---

## 📅 Day-by-Day Breakdown

### Day 1 — Variables, Data Types & Operators

Covers all primitive data types and real-world usage of operators.

**Topics:**
- Variables: `String`, `char`, `int`, `byte`, `short`, `long`, `float`, `double`, `boolean`
- `float` vs `double` precision comparison
- Arithmetic Operators: `+`, `-`, `*`, `/`, `%`
- Assignment Operators: `+=`, `-=`, `*=`, `/=`, `%=`
- Relational Operators: `>`, `<`, `>=`, `<=`, `==`, `!=`
- Logical Operators: `&&`, `||`, `!`
- Increment & Decrement: Pre/Post `++` and `--`

---

### Day 2 — Conditionals & Switch (Tasks)

Practice problems using `if-else`, nested `if`, ternary operator, and `switch`.

**Tasks Covered:**
1. Celsius to Fahrenheit converter
2. Kilometer to Miles converter
3. Speed, Distance & Time calculator
4. Salary calculator (monthly → yearly → daily → hourly)
5. Simple Interest calculator
6. Area formula using `switch` (Square, Rectangle, Circle, Triangle, Parallelogram)
7. Vowel detector using `if-else`
8. Leap Year checker
9. EB Bill calculator (slab-based billing)
10. Largest of 4 numbers
11. Grading system (A1 → E)
12. Voting eligibility checker (nationality + age)
13. Adult or Minor checker using ternary operator

---

### Day 3 — Loops & Loop Control

Covers all loop types and flow control keywords.

**Topics:**
- `do-while` loop
- `while` loop
- `for` loop
- Print even numbers (0–100)
- Print odd numbers (0–100)
- Print prime numbers (2–100)
- Print alphabets A to Z using `char` loop
- `break` statement
- `continue` statement

---

### Day 4 — Date & Time API

Covers Java's legacy and modern date/time utilities.

**Topics:**
- `java.util.Date` – current date
- `LocalDate` – today's date
- `LocalTime` – current time
- `LocalDateTime` – combined date and time
- `DateTimeFormatter` – format patterns (`dd-MM-yyyy`, `dd/MM/yyyy`, `dd MMMM yyyy`)
- `Period` – calculate age (years, months, days between two dates)
- `Duration` – calculate time duration between two times
- `Calendar` – get year, month, day
- `Calendar.add()` and `Calendar.set()` – date manipulation

---

### Day 5 — String Methods & Math Methods

Explores built-in methods from `String` and `Math` classes.

**String Methods:**
- `length()`, `toUpperCase()`, `toLowerCase()`, `charAt()`
- `contains()`, `substring()`, `replace()`, `equals()`
- `startsWith()`, `endsWith()`, `trim()`, `isEmpty()`, `indexOf()`

**Math Methods:**
- `round()`, `ceil()`, `floor()`, `sqrt()`
- `max()`, `min()`, `abs()`
- `pow()` – power calculation
- `random()` – random number generation

---

### Day 6 — StringBuffer & StringBuilder

Covers mutable string manipulation with both thread-safe and non-thread-safe options.

**StringBuffer Methods:**
- `append()` – concatenate strings
- `insert()` – insert at a position
- `replace()` – replace a range
- `delete()` – delete a range
- `reverse()` – reverse the string

**StringBuilder Methods:**
- `append()`, `insert()`, `replace()`, `delete()`, `reverse()`

> **Note:** `StringBuffer` is thread-safe (synchronized); `StringBuilder` is faster but not thread-safe.

---

### Day 7 — Methods

**Day7P1 – Four Types of Methods:**
1. Without argument & without return
2. Without argument & with return
3. With argument & without return
4. With argument & with return

**Day7P2 – Method Practice:**
- `add(int, int)` – addition
- `multiply(int, int)` – multiplication
- (Commented section shows method overloading concept with `int` and `double`)

---

### Day 8 — Arrays

**Day8 – Array Fundamentals:**
1. Direct access by index
2. Traverse array using `for` loop
3. String array traversal
4. Sum of array elements
5. Average of array elements
6. Find the largest value
7. Find the smallest value
8. Identify even and odd numbers in an array
9. Enhanced `for-each` loop
10. 2D arrays (matrix) – access by index
11. Modify 2D array values
12. Traverse 2D array using nested `for` loop

**Day8tasks – Array Practice Tasks:**
1. Reverse an array
2. Search for a value in an array (linear search)
3. Count even and odd numbers
4. Count positive, negative, and zero values
5. Find the second largest value
6. Find the second smallest value

---

### Day 9 — Scanner (User Input) & File Handling

**Day9 – Scanner Input Practice:**
1. Check if a number is positive, negative, or zero
2. Check if a number is even or odd
3. Calculate sum, multiplication, and division of two user-entered numbers

**Day9P1 – File Handling:**
1. Create a new file using `File.createNewFile()`
2. File deletion (commented out — shown for reference)
3. Access file name and absolute path
4. Write content to a file using `FileWriter`

---

## 🛠️ How to Run

### Prerequisites
- Java JDK 8 or above
- Any terminal / IDE (VS Code, IntelliJ, Eclipse)

### Compile & Run

```bash
# Compile
javac Day1.java

# Run
java Day1
```

For files that use user input (Day9):

```bash
javac Day9.java
java Day9
```

---

## 🎯 Key Concepts Covered

| Category              | Topics                                                                 |
|-----------------------|------------------------------------------------------------------------|
| Data Types            | `int`, `long`, `short`, `byte`, `float`, `double`, `char`, `boolean`  |
| Operators             | Arithmetic, Assignment, Relational, Logical, Increment/Decrement       |
| Control Flow          | `if-else`, nested `if`, ternary operator, `switch`                    |
| Loops                 | `for`, `while`, `do-while`, `for-each`, `break`, `continue`           |
| Strings               | `String`, `StringBuffer`, `StringBuilder` with all major methods       |
| Math                  | `Math.round()`, `sqrt()`, `pow()`, `random()`, `max()`, `min()`       |
| Date & Time           | `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`, `Calendar` |
| Methods               | All 4 types, method overloading concept                               |
| Arrays                | 1D arrays, 2D arrays, search, sort-related logic, for-each            |
| User Input            | `Scanner` class – `nextInt()`, `nextDouble()`                         |
| File Handling         | `File`, `FileWriter`, `IOException`                                   |

---

## 👤 Author

**R. Kirubhakaran**  
MSc Mathematics | Aspiring Java Full Stack Developer  

