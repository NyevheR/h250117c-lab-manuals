# Object-Oriented Programming in Java - Lab Manual Solutions

Solutions to labs 1 to 10 of the *Object-Oriented Programming in Java - University Lab Manual*.

Name               :Tatenda Ruth Mahwte

Reg number         : H250740W

Course             : OOP

Course Code        : ICS2101

## Contents

| Lab | Topic | Folder |
| --- | --- | --- |
| 1 | Classes and objects | [lab01-classes-objects](lab01-classes-objects) |
| 2 | Constructors, `this`, `static` | [lab02-constructors-static](lab02-constructors-static) |
| 3 | Encapsulation | [lab03-encapsulation](lab03-encapsulation) |
| 4 | Inheritance | [lab04-inheritance](lab04-inheritance) |
| 5 | Polymorphism | [lab05-polymorphism](lab05-polymorphism) |
| 6 | Abstraction | [lab06-abstraction](lab06-abstraction) |
| 7 | Exception handling | [lab07-exceptions](lab07-exceptions) |
| 8 | Generics and collections | [lab08-generics-collections](lab08-generics-collections) |
| 9 | Nested types, enums, records | [lab09-nested-enums-records](lab09-nested-enums-records) |
| 10 | File I/O, lambdas, streams | [lab10-fileio-streams](lab10-fileio-streams) |

## Each lab folder contains
- the `.java` programs copied unchanged from the lab manual, plus the exercise solutions (one public class per file, no packages)
- `README.md` with the file list, the run commands and point-form answers to the exercises
- `output.txt` with the real output of every program in the lab

## How to run any lab
Requires JDK 17 or later (developed and tested on JDK 21).
```
cd lab01-classes-objects
javac *.java
java Car
```
Each lab folder is compiled on its own, so class names such as `Student` or `BankAccount` can repeat across labs without clashing.
