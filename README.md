# 📚 Library Book Borrowing System (Java)

A simple **console-based library system** written in Java.  
The program allows users to view available books, borrow, and return them, with input options via console menus.

---

## ✨ Features
- Stores a list of available books (using `ArrayList`)
- Borrow a book:
  - If available → removes from the list
  - If not available → shows error
- Return a book → adds it back to the list
- Interactive **menu system** (loop-based)
- Extensible for future improvements (e.g. `switch` menus, Scanner input, validation)

---

## 🖥️ Example Run

=== Welcome to the Library System ===

Menu:

1. Show available books
2. Borrow a book
3. Return a book
4. Exit

Choose an option: 1

Available books:
* Harry Potter
* Lord of the Rings
* The Hobbit
* Pride and Prejudice
* To Kill a Mockingbird

---

## 🚀 How to Run
1. Clone the repository:
   git clone https://github.com/your-username/library-system-java.git then cd library-system-java
3. Compile:
   javac LibraryBookBorrowingSystem.java
4. Run:
   java LibraryBookBorrowingSystem

🔮 Future Improvements:
* Fix duplicate removal bug
* Fix printReturnMessage
* Clean up isBookPresent - make it a pure check
* Replace if/else with a switch in menu handling
* Add Scanner input for real user interaction
* Add persistence (e.g. saving borrowed books to a file)
* Extend with user accounts

🧑‍💻 About This Project:
This project was bulit as part of my Java fundamentals learning path, practicing:
* Methods and parameters
* ArrayLists and loops
* Edge cases & defensive programming
* Refactoring for cleaner design
