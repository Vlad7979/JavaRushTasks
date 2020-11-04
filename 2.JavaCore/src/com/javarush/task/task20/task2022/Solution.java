package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //fileName="K:\\data1.txt"; // файл для записи
        String fileNameSer = "K:\\data2.txt";
        Solution solution = new Solution("K:\\data1.txt");
        solution.writeObject("Эта строка для записи в солюшн");

        //Сериализ
        FileOutputStream fileOutput = new FileOutputStream(fileNameSer);
        ObjectOutputStream out = new ObjectOutputStream(fileOutput);
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data2.txt")); одной строкой
        out.writeObject(solution);
        out.close();

        //Дес
        FileInputStream fileInputStream = new FileInputStream(fileNameSer);
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        Solution sol2; // =new Solution("K:\\data1.txt");
        sol2 = (Solution) in.readObject();
        sol2.writeObject("Это дописка");


    }
}