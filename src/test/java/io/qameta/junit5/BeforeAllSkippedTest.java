package io.qameta.junit5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllSkippedTest {

  @BeforeAll
  static void skip() {
    Assumptions.assumeTrue(false, "skipping in before all");
  }

  @Test
  void test() {

  }
}
