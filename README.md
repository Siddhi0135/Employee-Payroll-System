
# Payroll System  

## Overview  
This **Payroll System** is a simple Java application that demonstrates object-oriented programming (OOP) principles such as **inheritance**, **encapsulation**, **polymorphism**, and **abstraction**. The project allows users to manage employees, including adding full-time and part-time employees, calculating their salaries, and managing employee records such as removing employees from the system.

---

## Features  
- **Employee Management:** Add and remove employees easily.  
- **Salary Calculation:** Calculate the salary for both full-time and part-time employees:  
  - Full-time employees have fixed monthly salaries.  
  - Part-time employees have salaries calculated based on hours worked and hourly rate.  
- **Dynamic Display:** Display employee details with a clean and concise output.  
- **Encapsulation:** Secure data using getter methods for `name` and `id`.  
- **Abstraction:** Abstract base class `Employee` to provide a blueprint for employee types.  

---

## Example Output  
### Input:  
- Add Full-Time Employee: `Siddhi` with ID `1` and salary `70000.0`.  
- Add Part-Time Employee: `Mani` with ID `2`, `40` hours worked at a rate of `100`.  
- Remove Employee with ID `2`.  

### Output:  
```
Initial employee details:
Employee[name=Siddhi, id=1, salary=70000.0]
Employee[name=Mani, id=2, salary=4000.0]

Removing Employee with ID 2

Remaining Employee Details:
Employee[name=Siddhi, id=1, salary=70000.0]
```

---

## Technologies Used  
- **Programming Language:** Java  
- **Key Concepts:**  
  - Object-Oriented Programming (OOP)  
  - Abstraction, Encapsulation, Inheritance, and Polymorphism  

---

## How to Run  
1. Clone the repository or download the files.  
2. Compile and run the program using a Java IDE or the command line.  
   - **Command Line:**  
     ```bash  
     javac Main.java  
     java Main  
     ```  
3. Follow the prompts to manage employees and view details.  

---

## Future Enhancements  
- Add a graphical user interface (GUI) for better user interaction.  
- Implement file handling to persist employee data.  
- Include additional employee types (e.g., freelancers or interns).  
- Add functionality to calculate bonuses and deductions.  

---
