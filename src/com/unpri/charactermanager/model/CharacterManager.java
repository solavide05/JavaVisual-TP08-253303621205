package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private ArrayList<Character> characters = new ArrayList<>();

    public boolean addCharacter(Character character) {

        if (character == null || characters.contains(character)) {
            return false;
        }

        characters.add(character);
        return true;
    }

    public Character findByName(String name) {

        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }

        return null;
    }

    public boolean removeCharacter(String name) {

        Character character = findByName(name);

        if (character == null) {
            return false;
        }

        characters.remove(character);
        return true;
    }

    public int getTotalCharacters() {
        return characters.size();
    }

    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0.0;
        }

        int total = 0;

        for (Character c : characters) {
            total += c.getLevel();
        }

        return (double) total / characters.size();
    }
}