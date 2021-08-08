package ByteInputOutputStream;

import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ByteCodeToBusObject {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.6.2.RELEASE\\SecondWeekDay5\\src\\main\\java\\ByteInputOutputStream\\byteCodeOutput\\BusObjectByteCode.ser");
            ObjectInputStream os = new ObjectInputStream(fin);

            List<Bus> buses = (ArrayList<Bus>) os.readObject();
            buses.forEach(System.out::println);
            os.close();
            fin.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
