# Lab 6: Abstraction, Abstract Classes and Interfaces

## Files
Programs from the lab manual (pasted unchanged):
- `VehicleDemo.java` - Program 6.1 (abstract class). The manual names this file `Vehicle.java`, but it contains `public class VehicleDemo`, which Java only accepts in a file called `VehicleDemo.java`. The code itself is unchanged.
- `InterfaceDemo.java` - Program 6.2 (interfaces, default methods, multiple implementation)
- `ComparableDemo.java` - Program 6.3 (Comparable)

Exercise solutions:
- `Shape.java`, `Circle.java`, `Rectangle.java`, `Square.java`, `ShapeDemo.java` - Basic 1
- `Flyable.java`, `Bird.java`, `Aeroplane.java`, `FlyDemo.java` - Basic 2
- `Account.java`, `SavingsAccount.java`, `CurrentAccount.java`, `AccountDemo.java` - Intermediate 1
- `Student.java`, `StudentSortDemo.java` - Intermediate 2
- `Hello1.java`, `Hello2.java`, `DefaultConflict.java` - Challenge
- `output.txt` - real output from running every program

## Run
```
javac *.java
java VehicleDemo
java InterfaceDemo
java ComparableDemo
java ShapeDemo
java FlyDemo
java AccountDemo
java StudentSortDemo
java DefaultConflict
```

## Answers
**Basic 1 - Abstract Shape**
- `Shape` declares `abstract double area()` and `abstract double perimeter()` with no bodies, plus a normal `describe()` method.
- `Circle`, `Rectangle` and `Square` must implement both abstract methods.
- `new Shape()` does not compile because an abstract class cannot be instantiated.

**Basic 2 - Flyable interface**
- `Flyable` has one method, `fly()`. `Bird` and `Aeroplane` both `implements Flyable` but share no parent class.
- An interface describes a capability that unrelated classes can have.

**Intermediate 1 - Abstract Account**
- `deposit()` is written once in `Account` and inherited. `monthlyFee()` is abstract.
- `SavingsAccount` charges 2.0 and `CurrentAccount` charges 10.0.
- An abstract class fits here because the accounts share state (`balance`) and code (`deposit`).

**Intermediate 2 - Comparable and Comparator**
- `Student implements Comparable<Student>`; `compareTo` compares names, so the natural order is alphabetical.
- `MarksComparator implements Comparator<Student>` is a second, separate ordering: highest marks first.
- `Collections.sort(list)` uses `compareTo`; `Collections.sort(list, new MarksComparator())` uses the comparator.

**Challenge - Conflicting default methods**
- `Hello1` and `Hello2` both give a default `hello()`. A class that implements both without choosing does not compile:
  `types Hello1 and Hello2 are incompatible; class inherits unrelated defaults for hello()`.
- The rule: when two interfaces provide the same default method, the class must override it itself.
- Inside the override, `Hello1.super.hello()` and `Hello2.super.hello()` call the version from a chosen interface.
