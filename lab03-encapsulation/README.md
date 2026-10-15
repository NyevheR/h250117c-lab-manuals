# Lab 3: Encapsulation and Access Modifiers

## Files
Programs from the lab manual (pasted unchanged):
- `BankAccount.java` and `BankDemo.java` - Program 3.1 (a safe bank account)
- `Team.java` - Program 3.2 (the defensive-copy trap)

Exercise solutions:
- `Student.java` - Basic 1 and 2 (private fields, checked setter, getGrade())
- `BankAccountWithHistory.java` - Intermediate 1 (transaction history)
- `ImmutablePerson.java` - Intermediate 2 (immutable class)
- `Temperature.java` - Challenge (kelvin stored privately)
- `output.txt` - real output from running every program

## Run
```
javac *.java
java BankDemo
java Team
java Student
java BankAccountWithHistory
java ImmutablePerson
java Temperature
```

## Answers
**Basic 1 - Student with checked marks**
- `name` and `marks` are `private`; outside code uses `getName()`, `getMarks()` and `setMarks()`.
- `setMarks` throws `IllegalArgumentException` for a value below 0 or above 100, so a bad value is never stored.
- The constructor calls `setMarks`, so the same check also protects object creation.

**Basic 2 - getGrade()**
- A: 70 or more, B: 60 to 69, C: 50 to 59, F: below 50.
- The grade is calculated from `marks` each time instead of being stored, so it can never disagree with the marks.

**Intermediate 1 - Transaction history**
- The manual's `BankAccount.java` is kept unchanged, so the extended version is the separate class `BankAccountWithHistory`.
- Every deposit and withdrawal (even a failed one) adds a line to a private list.
- `getHistory()` returns `Collections.unmodifiableList(new ArrayList<>(history))`: a copy that is also read-only.
- The demo tries `getHistory().add(...)` and gets `UnsupportedOperationException`. Even if it worked, it would only change the copy.

**Intermediate 2 - ImmutablePerson, each design choice**
- `final class`: nobody can extend it and add setters or changeable fields.
- `private final` fields: they are set once in the constructor and can never be reassigned.
- No setters: the outside world has no way to change the values.
- `withAge()` builds a new object instead of changing the old one.
- Benefit: safe to share, nothing can change it by surprise.

**Challenge - Temperature in kelvin**
- Kelvin is the hidden internal value. Callers only use `setCelsius`, `getCelsius` and `getFahrenheit`.
- `setCelsius` rejects anything that would be below 0 kelvin (below -273.15 C).
- If the internal unit changed to Celsius, only the bodies of these methods would change. Their names and types stay the same, so no calling code breaks.
