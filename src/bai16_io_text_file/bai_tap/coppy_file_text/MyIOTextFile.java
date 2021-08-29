package bai16_io_text_file.bai_tap.coppy_file_text;
import java.io.*;
public class MyIOTextFile {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\A0321I1_NguyenNgocLePhuc_Module2\\src\\bai16_io_text_file\\bai_tap\\coppy_file_text");
            fileOutputStream = new FileOutputStream("D:\\A0321I1_NguyenNgocLePhuc_Module2\\src\\bai16_io_text_file\\bai_tap\\coppy_file_text\\text_copy.txt");
            int check;
            while ((check = fileInputStream.read()) != -1) {
                System.out.print((char)check);
                fileOutputStream.write(check);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}