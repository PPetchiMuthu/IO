import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public void readMyFile() throws IOException {
        FileReader read = new FileReader("IO.java");
        FileWriter write = new FileWriter("java.txt");
        int lineCount = 1, charCount = 0, n;
        while ((n = read.read()) != -1) {
            write.write((char) n);
            write.flush();
            if (n == '\n') lineCount++;
            if (n != ' ') charCount++;
        }
        System.out.println("No of lines in a file : " + lineCount);
        System.out.println("No of characters in a file : " + charCount);
        System.out.println("File path : " + read);
        read.close();
        write.close();
    }

    public static void main(String[] args) throws IOException {
        IO obj = new IO();
        obj.readMyFile();
    }
}
