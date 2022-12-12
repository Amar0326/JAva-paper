import java.io.*;

public class Byte_file_handling {
    public static void main(String[] args) {
        File f1 = new File("File1.txt");
        File f2 = new File("File2.txt");
        try {
            FileReader Reader =new FileReader(f1);
            FileWriter Writer =new FileWriter(f2);
            int data=Reader.read();
            while(data!=-1){
                Writer.write(data);
                data=Reader.read();

            }
            Reader.close();
            Writer.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
