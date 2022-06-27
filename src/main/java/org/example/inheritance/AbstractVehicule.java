package org.example.inheritance;

import java.awt.*;

public abstract class AbstractVehicule {

    public enum VehiculeType {
        CAR("car"),
        BOAT("boat"),
        PLANE("plane");

        VehiculeType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
        private final String type;
    }

    public AbstractVehicule(String name) {
        this.name = name;
    }
    public abstract void move();
    public abstract double getSpeed();
    private final String name;
    private Color color;

    public AbstractVehicule(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "AbstractVehicule {name: " + name + color + getSpeed() +"}";
    }
}
