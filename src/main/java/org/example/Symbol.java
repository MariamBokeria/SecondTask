package org.example;

public class Symbol implements A, B {
    @Override
    public String replaceSymbolA(String str) {
        return str.replace('a', 'z');
    }

    @Override
    public String replaceSymbolB(String str) {
        return str.replace('b', 'w');
    }
}
