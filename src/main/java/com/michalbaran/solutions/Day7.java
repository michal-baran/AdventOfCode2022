package com.michalbaran.solutions;

import com.michalbaran.auxiliary.DirectoryItem;
import com.michalbaran.auxiliary.FileItem;

import java.util.ArrayList;
import java.util.List;

public class Day7 extends Day {
    List<DirectoryItem> folders = new ArrayList<>();
    DirectoryItem actualDir;

    public Day7(String filename) {
        super(filename);
    }

    @Override
    public Integer PartOne() {
        inputList.forEach(this::ExecuteCommand);
        return folders
                .stream()
                .mapToInt(DirectoryItem::getSize)
                .filter(size -> size < 100000)
                .sum();
    }

    @Override
    public Integer PartTwo() {
        return 0;
    }

    private void ExecuteCommand(String line) {
        String[] command = line.split(" ");

        // Switching between folders
        if (command[1].equals("cd")) {
            if (command[2].equals("/")) {
                actualDir = new DirectoryItem(command[2]);
                folders.add(actualDir);
            } else if (command[2].equals("..")) {
                actualDir = actualDir.getParent();
            } else {
                actualDir = changeDirectory(actualDir.getName() + command[2] + "/");
            }
        }

        // Creating folders and files
        if (command[0].equals("dir")) {
            DirectoryItem directoryItem = new DirectoryItem(actualDir.getName() + command[1] + "/", actualDir); //create new folder
            actualDir.addItem(directoryItem);  //add new folder to actual folder
            folders.add(directoryItem);

        } else if (!command[0].equals("$")) {
            FileItem fileItem = new FileItem(command[1], command[0]);
            actualDir.addItem(fileItem);   //add new file to actual folder
        }
    }

    public DirectoryItem changeDirectory(String name) {
        for (DirectoryItem directoryItem : folders) {
            if (directoryItem.getName().equals(name)) {
                return directoryItem;
            }
        }
        return null;
    }
}
