package com.engflow.fancytext;

/**
 * A string formatter class that will take boring text and make it fancy.
 */
public class FancyFormatter {
  private static final FancyFormatter defaultInstance = new FancyFormatter();
  
  public static FancyFormatter standard() {
    return defaultInstance;
  }

  /**
   * Given a boring string will output a fancy string.
   *
   * Example
   * Input: "a boring string"
   * Output "a bOrInG StRiNg"
   */
  public String format(String input) {
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (i % 2 == 0) {
        c = Character.toLowerCase(c);
      } else {
        c = Character.toUpperCase(c);
      }
      builder.append(c);
    }
    return builder.toString();
  }

}
