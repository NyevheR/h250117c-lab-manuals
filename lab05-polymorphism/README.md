# Lab 5: Polymorphism

## Files
Programs from the lab manual (pasted unchanged):
- `Calculator.java` - Program 5.1 (overloading)
- `Shapes.java` - Program 5.2 (overriding and dynamic dispatch)
- `CastingDemo.java` - Program 5.3 (casting, instanceof, what is not polymorphic)

Exercise solutions:
- `PrintOverload.java` - Basic 1
- `FarmAnimal.java`, `Cat.java`, `Cow.java`, `Duck.java`, `FarmDemo.java` - Basic 2
- `Employee.java`, `Manager.java`, `Developer.java`, `Intern.java`, `PayrollDemo.java` - Intermediate 1
- `FieldVsMethod.java` - Intermediate 2
- `Payment.java`, `CardPayment.java`, `MobileMoneyPayment.java`, `PaymentProcessorV1.java`, `PaymentProcessorV2.java`, `PaymentDemo.java` - Challenge
- `output.txt` - real output from running every program

## Run
```
javac *.java
java Calculator
java Shapes
java CastingDemo
java PrintOverload
java FarmDemo
java PayrollDemo
java FieldVsMethod
java PaymentDemo
```

## Answers
**Basic 1 - Overloaded print**
- Four methods share the name `print` but take `int`, `double`, `String` and `int[]`.
- The compiler picks the right one from the argument type at compile time (compile-time polymorphism).

**Basic 2 - Animals with sound()**
- The manual's `CastingDemo.java` already defines `Animal`, so the parent here is `FarmAnimal`.
- `Cat`, `Cow` and `Duck` each override `sound()`.
- One `FarmAnimal[]` holds all three. The loop calls `a.sound()` and Java runs the version of the real object (run-time polymorphism).

**Intermediate 1 - Payroll with Intern**
- `Intern extends Employee` and overrides `calculatePay()`.
- The loop in `PayrollDemo` only talks to `Employee`, so it is not changed when `Intern` is added.
- The total payroll is 2000 + 4300 + 3250 + 500 = 10050.

**Intermediate 2 - Field versus method**
- `Parent p = new Child();` then `p.who()` prints `child method`, but `p.label` prints `parent field`.
- Methods are chosen by the real object at run time (dynamic dispatch).
- Fields (and static methods) are chosen by the variable's declared type at compile time, so they are not polymorphic.
- `Child`'s `label` only hides the parent's field; it does not replace it.

**Challenge - PaymentProcessor, two designs**
- Version 1 (`PaymentProcessorV1`): `pay()` checks the type with `instanceof` pattern matching (`p instanceof CardPayment card`).
- Version 2 (`PaymentProcessorV2`): `pay()` only calls `p.process()` and each payment class knows how to process itself.
- The demo adds a brand-new cash payment without touching either processor. V1 says it does not know the type; V2 just works.
- V1 is easy to read for two types, but every new type means editing the processor, and a type can be forgotten.
- V2 is open for extension and closed for modification: add a class, change nothing else. It is the better design.
