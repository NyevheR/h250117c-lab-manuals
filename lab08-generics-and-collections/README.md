# Lab 8: Generics and the Collections Framework

## Files
Programs from the lab manual (pasted unchanged):
- `GenericsDemo.java` - Program 8.1 (generic class and methods)
- `CollectionsDemo.java` - Program 8.2 (List, Set, Map)
- `SortingDemo.java` - Program 8.3 (Comparable and Comparator)

Exercise solutions:
- `ListStats.java` - Basic 1
- `RemoveDuplicates.java` - Basic 2
- `Stack.java`, `StackDemo.java` - Intermediate 1
- `WordFrequency.java` - Intermediate 2
- `BubbleSort.java` - Challenge
- `output.txt` - real output from running every program

## Run
```
javac *.java
java GenericsDemo
java CollectionsDemo
java SortingDemo
java ListStats
java RemoveDuplicates
java StackDemo
java WordFrequency
java BubbleSort
```

## Answers
**Basic 1 - ListStats**
- Ten integers are stored in an `ArrayList<Integer>`.
- One loop adds them up (sum 175) and tracks the largest (maximum 40).
- A second loop walks from the last index to 0 to print the list in reverse.

**Basic 2 - RemoveDuplicates**
- A `Set` does not allow duplicates, so `new LinkedHashSet<>(names)` drops the repeats.
- `LinkedHashSet` also keeps the original order. (`HashSet` would remove repeats but not keep the order.)

**Intermediate 1 - Generic Stack<T>**
- `Stack<T>` is backed by an `ArrayList<T>` with `push`, `pop`, `peek` and `isEmpty`.
- `T` is chosen by the user, so the same class works as `Stack<Integer>` and `Stack<String>` with no casts.
- `pop` and `peek` on an empty stack throw `IllegalStateException`.

**Intermediate 2 - Word frequency**
- The text is lower-cased, punctuation removed, then split into words.
- A `TreeMap<String, Integer>` counts each word (`getOrDefault(word, 0) + 1`).
- The entries are copied to a list and sorted by count, highest first. Equal counts stay in alphabetical order.
- Result: `the` appears 5 times, `saw` 3 times, then `bird`, `cat` and `dog` twice each.

**Challenge - Generic bubbleSort**
- `static <T extends Comparable<T>> void bubbleSort(T[] arr)` accepts any array whose items can be compared with `compareTo`.
- It sorts both an `Integer[]` and a `String[]`.
- `int[]` does not work because generics only work with reference types (type erasure removes `T` at run time, and `T` must be a class). `int` is a primitive with no `compareTo`.
- The compiler says: `inference variable T has incompatible bounds` (equality constraint `int`, upper bound `Comparable<T>`).
- Use `Integer[]` (autoboxing) instead of `int[]`.
