package io.qameta.junit5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllFailedTest {

  @BeforeAll
  static void exc() {
    throw new IllegalStateException("before all - Exception!");
  }

  @Test
  void test() {

  }

  @Test
  void test2() {

  }
}
