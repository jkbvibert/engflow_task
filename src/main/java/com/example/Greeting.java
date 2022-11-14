package com.example;

import com.engflow.fancytext.FancyFormatter;

public class Greeting {
    public static void sayHi() {
		System.out.println(FancyFormatter.standard().format("Why, hello there. As you can see, I'm now using the Fancy Text library."));
		//System.out.println("Hi!");
    }
}
