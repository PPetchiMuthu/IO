import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        FileReader read = new FileReader("IO.java");
        FileWriter write = new FileWriter("java.txt");
        int linecount = 1, charcount = 0, n;
        while ((n = read.read()) != -1) {
            write.write((char) n);
            write.flush();
            if (n == '\n')
                linecount++;
            if (n != ' ')
                charcount++;
        }
        System.out.println("No of lines in a file : " + linecount);
        System.out.println("No of characters in a file : " + charcount);
        System.out.println("File path : " + read);
    }
}