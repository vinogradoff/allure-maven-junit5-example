package io.qameta.junit5;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

/**
 * eroshenkoam
 * 24.10.17
 */
public class SimpleTest {

    @Test
    @Feature("Some feature")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("test features of allure")
    @Description("this is a complex \n multiline text \n with explanations")
    public void testOutput() {
        firstStep();
      secondStep();
      attachment();
    }

    @Step
    public void firstStep() {

    }

  @Step
  @Attachment
  public String secondStep() {
    return "attachment";
  }

  @Attachment
  public String attachment() {
    return "attachment hehe";
  }



    @Test
    void skippedTest(){
        Assumptions.assumeTrue(false);
    }

    @Test
    void failedTest(){
      Assertions.assertTrue(false);
    }
}
