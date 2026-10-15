# Lab 7: Exception Handling

## Files
Programs from the lab manual (pasted unchanged):
- `ExceptionBasics.java` - Program 7.1 (try, catch, finally)
- `InsufficientFundsException.java` and `Wallet.java` - Program 7.2 (custom checked exception)
- `ResourceDemo.java` - Program 7.3 (try-with-resources, exception chaining)

Exercise solutions:
- `DivideNumbers.java` - Basic 1
- `ArrayAccess.java` - Basic 2
- `InvalidAgeException.java`, `AgeValidator.java` - Intermediate 1
- `BankAccount.java`, `BankDemo.java` - Intermediate 2 (uses the manual's `InsufficientFundsException`)
- `FinallyDemo.java` - Challenge
- `output.txt` - real output from running every program

## Run
```
javac *.java
java ExceptionBasics
java Wallet
java ResourceDemo
java DivideNumbers      (type two numbers when asked)
java ArrayAccess
java AgeValidator
java BankDemo
java FinallyDemo
```

## Answers
**Basic 1 - DivideNumbers**
- The two inputs are read as text and converted with `Integer.parseInt`.
- `catch (NumberFormatException e)` handles non-numeric input such as `abc`.
- `catch (ArithmeticException e)` handles division by zero.
- After either problem the program prints a message and finishes normally instead of crashing. `output.txt` shows three runs: `10, 2`, `10, 0` and `abc, 5`.

**Basic 2 - ArrayAccess**
- `getElement(data, index)` reads `data[index]` inside a `try`.
- Index 7 in a 3-item array throws `ArrayIndexOutOfBoundsException`; the `catch` explains the valid range and returns -1.
- The "Index 7 does not exist" line appears before "Element 7 = -1" because the method prints while it runs, before its result is printed.

**Intermediate 1 - InvalidAgeException**
- `InvalidAgeException extends Exception`, so it is a checked exception: callers must catch it or declare `throws`.
- `validateAge(int)` is declared `throws InvalidAgeException` and throws it for any age below 0 or above 120.
- The test ages 25 and 120 are valid; 130 and -5 are rejected.

**Intermediate 2 - BankAccount.withdraw throws**
- `withdraw` now `throws InsufficientFundsException` (the manual's class, with a message and a shortfall) instead of returning `false`.
- Trade-offs:
  - Exception: the caller cannot ignore the failure by accident, and it carries the reason and the shortfall.
  - Exception: error handling is kept apart from the normal flow, but every caller needs `try/catch` or `throws`.
  - Boolean: shorter and fine when "not enough money" is an everyday, expected result, but it is easy to forget to check and it gives no details.
  - Exceptions should not be used for ordinary control flow, so the best choice depends on how routine the failure is.

**Challenge - return inside try with finally**
- Prediction: `finally` still runs. In `first()` the `finally` message prints and then 1 is returned.
- In `second()` the value of `x` (1) is remembered at the `return`. `finally` then sets `x = 99`, but the method still returns 1.
- `finally` runs whatever happens (return, exception or normal end), which is why it is used for cleanup.
