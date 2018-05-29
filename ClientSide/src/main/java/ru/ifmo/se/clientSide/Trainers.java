package ru.ifmo.se.clientSide;

import ru.ifmo.se.clientSide.enums.Material;

public class Trainers extends Shoes {
    public Trainers() {
        super();
    }

    public Trainers(String colour) {
        super(colour);
    }

    @Override
    public String toString() {
        if (this.getMaterial() != Material.NONE)
            return super.getColour() + " Trainers made from " + this.getMaterial();
        else
            return super.getColour() + " Trainers";
    }
}