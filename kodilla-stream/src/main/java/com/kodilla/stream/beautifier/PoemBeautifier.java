package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String txt, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(txt);
        System.out.println("text beautification result: " + result);
    }
}
