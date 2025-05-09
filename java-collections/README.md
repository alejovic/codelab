# 📘 Java Collections Study Plan

A comprehensive plan to learn Java Collections: including concepts, version history, enhancements, and exercises.

---

## 🧭 Week 1: Foundations and Core Interfaces

### 📅 Day 1: Introduction to Java Collections

**Topics**
- What is the Java Collections Framework (JCF)?
- History: Introduced in **Java 1.2**
- Benefits: Reusability, performance, polymorphism
- Relationship with arrays

**Key Interfaces**
- `Collection`
- `List`, `Set`, `Queue`
- `Map` (not a subinterface of Collection)

**Resources**
- [Oracle Collections Tutorial](https://docs.oracle.com/javase/tutorial/collections/index.html)
- JavaDoc for `java.util.Collection`

**Exercises**
- Add/remove elements from an `ArrayList`
- Convert array to collection and vice versa

---

### 📅 Day 2: List Interface

**Topics**
- `List`: Ordered, indexed, allows duplicates
- Implementations: `ArrayList`, `LinkedList`, `Vector`, `Stack`

**Enhancements**
- Java 8: Stream operations
- Java 9: `List.of(...)`

**Exercises**
- Compare `ArrayList` vs `LinkedList` performance
- Implement a To-Do list app

---

### 📅 Day 3: Set Interface

**Topics**
- `Set`: No duplicates
- Implementations: `HashSet`, `LinkedHashSet`, `TreeSet`
- Importance of `equals()` and `hashCode()`

**Enhancements**
- Java 8: Streams, lambda support
- Java 9: `Set.of(...)`

**Exercises**
- Remove duplicates from a list
- Sort and store unique values with `TreeSet`

---

### 📅 Day 4: Queue Interface

**Topics**
- `Queue` and `Deque` behavior
- Implementations: `LinkedList`, `PriorityQueue`, `ArrayDeque`

**Enhancements**
- Java 6: `Deque` interface
- Java 8+: Stream support

**Exercises**
- Implement a task scheduler
- Use `PriorityQueue` for priority-based processing

---

## 🧭 Week 2: Maps, Legacy, and Enhancements

### 📅 Day 5: Map Interface

**Topics**
- `Map<K, V>` interface
- Implementations: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`, `ConcurrentHashMap`

**Enhancements**
- Java 8: `computeIfAbsent()`, `merge()`, `forEach()`
- Java 9: `Map.of(...)`
- Java 10+: `var` support

**Exercises**
- Word frequency counter
- Group names by starting letter

---

### 📅 Day 6: Legacy and Utilities

**Topics**
- Legacy classes: `Vector`, `Stack`, `Hashtable`
- `Collections` and `Arrays` utility classes
- `Comparator` and `Comparable`

**Exercises**
- Sort custom objects
- Use `Collections.shuffle()`, `Collections.reverse()`

---

### 📅 Day 7: Enhancements & Best Practices

**Topics**
- **Version history:**
  - Java 1.2 – JCF introduced
  - Java 5 – Generics
  - Java 6 – NavigableMap/Set
  - Java 7 – Diamond operator
  - Java 8 – Streams, lambdas, default methods
  - Java 9 – `List.of()`, `Set.of()`, `Map.of()`
  - Java 10–17 – Minor improvements
- Thread-safe vs non-thread-safe collections
- Performance tips

**Exercises**
- Migrate legacy code to modern collections
- Benchmark `HashMap` vs `TreeMap`

---

## ✅ Optional: Advanced Concepts & Interview Prep

### 📅 Day 8+: Concurrency and Special Maps

**Topics**
- `ConcurrentHashMap`, `CopyOnWriteArrayList`
- `BlockingQueue`, `DelayQueue`
- `WeakHashMap`, `EnumMap`

**Exercises**
- Build a thread-safe cache
- Producer-consumer pattern with `BlockingQueue`

---

## 📈 Extra Resources

**Tools**
- Java VisualVM or IDE debugger
- [JMH](https://openjdk.org/projects/code-tools/jmh/) for microbenchmarking

**Books**
- *Effective Java* by Joshua Bloch
- *Java: The Complete Reference* by Herbert Schildt
