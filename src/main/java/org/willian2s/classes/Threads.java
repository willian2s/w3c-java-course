package org.willian2s.classes;

// Threads
// - Threads allows a program to operate more efficiently by doing multiple things at the same time.
//
// - Threads can be used to perform complicated tasks in the background without interrupting the main program.
//
// Differences between "extending" and "implementing" Threads
// - The major difference is that when a class extends the Thread class, you cannot extend any other class,
//   but by implementing the Runnable interface, it is possible to extend from another class as well, like:
//   class MyClass extends OtherClass implements Runnable.
//
// Concurrency Problems
// - Because threads run at the same time as other parts of the program, there is no way to know in which order the
//   code will run. When the threads and main program are reading and writing the same variables,
//   the values are unpredictable. The problems that result from this are called concurrency problems.
//
// - To avoid concurrency problems, it is best to share as few attributes between threads as possible.
//   If attributes need to be shared, one possible solution is to use the isAlive() method of the thread
//   to check whether the thread has finished running before using any attributes that the thread can change.
public class Threads extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Threads thread = new Threads();
    thread.start();
    while (thread.isAlive()) {
      System.out.println("Waiting...");
    }
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
  }

  public void run() {
    amount++;
  }
}
