package io.qameta.junit5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachSkippedTest {

  @BeforeEach
  void skip() {
    Assumptions.assumeTrue(false, "skipping in before each");
  }

  @Test
  void test() {

  }
}
