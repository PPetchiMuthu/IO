import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {
    public void readMyFile() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Read from ");
        String file1 = scan.nextLine();
        System.out.print("Write in ");
        try {
            FileReader read = new FileReader(file1);
            String file2 = scan.nextLine();
            FileWriter write = new FileWriter(file2);
            int lineCount = 1, charCount = 0, n;
            while ((n = read.read()) != -1) {
                write.write((char) n);
                write.flush();
                if (n == '\n') lineCount++;
                if (n != ' ') charCount++;
            }
            System.out.println("File copy successful");
            System.out.println("No of lines in a file : " + lineCount);
            System.out.println("No of characters in a file : " + charCount);
            System.out.println("File path : " + read);
            read.close();
            write.close();
        } catch (IOException e) {
            System.out.println("File was not found");
        }
    }

    public static void main(String[] args) {
        IO obj = new IO();
        obj.readMyFile();
    }
}
