package services;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.*;

public class ExceptionService {

    @SneakyThrows()
    public static void main(String[] args) {

        @Cleanup InputStream in = new FileInputStream("C:\\Users\\proov\\Documents\\GitHub\\lombok101\\resources\\input.txt");
        @Cleanup OutputStream out = new FileOutputStream("C:\\Users\\proov\\Documents\\GitHub\\lombok101\\resources\\output.txt");

        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }

    }

}
