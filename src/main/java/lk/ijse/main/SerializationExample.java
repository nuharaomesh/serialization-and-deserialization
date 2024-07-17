package lk.ijse.main;

import lk.ijse.dto.PersonDTO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {

        PersonDTO person = new PersonDTO(1, "Omesh", "Horana");

        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Object has been Serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
