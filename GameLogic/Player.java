package org.example.GameLogic;

public class Player extends NullPointerException{
    private String name;

    public Player(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        this.name = name;
    }
}
