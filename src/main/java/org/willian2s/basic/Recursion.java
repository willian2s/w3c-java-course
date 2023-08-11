package org.willian2s.basic;

public class Recursion {
  public int sum(int n) {
    if (n > 0) {
      return n + sum(n - 1);
    } else {
      return 0;
    }
  }

  public int sum(int start, int end) {
    if (end > start) {
      return end + sum(start + 1, end - 1);
    } else {
      return end;
    }
  }
}
