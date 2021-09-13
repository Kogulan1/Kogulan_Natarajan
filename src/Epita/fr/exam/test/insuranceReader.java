package Epita.fr.exam.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class insuranceReader {


    public static void main(String[] args)
    {
        String line = " ";
        String splitBy = "-";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/Users/kogulanlogarasa/Desktop/Java Exam/Resources/insurances.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] insurances = line.split(splitBy);    // use comma as separator
                System.out.println(insurances[0]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
