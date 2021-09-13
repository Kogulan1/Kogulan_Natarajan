package Epita.fr.exam.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class patientReader {

    public static void main(String[] args)
    {
        String line = " ";
        String splitBy = "-";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/Users/kogulanlogarasa/Desktop/Java Exam/Resources/patients.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] patients = line.split(splitBy);    // use comma as separator
                System.out.println(patients[0]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
