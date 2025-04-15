package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Main main = new Main();
        main.this_();
        main.that_method();
    }

    private void that_method() {
    }

    private void this_() {
        
    }
}