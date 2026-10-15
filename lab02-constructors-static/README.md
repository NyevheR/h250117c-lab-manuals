# Lab 2: Constructors, `this` and `static`

## Files
Programs from the lab manual (pasted unchanged):
- `Book.java` - Program 2.1 (constructors, `this(...)`, static counter)
- `InitOrder.java` - Program 2.2 (order of initialisation)
- `Point.java` - Program 2.3 (copy constructor)

Exercise solutions:
- `Circle.java` - Basic 1 and 2 (constructors, default radius, static counter)
- `Employee.java` - Intermediate 1 (auto id, three constructors, copy constructor)
- `InitBlocks.java` - Intermediate 2 (two static blocks and two instance blocks)
- `Temperature.java` - Challenge (static factory methods, private constructor)
- `output.txt` - real output from running every program

## Run
```
javac *.java
java Book
java InitOrder
java Point
java Circle
java Employee
java InitBlocks
java Temperature
```

## Answers
**Basic 1 - Circle constructors**
- `Circle(double radius)` stores the radius. `Circle()` calls `this(1.0)`, so the default radius is 1.0.
- `this(...)` must be the first line of the constructor.

**Basic 2 - static counter**
- `private static int count` is one shared copy for all circles; every constructor adds 1.
- `Circle.getCount()` is a static getter, so it is called on the class and needs no object.
- Two circles were created, so it prints 2.

**Intermediate 1 - Employee**
- A static `nextId` gives each new employee the next number (1, 2, 3, 4).
- Three overloaded constructors: (name, salary), (name) and (nothing). The shorter ones call the full one with `this(...)`.
- The copy constructor `Employee(Employee other)` copies name and salary into a new object, which gets its own new id.

**Intermediate 2 - Prediction for the static and instance blocks**
- Prediction: `static block 1`, `static block 2`, `main starts`, then for every `new`: `instance block 1`, `instance block 2`, `constructor`.
- Static blocks run once, when the class is first loaded, in the order written.
- Instance blocks run before the constructor body every time an object is created, in the order written.
- Two objects were created, so the instance lines appear twice. The output confirms the prediction.

**Challenge - Temperature static factories**
- The constructor is `private`, so objects are made only with `Temperature.fromCelsius(...)` or `Temperature.fromFahrenheit(...)`.
- Static factories are clearer because the method name says what the number means.
- Two constructors `Temperature(double)` for Celsius and for Fahrenheit are impossible, since they would have the same signature.
- A factory can also check values, convert units, or reuse existing objects before returning one.
