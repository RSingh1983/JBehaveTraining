package net.jbehave.main;

/**
 * The class net.jbehave.main.MyNumber represent a number, and capable
 * of performing arithmetic operations.
 */
public class MyNumber {
    int number;

    // Constructor
    public MyNumber() {
        this.number = 0;
    }

    public MyNumber(int number) {
        this.number = number;
    }

    // Getter and setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Public methods
    public MyNumber add(MyNumber rhs) {
        this.number += rhs.number;
        return this;
    }

    // Public methods
    public MyNumber sub(MyNumber rhs) {
        this.number -= rhs.number;
        return this;
    }

    // Public methods
    public MyNumber mul(MyNumber rhs) {
        this.number *= rhs.number;
        return this;
    }

    public MyNumber div(MyNumber rhs) {
        if (rhs.number == 0) throw new IllegalArgumentException("Cannot divide by 0!");
        this.number /= rhs.number;
        return this;
    }
}