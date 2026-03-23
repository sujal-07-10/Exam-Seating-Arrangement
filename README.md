# Exam-Seating-Arrangement
# Exam Seating Arrangement Checker (Java)

## 📌 Overview

This is a Java console-based application that manages exam seating arrangements by assigning students to seats based on their roll numbers. The system ensures that no seat is assigned more than once and organizes students into two classrooms.

---

## 🚀 Features

* Add student using roll number and name
* Automatic classroom allocation:

  * Classroom 1 → Roll No. 1–10
  * Classroom 2 → Roll No. 11–20
* Prevents duplicate seat assignment
* Displays seating arrangement for both classrooms
* Menu-driven user interface
* Handles invalid roll numbers

---

## 🛠️ Technologies Used

* Java (Core Java)
* Arrays
* Conditional Statements (`if-else`)
* Loops (`for`, `do-while`)
* Scanner Class (for user input)

---

## ⚙️ How It Works

1. User selects an option from the menu:

   * Add Student
   * Display Seating
   * Exit
2. When adding a student:

   * Roll number determines classroom and seat
   * System checks if seat is already occupied
3. Display shows:

   * Seat number
   * Roll number
   * Student name

---

## ▶️ How to Run

### Compile:

```
javac ExamSeating.java
```

### Run:

```
java ExamSeating
```

---

## 📋 Example

```
1. Add Student
2. Display Seating
3. Exit

Enter choice: 1
Enter Roll No: 5
Enter Name: Rahul
Assigned Seat 5 in Classroom 1
```

---

## ⚠️ Limitations

* Supports only 20 students
* Fixed two classrooms
* Console-based (no GUI)
* No data persistence

---

## 🔮 Future Improvements

* Dynamic student limit
* GUI using Java Swing/JavaFX
* File or database storage
* Multiple classroom support

---


