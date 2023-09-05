import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator
{
    public static void main(String[] args)
    {
        ArrayList<String> person = new ArrayList<>();
        Person bilbo = new Person("000001","Bilbo","Baggins","Esq.",1060);//object of Person class
        Person addPeople = new Person(bilbo.toCSVRecord(), "Bilbo","Baggins", "Esq.",1060);
        //Person addPeople = new Person();
        addPeople.toCSVRecord();
        Scanner in = new Scanner(System.in);

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonTestData.txt");
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        int yearOfBirth = 0;
        boolean done = false;
        String personRec = "";
        String data = "";

         do
        {
            //personRec = addPeople.toCSVRecord();
            personRec = bilbo.getID() + ", " + bilbo.getFirstName() + ", " + bilbo.getLastName() + ", " + bilbo.getTitle() + ", " + bilbo.getYOB();
            person.add(personRec);
            done = SafeInput.getYNConfirm(in, "Are you finished?");
        } while (!done);

        for(String i: person)
            System.out.println(i);

        try
        {
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            for(String rec : person)
            {
                writer.write(rec, 0, rec.length());
                writer.newLine();
            }
            writer.close();
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}