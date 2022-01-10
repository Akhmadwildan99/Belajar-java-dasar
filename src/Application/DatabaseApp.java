package Application;

import ClassOOP.Error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
       databaseConnect("Akhmad", "rahasia");
        System.out.println("Sukses");
    }

    public static void databaseConnect(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Gagal connect ke database!!");
        }
    }
}
