package org.example.tractoare.Repository;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repository {

    public void read()
    {
        File file = new File("C:\\Users\\berin\\IdeaProjects\\Tractoare\\src\\main\\java\\org\\example\\tractoare\\Repository\\tractoare.csv");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                Tractor t = new Tractor(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]));
                create(t);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void create(Tractor t) {
        list.add(t);
    }
    public void delete(Tractor t) {
        list.remove(t);
    }

    List<Tractor> list= new ArrayList<Tractor>();
    // mai jos trebuie implementate functiile
    public List<Tractor> findAll()
    {
        return list;
    }

    public Tractor findOne(int id)
    {
        for(Tractor tractor:list)
        {
            if(tractor.getId()==id)
                return tractor;
        }
        return null;
    }

    public void writeToFile(Tractor tractor)
    {
        String record=tractor.toString();
        try (FileWriter writer = new FileWriter("tractoare.csv", true)) { // true for append mode
            writer.write(record + System.lineSeparator()); // Append new line after record
            System.out.println("Record written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
