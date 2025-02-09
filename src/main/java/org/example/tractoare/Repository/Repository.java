package org.example.tractoare.Repository;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Repository {
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
