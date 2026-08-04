package database;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static void saveToFile(String fileName, ArrayList<String> data) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Data Saved Successfully.");

        } catch (IOException e) {
            System.out.println("Error Saving File.");
        }
    }

    public static ArrayList<String> loadFromFile(String fileName) {

        ArrayList<String> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                data.add(line);
            }

        } catch (IOException e) {
            System.out.println("File Not Found.");
        }

        return data;
    }
}