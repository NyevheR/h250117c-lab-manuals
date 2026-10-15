# Lab 4: Inheritance

## Files
Programs from the lab manual (pasted unchanged):
- `Employee.java`, `Manager.java`, `Developer.java`, `CompanyDemo.java` - Program 4.1 (employee hierarchy)
- `Chain.java` - Program 4.2 (constructor order with three levels)
- `CompositionDemo.java` - Program 4.3 (final, Object methods and composition)

Exercise solutions:
- `Person.java`, `Student.java`, `Teacher.java`, `PersonDemo.java` - Basic 1 and 2
- `Vehicle.java`, `PetrolCar.java`, `ElectricCar.java`, `VehicleDemo.java` - Intermediate 1
- `Animal.java`, `Dog.java` - Intermediate 2
- `BadStack.java`, `GoodStack.java` - Challenge
- `output.txt` - real output from running every program

## Run
```
javac *.java
java CompanyDemo
java Chain
java CompositionDemo
java PersonDemo
java VehicleDemo
java Dog
java BadStack
java GoodStack
```

## Answers
**Basic 1 and 2 - Person, Student, Teacher**
- `Person` holds `name`, `age` and `display()`.
- `Student extends Person` adds `course`; `Teacher extends Person` adds `subject`.
- Neither subclass rewrites `display()`; both inherit it, which is code reuse.
- `student instanceof Person` and `teacher instanceof Person` are both true (an IS-A relationship).

**Intermediate 1 - Constructor order (multilevel)**
- The manual's `CompositionDemo.java` already contains a class named `Car`, so the middle class here is called `PetrolCar`.
- Creating an `ElectricCar` prints: Vehicle constructor, then PetrolCar constructor, then ElectricCar constructor.
- Each constructor starts with `super()` (Java adds it automatically), so the parent is always finished first.
- Construction runs top-down: the base class is built before the part that depends on it.

**Intermediate 2 - Why `class Dog extends Animal` can fail to compile**
- `Animal` only has `Animal(String name)`, so it has no no-argument constructor.
- Every constructor must start by calling a superclass constructor. If you do not write one, Java inserts `super()`.
- `super()` needs a no-argument `Animal` constructor, which does not exist, so the compiler reports:
  `constructor Animal in class Animal cannot be applied to given types` (required: String, found: no arguments).
- Fix 1: write `super(name);` in `Dog` (done in `Dog.java`).
- Fix 2: add a no-argument constructor to `Animal`.
- The broken code is shown in the comment at the top of `Dog.java`.

**Challenge - Stack: inheritance versus composition**
- `BadStack extends ArrayList` (IS-A). It works, but it wrongly exposes every ArrayList method: `add(index, item)`, `remove(index)`, `get`, `set`, `clear` and more.
- The demo uses `add(0, "SNEAKY")` and `remove(1)` to break the last-in-first-out rule.
- `GoodStack` has a private `ArrayList` inside (HAS-A) and shows only `push`, `pop`, `peek` and `isEmpty`.
- A stack is not really a kind of ArrayList, so composition is the correct design.
