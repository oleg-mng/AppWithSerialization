package com.olegmng;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

//    /**
//     * Написать класс с двумя методами:
//     * 1. принимает объекты, имплементирующие интерфейс Serializable, и сохраняющие их в файл.
//     Название файл - class.getName() + "_" + UUID.randomUUID().toString()
//     * 2. принимает строку вида class.getName() + "_" + UUID.randomUUID().toString()
//     и загружает объект из файла и удаляет этот файл.
//     *
//     * Что делать в ситуациях, когда файла нет или в нем лежит некорректные данные - подумать самостоятельно.
//     */
public class Serialize implements Serializable {
    private String name;

    public Serialize(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Serial{" +
               "name='" + name + '\'' +
               '}';
    }

    public static String method1(Serialize obj) {

        Path pathSer = Path.of("fileOleg.txt");
        String strTemp = obj.getName() + "_" + UUID.randomUUID().toString();
        Path pathM1 = Path.of(strTemp);

        try {
            OutputStream fileOutputStream = Files.newOutputStream(pathM1);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Запись в файл " + strTemp + " произведена");
        return strTemp;

    }

    public static void method2(String str) {

        Path pathSer = Path.of(str);
        try {
            InputStream fileInStream = Files.newInputStream(pathSer);
            ObjectInputStream deserializableObj = new ObjectInputStream(fileInStream);
            deserializableObj.readObject();
            deserializableObj.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //TODO добавить удаление файла
        new File(str).delete();
        System.out.println("Чтение из файла " + str + " произведена");

    }
}
