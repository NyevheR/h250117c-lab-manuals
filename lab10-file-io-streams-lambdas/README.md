# Lab 10: File I/O, Lambdas and Streams

## Files
Programs from the lab manual (pasted unchanged):
- `FileDemo.java` - Program 10.1 (reading and writing text files; creates `students.txt`)
- `StudentRepository.java` - Program 10.2 (saving and loading objects as CSV; contains the `Learner` record)
- `StreamDemo.java` - Program 10.3 (lambdas, method references and streams)

Exercise solutions:
- `SaveAndRead.java` - Basic 1
- `RemoveEvens.java` - Basic 2
- `FileStats.java` with `sample.txt` - Intermediate 1
- `AboveAverage.java` - Intermediate 2
- `GroupLearners.java` with `learners.csv` - Challenge (uses `Learner` and `StudentRepository` from Program 10.2)
- `output.txt` - real output from running every program

## Run
```
javac *.java
java FileDemo
java StudentRepository
java StreamDemo
java SaveAndRead        (type five lines when asked)
java RemoveEvens
java FileStats
java AboveAverage
java GroupLearners
```
The programs write their files (`students.txt`, `notes.txt`, `report-A.txt` and so on) into the folder you run them from.
The byte count printed by `FileDemo` can differ slightly on Windows because of line endings (the manual says this too).

## Answers
**Basic 1 - SaveAndRead**
- Five lines are read with `Scanner` into a list and saved with `Files.write(path, lines)` to `notes.txt`.
- `Files.readAllLines(path)` reads them back and prints each line.
- Both calls can throw `IOException` (a checked exception), so they sit inside `try/catch`.

**Basic 2 - RemoveEvens**
- `Predicate<Integer> isEven = n -> n % 2 == 0;` is a lambda: a test that answers true or false.
- `numbers.removeIf(isEven)` deletes every item for which the predicate is true.
- Result: `[1, 2, ..., 10]` becomes `[1, 3, 5, 7, 9]`.

**Intermediate 1 - FileStats**
- The file `sample.txt` is read with `Files.readAllLines`.
- Lines = number of items in the list (4, including one blank line).
- Words = for every non-blank line, `trim().split("\\s+").length` (17 in total).
- Characters = sum of `line.length()`, not counting line breaks (92).

**Intermediate 2 - Above-average students**
- `Student` is a record with a name and a mark.
- `mapToDouble(...).average()` gives the class average (67.8).
- `filter` keeps marks above the average, `map` keeps only the names, `sorted()` puts them in A to Z order, `forEach` prints them.
- Result: Amina, Mary, Zawadi.

**Challenge - Group learners by grade band**
- `learners.csv` is written with `StudentRepository.saveAll` and loaded with `loadAll`.
- `Collectors.groupingBy(l -> band(l.gpa()), TreeMap::new, Collectors.toList())` builds a map from band letter to learners.
- Bands: A is a GPA of 3.5 or more, B is 3.0 to 3.49, C is below 3.0.
- One file is written per band: `report-A.txt` (3 learners), `report-B.txt` (2) and `report-C.txt` (2).
- Running `StudentRepository` (Program 10.2) afterwards overwrites `learners.csv` with its own two learners. Run `GroupLearners` again and it rewrites the data.
