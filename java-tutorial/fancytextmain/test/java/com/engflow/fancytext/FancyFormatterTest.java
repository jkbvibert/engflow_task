package com.engflow.fancytext;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class FancyFormatterTest {

  @Test
  public void formatTypicalString() {
    String input = "typical string";
    String output = FancyFormatter.standard().format(input);

    assertThat(output).isEqualTo("tYpIcAl sTrInG");
  }

  @Test
  public void formatEmptyString() {
    String input = "";
    String output = FancyFormatter.standard().format(input);

    assertThat(output).isEqualTo("");
  }

  @Test
  public void formatNonCasedCharacters() {
    String input = "!@#$%^&*()";
    String output = FancyFormatter.standard().format(input);

    assertThat(output).isEqualTo(input);
  }
}
