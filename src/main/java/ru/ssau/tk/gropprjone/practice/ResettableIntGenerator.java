package ru.ssau.tk.gropprjone.practice;

public class ResettableIntGenerator implements IntGenerator,Resettable {
    private int i = 0;
    @Override
    public int nextInt() {
        return i++;
    }

    @Override
    public void reset() {
        i = 0;
    }
}
