# Lab 1: Classes and Objects

## Files
Programs from the lab manual (pasted unchanged):
- `Student.java` - Program 1.1 (a Student class with fields and methods)
- `ReferenceDemo.java` - Program 1.2 (references, aliasing and null)
- `Course.java` - Program 1.3 (an object that holds another object)

Exercise solutions:
- `Car.java` - Basic 1 and 2 (Car, display(), isAntique())
- `Rectangle.java` - Intermediate 1 (area, perimeter, largest of 5)
- `RectangleAlias.java` - Intermediate 2 (reference aliasing)
- `Address.java`, `Person.java` - Challenge (Person has an Address, null handling)
- `output.txt` - real output from running every program

## Run
```
javac *.java
java Student
java ReferenceDemo
java Course
java Car
java Rectangle
java RectangleAlias
java Person
```

## Answers
**Basic 1 - Car class**
- `Car` has the fields `brand`, `year` and `mileage`, and a method `display()` that prints them.
- Three `Car` objects are created in `main` with `new Car()`, each with its own values.

**Basic 2 - isAntique()**
- `isAntique()` works out the age (2026 minus `year`) and returns `true` when the age is more than 25.
- Only the 1975 Ford is antique (51 years old). The 2005 Mazda is 21, so it is not.

**Intermediate 1 - Rectangle**
- `area()` = width x height and `perimeter()` = 2 x (width + height).
- Five rectangles are stored in an array. A loop keeps the one with the biggest area in `biggest`.
- The largest in the sample data is 6 x 6 (area 36).

**Intermediate 2 - Prediction and explanation**
- Prediction: `r1.width` prints `20.0`, not `5.0`.
- `Rectangle r2 = r1;` copies the reference (the address), not the object.
- r1 and r2 are two names for one object, so changing `r2.width` also changes what `r1` sees.
- `r1 == r2` is `true` because `==` on objects compares references.
- To get a separate copy you must create a new object with `new` and copy the fields across.

**Challenge - Person and Address**
- A `Person` has a field of type `Address`, which is a reference to another object.
- Chained dots: `person.address.city` means person, then its address, then its city.
- If `address` was never set it is `null`, and `person.address.city` throws `NullPointerException`.
- Safe approach: check `if (person.address != null)` before using it. `Person.java` shows both the check and the crash being caught.
