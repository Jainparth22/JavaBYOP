# Smart Student Task Manager

<div align="center">

**A lightweight, efficient Java-based task management system for students**

[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-success.svg)]()

</div>

---

## 📋 Table of Contents

- [Overview](#overview)
- [Problem Statement](#problem-statement)
- [Solution](#solution)
- [Key Features](#key-features)
- [Technologies & Architecture](#technologies--architecture)
- [Project Structure](#project-structure)
- [Installation & Setup](#installation--setup)
- [Usage Guide](#usage-guide)
- [Code Architecture](#code-architecture)
- [File Format](#file-format)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)

---

## Overview

The **Smart Student Task Manager** is a console-based Java application designed to help students organize, track, and manage their academic tasks and deadlines. With an intuitive command-line interface and persistent data storage, this tool enables efficient task management without unnecessary complexity.

Whether you're juggling multiple assignments, project deadlines, or study schedules, this application provides a simple yet powerful solution to stay organized and productive.

---

## Problem Statement

**Challenge:** Students frequently face challenges in managing their daily tasks:
- ❌ Forgotten deadlines leading to missed submissions
- ❌ Disorganized task lists causing increased stress
- ❌ Difficulty prioritizing multiple assignments
- ❌ Loss of task information due to lack of persistence

**Impact:** Poor task management directly affects academic performance and time management skills.

---

## Solution

The Smart Student Task Manager addresses these challenges by providing:

✅ **Simple Task Creation** - Add tasks with title, deadline, and priority level  
✅ **Organized Task Viewing** - Display all tasks in a clear, numbered format  
✅ **Easy Task Deletion** - Remove completed or unnecessary tasks  
✅ **Persistent Storage** - Tasks are automatically saved and loaded from file  
✅ **User-Friendly Interface** - Interactive menu-driven console application  

---

## Key Features

| Feature | Description |
|---------|-------------|
| **Add Tasks** | Create new tasks with title, deadline, and priority (High/Medium/Low) |
| **View Tasks** | Display all tasks with their details in an organized numbered list |
| **Delete Tasks** | Remove tasks by selecting their number from the task list |
| **Persistent Storage** | Auto-save and auto-load tasks using file handling |
| **Priority Management** | Categorize tasks by importance level |
| **Interactive Menu** | Easy-to-use command-line menu system |
| **Error Handling** | Graceful handling of file I/O and invalid inputs |

---

## Technologies & Architecture

### Technology Stack
- **Language:** Java (Object-Oriented Programming)
- **Data Structure:** ArrayList (Dynamic collections)
- **File I/O:** Java File Handling & Scanner/PrintWriter
- **UI:** Console-based interface

### Design Patterns
- **Model-View-Controller (MVC):** Separation of concerns
- **CRUD Operations:** Create, Read, Update (via delete), Delete
- **Singleton Pattern:** TaskManager manages centralized task list
- **Serialization:** CSV-based file format for persistence

---

## Project Structure

```
JavaBYOP/
│
├── src/
│   ├── Main.java              # Application entry point & user interface
│   ├── Task.java              # Task model class with serialization
│   └── TaskManager.java       # Business logic & file operations
│
├── data/
│   └── tasks.txt              # Persistent task storage (CSV format)
│
└── README.md                  # Project documentation
```

### Class Responsibilities

**Main.java**
- Manages user interaction via console menu
- Handles user input and command dispatching
- Initiates TaskManager and coordinates workflow

**Task.java**
- Represents a single task object
- Contains task properties: title, deadline, priority
- Provides serialization methods for file storage

**TaskManager.java**
- Manages task collection (ArrayList)
- Handles file I/O operations (load/save)
- Implements CRUD operations (Add, View, Delete)

---

## Installation & Setup

### Prerequisites
- **Java Runtime Environment (JRE):** Java 11 or higher
- **Operating System:** Windows, macOS, or Linux
- **Text Editor/IDE:** Visual Studio Code, IntelliJ IDEA, Eclipse (optional)

### Steps

1. **Clone or Download the Project**
   ```bash
   git clone <repository-url>
   cd JavaBYOP
   ```

2. **Verify Java Installation**
   ```bash
   java -version
   ```

3. **Compile the Source Files**
   ```bash
   javac -d bin src/*.java
   ```

4. **Create Data Directory** (if not exists)
   ```bash
   mkdir data
   ```

5. **Run the Application**
   ```bash
   java -cp bin Main
   ```

---

## Usage Guide

### Starting the Application
```bash
java -cp bin Main
```

### Menu Options

#### Option 1: Add Task
1. Select "1" from the main menu
2. Enter task title (e.g., "Complete Java Assignment")
3. Enter deadline (e.g., "2026-04-15")
4. Enter priority level: **High**, **Medium**, or **Low**
5. Task is automatically saved

**Example:**
```
===== TASK MANAGER =====
1. Add Task
2. View Tasks
3. Delete Task
4. Exit
Enter choice: 1
Enter title: Complete Java Project
Enter deadline: 2026-04-10
Enter priority (High/Medium/Low): High
Task added!
```

#### Option 2: View Tasks
1. Select "2" from the main menu
2. All tasks are displayed in a numbered list format
3. Tasks show: Number, Title, Deadline, Priority

**Example Output:**
```
1. Complete Java Project | 2026-04-10 | High
2. Study for Midterm | 2026-04-05 | Medium
3. Read Chapter 5 | 2026-04-08 | Low
```

#### Option 3: Delete Task
1. Select "3" from the main menu
2. View tasks are displayed
3. Enter the task number to delete
4. Task is removed and file is updated

#### Option 4: Exit
- Select "4" to safely exit the application
- All changes are preserved in data/tasks.txt

---

## Code Architecture

### Data Flow Diagram
```
User Input (Main.java)
       ↓
   Menu Options
       ↓
TaskManager Operations
       ↓
Task Objects (ArrayList)
       ↓
File System (tasks.txt)
```

### Method Overview

**Task.java:**
- `Task(String title, String deadline, String priority)` - Constructor
- `toFileString()` - Converts task to CSV format
- `fromFileString(String line)` - Parses CSV to Task object

**TaskManager.java:**
- `loadTasks()` - Loads tasks from persistent storage
- `saveTasks()` - Saves tasks to file
- `addTask(Task task)` - Adds and saves a new task
- `viewTasks()` - Displays all tasks
- `deleteTask(int index)` - Removes a task by index

**Main.java:**
- `main(String[] args)` - Application entry point with menu loop

---

## File Format

### tasks.txt Structure
The application stores tasks in **CSV (Comma-Separated Values)** format for simplicity and portability.

**Format:** `title,deadline,priority`

**Example:**
```
Complete Java Project,2026-04-10,High
Study for Midterm,2026-04-05,Medium
Read Chapter 5,2026-04-08,Low
Submit Assignment,2026-04-12,High
```

---

## Future Enhancements

Potential improvements for future versions:

- 📅 **Date Validation** - Validate date format (YYYY-MM-DD)
- 🔍 **Search Function** - Search tasks by keyword or deadline
- 📊 **Task Status** - Mark tasks as complete/pending/in-progress
- 🎨 **GUI Interface** - JavaFX or Swing-based graphical interface
- 🔐 **User Authentication** - Multi-user support with login
- 📧 **Deadline Notifications** - Alert system for approaching deadlines
- ⏮️ **Undo/Redo** - Undo/Redo operations functionality
- 🏷️ **Task Categories** - Organize tasks by subject or course
- 📈 **Task Analytics** - Statistics and productivity insights
- ☁️ **Cloud Sync** - Synchronize tasks across devices

---

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/improvement`)
3. Make your changes and test thoroughly
4. Commit your changes (`git commit -m 'Add improvement'`)
5. Push to the branch (`git push origin feature/improvement`)
6. Open a Pull Request with a detailed description

### Development Guidelines
- Follow Java naming conventions
- Add comments for complex logic
- Test all new features before submitting
- Update README if adding new features

---

## License

This project is licensed under the **MIT License** - see the LICENSE file for details.

---

## Support & Contact

For questions, suggestions, or bug reports:
- 📧 Email: [your-email@example.com]
- 🐛 GitHub Issues: [Create an issue on GitHub]
- 💬 Discussions: [Open a discussion thread]

---

## Acknowledgments

- Java Collections Framework Documentation
- Object-Oriented Programming Principles
- Student feedback for feature prioritization

---

**Made with ❤️ for students managing their academic journey**

Last Updated: March 31, 2026
│   ├── Task.java
│   ├── TaskManager.java
│
├── data/
│   └── tasks.txt
│
├── README.md

---

##  How to Run the Project

1. Open terminal in project directory

2. Navigate to src folder:
   cd src

3. Compile the program:
   javac *.java

4. Run the program:
   java Main

---

##  Sample Usage

1. Add Task → Enter title, deadline, priority
2. View Tasks → Displays all tasks
3. Delete Task → Removes selected task

---

##  Future Enhancements

* GUI using Java Swing
* Task search functionality
* Deadline reminder system
* Mobile or web version

---

##  Author

Parth Jain

---

##  Note

This project is developed as part of the BYOP (Bring Your Own Project) assignment for the Programming in Java course.
