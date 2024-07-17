package lk.ijse.main;

import lk.ijse.dto.PersonDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {

        PersonDTO person = null;

        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            person = (PersonDTO) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Object has been Deserialized");
        System.out.println("id :" + person.getId());
        System.out.println("name :" + person.getName());
        System.out.println("address :" + person.getAddress());
    }
}
