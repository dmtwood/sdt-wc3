package com.dimidev.observer.exercise3;

public class Document {
    private String name;
    private int numberBytes;
    private boolean isColor;

    public Document(String name, int numberBytes, boolean isColor) {
        this.name = name;
        this.numberBytes = numberBytes;
        this.isColor = isColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberBytes() {
        return numberBytes;
    }

    public void setNumberBytes(int numberBytes) {
        this.numberBytes = numberBytes;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    @Override
    public String toString() {
        return "Document " + name + " of " + numberBytes + " bytes in " + (isColor() ? "kleur" : "zwart-wit");
    }
}
