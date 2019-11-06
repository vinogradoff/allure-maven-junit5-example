package io.qameta.junit5;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleTest {

  @Test
  @Feature("Some feature")
  @Severity(SeverityLevel.CRITICAL)
  @DisplayName("test features of allure")
  @Description("this is a complex \n multiline text \n with explanations")
  @Link("blob/master/src/test/java/io/qameta/junit5/SimpleTest.java")
  void testOutput() throws IOException {
    firstStep();
    secondStep();
    attachment();
  }

  @Step
  private void firstStep() {

  }

  @BeforeAll
  static void init() {
    System.out.println("@BeforeAll");
  }

  @Step
  @Attachment
  private String secondStep() {
    return "attachment";
  }

  @Attachment(value = "allure.png")
  private byte[] attachment() throws IOException {
    File image = new File("src/test/resources/allure.png");
    return Files.readAllBytes(image.toPath());
  }


  @Test
  void skippedTest() {
    Assumptions.assumeTrue(false);
  }

  @Test
  void failedTest() {
    Assertions.assertTrue(false);
  }

  @Test
  void testWithExceptions() {
    throw new RuntimeException("Any exception you not aware of");
  }

}
