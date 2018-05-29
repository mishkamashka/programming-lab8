package ru.ifmo.se.clientSide;

import ru.ifmo.se.clientSide.enums.Patch;

public class Jeans extends GeneralClothes {

    public Jeans() {
        super();
    }

    public Jeans(String colour) {
        super(colour);
    }

    public Jeans(String colour, Patch[] patches) {
        super(colour, patches);
    }

    @Override
    public String toString() {
        return super.getColour() + " Trousers";
    }
}