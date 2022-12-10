package com.michalbaran.auxiliary;

public class FileItem extends Item {

    public FileItem(String name, String size) {
        this.name = name;
        this.size = Integer.parseInt(size);
    }

    @Override
    public int getSize() {
        return size;
    }
}
