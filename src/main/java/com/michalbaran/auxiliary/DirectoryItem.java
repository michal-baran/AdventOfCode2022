package com.michalbaran.auxiliary;

import java.util.ArrayList;
import java.util.List;

public class DirectoryItem extends Item {
    List<Item> items = new ArrayList<>();
    DirectoryItem parent;

    public DirectoryItem(String name, DirectoryItem parent) {
        this.parent = parent;
        this.name = name;
    }

    public DirectoryItem(String name) {
        this.parent = this;
        this.name = name;
    }

    @Override
    public int getSize() {
        size = items.stream()
                .mapToInt(Item::getSize)
                .sum();
        return size;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public DirectoryItem getParent() {
        return this.parent;
    }

    @Override
    public String toString() {
        return name;
    }
}
