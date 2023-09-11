## Part A Coding Challenge

**Near and Far Challenge at Code Differently** 🌍🔍

**Description**:  

Hello there, Astute Algorithms Enthusiast! 🌟 This time around, we have a challenge that's all about perspective. Given an array of integers, can you find the difference between the largest and smallest values? Dive deep into the array, sift through the numbers, and let's see the distance between the peak and the trough!

## **Example 1**:

**Input**:  
array: [10, 3, 5, 6]

**Output**:  
7

**Decoding the Difference**:

```
Highest value -> 10
Lowest value  -> 3
Difference    -> 7
```

## **Example 2**:

**Input**:  
array: [7, 2, 10, 9]

**Output**:  
8

**Decoding the Difference**:

```
Highest value -> 10
Lowest value  -> 2
Difference    -> 8
```

## **Submission**:

Once you've calculated the difference to perfection, don't forget to push your work to GitHub. Let your algorithm stand out and exemplify how you Code Differently! 🚀🌌


## Part B : Library Management System: Java Lab

### Video Lecture

[Overview Video](https://vimeo.com/863293912?share=copy)

**Overview:**  
In this lab, students will design and implement a Library Management System. This system will be responsible for cataloging books, tracking borrowed books, and managing borrowers. The lab will emphasize on object-oriented design, utilization of enumerations, and basic data operations in an ArrayList.

**Java Topics Included in This Lab:**
- Classes and Objects
- ArrayList
- Custom Class Design and Implementation
- Object-Oriented Relationships (Inheritance, Composition)
- Enumerations
- Overriding `toString()` method

**Custom Classes:**

---
- **Person Class**
    - **Attributes:**
        - name: String
        - age: Integer
    - **Methods:**
        - _(name, age)
        - getName():String
        - setName(String):void
        - getAge():Integer
        - setAge(Integer):void
        - toString():String

**Method Description:**

- **_(name, age)**: Constructor to initialize a new `Person` object with a given name and age.
- **getName()**: Retrieves the name of the person.
- **setName(String)**: Sets or updates the name of the person.
- **getAge()**: Retrieves the age of the person.
- **setAge(Integer)**: Sets or updates the age of the person.
- **toString()**: Returns a string representation of the `Person` object, showing its attributes.

---

- **Library**
    - **Attributes:**
        - books: ArrayList<Book>
        - borrowers: ArrayList<Borrower>
    - **Methods:**
        - _()
        - addBook(Book): void
        - removeBook(Book): Boolean
        - addBororwer(Borrower):Boolean
        - searchBook(title): Book
        - searchBororwer(borrowerID):Borrower
        - borrowBook(Borrower):Boolean
        - toString():String

**Method Description:**

- **_()**: Constructor to initialize a new `Library` object with empty books and borrowers lists.
- **addBook()**: Adds a new book to the library's catalog (books list).
- **removeBook()**: Removes a book from the library's catalog (books list) if it exists.
- **addBorrower(Borrower)**: Registers a new borrower to the library.
- **searchBook(title)**: Searches the library catalog for books that match the given title and returns them.
- **searchBorrower(borrowerID)**: Searches for a borrower in the library system using the borrower's unique ID.
- **borrowBook(Borrower)**: Allows a borrower to borrow a book from the library if it's available.
- **toString()**: Returns a string representation of the `Library` object, showing its attributes.

---

- **Borrower (extends Person)**
    - **Attributes:**
        - *static* borowerCount:int
        - id: int
        - borrowedBooks: ArrayList<Book>
        - address: String
        - email: String
    - **Methods:**
        - _(name, age, address, email)
        - borrow(book): boolean
        - returnBook(book): boolean
        - getAddress():String
        - setAddress(String):void
        - getEmail():String
        - setEmail(String):void
        - toString():String

**Method Description:**

- **_(name, age, address, email)**: Constructor to initialize a new `Borrower` object with name, age, address, and email.
- **borrow(book)**: Borrows a specific book from the library using its unique ID.
- **returnBook(book)**: Returns a specific book to the library using its unique ID.
- **getAddress()**: Retrieves the address of the borrower.
- **setAddress(String)**: Sets or updates the address of the borrower.
- **getEmail()**: Retrieves the email of the borrower.
- **setEmail(String)**: Sets or updates the email of the borrower.
- **toString()**: Returns a string representation of the `Borrower` object, showing its attributes.

---

- **Author (extends Person)**
    - **Attributes:**
        - *static* authorCount:int
        - authorID: int
        - biography: String
    - **Methods:**
        - _(name, age, biography)
        - writeBook(): void
        - updateBio(): void
        - toString():String


**Method Description:**

- **_(name, age, biography)**: Constructor to initialize a new `Author` object with a name, age, and biography.
- **writeBook()**: Represents the action of an author writing a new book. This could be utilized to add a new book to the library's catalog.
- **updateBio()**: Updates or sets the biography of the author.
- **toString()**: Returns a string representation of the `Author` object, showing its attributes.

---

- **Book**
    - **Attributes:**
        - *static* bookCount:int
        - id: int
        - title: String
        - status: BookStatus
        - genre: BookGenre
        - author: Author
        - toString():String
    - **Methods:**
        - search(title): ArrayList<Book>
        - getTitle():String
        - setTitle(String):void
        - getStatus():BookStatus
        - setStatus(BookStatus):void
        - getGenre():BookGenre
        - setGenre(BookGenre):void
        - getAuthor():Author
        - setAuthor(Author):void
        - toString():String

---

**Method Description:**

- **search(title)**: Searches for books within a collection that match the given title and returns them.
- **getTitle()**: Retrieves the title of the book.
- **setTitle(String)**: Sets or updates the title of the book.
- **getStatus()**: Retrieves the current status of the book (e.g., available, borrowed).
- **setStatus(BookStatus)**: Sets or updates the status of the book.
- **getGenre()**: Retrieves the genre of the book.
- **setGenre(BookGenre)**: Sets or updates the genre of the book.
- **getAuthor()**: Retrieves the author of the book.
- **setAuthor(Author)**: Sets or updates the book's author.
- **toString()**: Returns a string representation of the `Book` object, showing its attributes.


**Enumerations:**

- **BookStatus**
    - AVAILABLE
    - BORROWED
    - IN_REPAIR
    - LOST

- **BookGenre**
    - FICTION
    - NON_FICTION
    - MYSTERY
    - SCIENCE_FICTION

**User Stories and Requirements:**

1. **User Story:** As a library, I want to add a new book to the catalog.
    - **Requirements:**
        - Use the `Library` class's `addBook()` method to add a new book instance to the `books` ArrayList.
        - Ensure that each book is assigned a unique ID by leveraging the `bookCount` static attribute.

2. **User Story:** As a library, I want to register a new borrower.
    - **Requirements:**
        - Use the `Library` class's `addBorrower()` method to add a new borrower instance to the `borrowers` ArrayList.
        - Ensure each borrower has a unique ID by leveraging the `borrowerCount` static attribute in the borrower class.

3. **User Story:** As a borrower, I want to search for a book by its title.
    - **Requirements:**
        - Use the `Book` class's `search()` method to find books based on partial or full title matches.
        - Display matching books using the `toString()` method.

4. **User Story:** As a borrower, I want to borrow a book from the library.
    - **Requirements:**
        - Use the `Borrower` class's `borrow()` method.
        - Update the `status` attribute of the book instance to `BookStatus.BORROWED`.

5. **User Story:** As a borrower, I want to return a borrowed book.
    - **Requirements:**
        - Use the `Borrower` class's `returnBook()` method.
        - Update the `status` attribute of the book instance to `BookStatus.AVAILABLE`.

6. **User Story:** As a library, I want to categorize books by genre.
    - **Requirements:**
        - Utilize the `BookGenre` enumeration for specifying a book's genre (e.g., Fiction, Non-Fiction, Mystery, etc.).
        - Ensure the genre is displayed when using the `Book` class's `toString()` method.

7. **User Story:** As an author, I want to create a biography.
    - **Requirements:**
        - Use the `Author` class's `updateBio()` method to set or update the biography.
        - Ensure that each author is assigned a unique author ID by leveraging the `authorCount` static attribute.

8. **User Story:** As a user, I want a clear representation of objects in textual format.
    - **Requirements:**
        - Override the `toString()` method in each class (`Person`, `Library`, `Borrower`, `Author`, `Book`) to return a clear and readable string representation of its attributes.

---
````