# 🧵 Java Concurrency Study Plan: Threads, ExecutorService & Future

This study plan covers foundational concepts, historical context, version enhancements, and practical exercises to master Java concurrency tools including Threads, ExecutorService, and Future.

---

## 📅 Week 1: Java Threads - The Foundation

### 🔍 Concepts
- Thread lifecycle: `new`, `runnable`, `running`, `blocked`, `terminated`
- Creating threads via `Thread` and `Runnable`
- Thread methods: `start()`, `sleep()`, `join()`, `yield()`
- Daemon vs user threads
- Race conditions and `synchronized`

### 🕰️ History
- Introduced in **Java 1.0**
- Basic API in `java.lang.Thread`

### 🛠️ Exercises
1. Create two threads that print numbers from 1 to 10.
2. Simulate a race condition using a shared counter and fix it with `synchronized`.
3. Create a daemon thread that logs the current time every 5 seconds.

---

## 📅 Week 2: Executor Framework - The Better Way

### 🔍 Concepts
- Why use `ExecutorService` over `Thread`
- Thread pool types: `FixedThreadPool`, `CachedThreadPool`, `SingleThreadExecutor`
- Lifecycle: `shutdown()`, `awaitTermination()`, `shutdownNow()`
- Task submission using `submit()` and `execute()`

### 🕰️ History
- Introduced in **Java 5** as part of `java.util.concurrent`
- Inspired by Doug Lea’s concurrency libraries

### 🛠️ Exercises
1. Rewrite Week 1 code using `FixedThreadPool`.
2. Use `ScheduledExecutorService` to schedule a task every 3 seconds.
3. Create a `Callable` that returns the factorial of a number and submit it.

---

## 📅 Week 3: Callable and Future - Getting Results

### 🔍 Concepts
- Difference between `Runnable` and `Callable`
- Using `Future<V>` to retrieve task results
- Timeout, cancellation, and exception handling in futures

### 🕰️ History
- Also introduced in **Java 5**

### 🛠️ Exercises
1. Submit multiple `Callable` tasks and print their `Future` results.
2. Use `future.get(timeout, TimeUnit)` and handle `TimeoutException`.
3. Demonstrate cancellation with `future.cancel(true)`.

---

## 📅 Week 4: Enhancements by Java Version

### 🔍 Version Enhancements

- **Java 7**: `ForkJoinPool`
- **Java 8**: `CompletableFuture`, parallel streams
- **Java 9+**: `CompletableFuture` enhancements (e.g., `delayedExecutor`)
- **Java 19+**: Preview of **Virtual Threads** (`Project Loom`)
- **Java 21**: Virtual Threads officially available (lightweight threads)

### 🛠️ Exercises
1. Use `CompletableFuture.supplyAsync()` to simulate an API call.
2. Chain multiple stages using `thenApply()`, `thenAccept()`.
3. [Optional] Try `Thread.ofVirtual().start()` in Java 21+.

---

## 📚 Bonus Topics

- **Thread Safety**: `synchronized`, `volatile`, `ReentrantLock`, `AtomicInteger`
- **Communication**: `wait()`, `notify()`, `notifyAll()`
- **Deadlocks**: detection and prevention
- **ThreadLocal** and `InheritableThreadLocal`

---

## 📘 Recommended Resources

- 📖 *Java Concurrency in Practice* – Brian Goetz
- 📄 [Oracle Docs – java.util.concurrent](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/package-summary.html)
- 📄 [Baeldung – Java Executors](https://www.baeldung.com/java-executors)
- 📄 [CompletableFuture – Java 21 Docs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletableFuture.html)

---

Happy learning! 🧠💻
