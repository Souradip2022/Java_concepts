package com.souradip.Test;

import java.io.*;

public class Main {
  public static void main(String[] args) {
    // Write to file
    try {
      FileWriter fileWriter = new FileWriter("KIIT-1.txt");
      PrintWriter printWriter = new PrintWriter(fileWriter);
      printWriter.println("KIIT is the best University in the World I Love KIIT");
      printWriter.close();
    } catch (IOException e) {
      System.out.println("Error writing to file");
      e.printStackTrace();
    }

    // Read from file
    try {
      FileReader fileReader = new FileReader("KIIT-1.txt");
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line = bufferedReader.readLine();

      // Extract substrings
      String part1 = line.substring(0, 28); // "KIIT is the best University"
      String part2 = line.substring(39); // "I Love KIIT"

      // Write to another file
      FileWriter fileWriter = new FileWriter("KIIT-2.txt");
      PrintWriter printWriter = new PrintWriter(fileWriter);
      printWriter.println(part1 + "\n" + part2);
      printWriter.close();

      bufferedReader.close();
    } catch (IOException e) {
      System.out.println("Error reading from file or writing to another file");
      e.printStackTrace();
    }
  }
}
