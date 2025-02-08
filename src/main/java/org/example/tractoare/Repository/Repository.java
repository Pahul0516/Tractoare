package org.example.tractoare.Repository;

import org.example.tractoare.Domain.Tractor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repository {
    List<Tractor> list= new ArrayList<>();

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
}
