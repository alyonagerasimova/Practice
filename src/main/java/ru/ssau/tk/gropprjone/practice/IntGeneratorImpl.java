package ru.ssau.tk.gropprjone.practice;

public class IntGeneratorImpl implements IntGenerator {
    private int i = 0;

    @Override
    public int nextInt() {
        return i++;
    }
}
