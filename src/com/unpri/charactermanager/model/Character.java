package com.unpri.charactermanager.model;

import java.util.Objects;

public class Character {

    private String name;
    private CharacterType type;
    private int level;

    public Character(String name, CharacterType type, int level) {
        setName(name);
        setType(type);
        setLevel(level);
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return 100 + (level * 10);
    }

    public int getAttackPower() {
        return 10 + (level * 5);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.name = name;
    }

    public void setType(CharacterType type) {
        if (type == null) {
            throw new IllegalArgumentException("Tipe tidak boleh kosong");
        }
        this.type = type;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level minimal 1");
        }
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        return name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase());
    }

    @Override
    public String toString() {
        return name + " (" + type + ") Level " + level;
    }
}