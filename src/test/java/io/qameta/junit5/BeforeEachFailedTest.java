package io.qameta.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachFailedTest {

  @BeforeEach
  void exc() {
    throw new IllegalStateException("before each - Exception!");
  }

  @Test
  void test() {

  }
}
