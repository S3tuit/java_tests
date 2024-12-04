package packTest1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/cup.ser";
        Cup myCup = null;

        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            myCup = (Cup) objectIn.readObject();
            System.out.println("Cup object deserialized successfully: " + myCup);

        } catch (ClassNotFoundException e) {
            System.out.println("Deserialization failed: Class not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error occurred while accessing the file: " + filePath);
            e.printStackTrace();
        }

        System.out.println(myCup.getTemperature());

    }
}
