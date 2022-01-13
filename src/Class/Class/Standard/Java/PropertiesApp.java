package Class.Class.Standard.Java;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws FileNotFoundException {



        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String port = properties.getProperty("database.port");
            String username =  properties.getProperty("database.username");

            System.out.println(port);
            System.out.println(username);
        } catch (FileNotFoundException exception){
            System.out.println("file tidak ketemu!");
        } catch (IOException exception){
            System.out.println("Gagal load data dari file!");
        }


        try {
            Properties properties = new Properties();

            properties.put("name.first", "akhmad");
            properties.put("name.last", "wildan");
            properties.store(new FileOutputStream("name.properties"), "konfigurasi nama");

        } catch (FileNotFoundException exception){
            System.out.println("Tidak dapat membuat file!");
        } catch (IOException e){
            System.out.println("Tidak dapat store file");
        }


    }
}
