# Lab 9: Nested Types, Enums, Records and the Object Contract

## Files
Programs from the lab manual (pasted unchanged):
- `NestedDemo.java` - Program 9.1 (the four kinds of nested class)
- `EnumDemo.java` - Program 9.2 (enums)
- `ObjectContract.java` - Program 9.3 (equals, hashCode, toString, records)

Exercise solutions:
- `Level.java`, `LevelDemo.java` - Basic 1
- `RecordDemo.java` - Basic 2
- `Book.java`, `BookDemo.java` - Intermediate 1
- `LinkedList.java` - Intermediate 2
- `Coin.java`, `CoinDemo.java` - Challenge
- `output.txt` - real output from running every program

## Run
```
javac *.java
java NestedDemo
java EnumDemo
java ObjectContract
java LevelDemo
java RecordDemo
java BookDemo
java LinkedList
java CoinDemo
```

## Answers
**Basic 1 - enum Level**
- `enum Level { LOW, MEDIUM, HIGH }` is a fixed, type-safe list of values.
- `LevelDemo` loops over `Level.values()` and uses a `switch` to print different advice for each level.

**Basic 2 - record Student**
- `record Student(String name, int age) { }` is one line that creates the constructor, accessors, `toString`, `equals` and `hashCode`.
- Printing gives `Student[name=Tariro, age=19]`.
- Two records with the same values are equal (`equals` is true) but are still two different objects (`==` is false).
- A component is read with `s1.name()`.

**Intermediate 1 - Book with equals and hashCode**
- `equals` says two books are equal when their ISBN is equal; `hashCode` uses the same ISBN.
- Rule: if `a.equals(b)` then `a.hashCode()` must equal `b.hashCode()`.
- Adding a second book with ISBN 111 to a `HashSet<Book>` returns `false`, and the set size stays 2.
- Without `hashCode` the set could not find the duplicate, because it first looks in a bucket chosen by the hash code.

**Intermediate 2 - LinkedList with Node and iterator**
- `Node` is a `private static` nested class: it does not need an outer object.
- `ListIterator` is an inner (non-static) class: it reads the list's own `head`, so it needs a `LinkedList` object.
- `LinkedList implements Iterable<String>` and returns a new `ListIterator`, which is what lets it work in a for-each loop.

**Challenge - enum Coin**
- Each constant carries its value: `PENNY(1)`, `NICKEL(5)`, `DIME(10)`, `QUARTER(25)`.
- `fewestCoins(cents)` starts with the biggest coin, takes as many as fit (`/`), keeps the remainder (`%`), then moves to the next coin.
- 68 cents = 2 quarters + 1 dime + 1 nickel + 3 pennies = 7 coins.
