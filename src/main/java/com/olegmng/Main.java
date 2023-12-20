package com.olegmng;

import java.io.*;
import java.io.Serial;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        var oleg = new SerializablePerson("Oleg");
//        System.out.println(oleg);
//        Path path = Path.of("serializable-person.txt");

//        OutputStream fileOutputStream = Files.newOutputStream(path);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(oleg);
//        objectOutputStream.close();
//
//        InputStream fileInStream = Files.newInputStream(path);
//        ObjectInputStream deserializableObj = new ObjectInputStream(fileInStream);
//        deserializableObj.readObject();
//        deserializableObj.close();

        //--
        //start App
        Serialize serial = new Serialize("Oleg");
        Serialize.method2(Serialize.method1(serial));






    }
}