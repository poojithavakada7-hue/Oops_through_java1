import java.io.*;

public class WC {
    public static void main(String[] args) {
        int words = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.trim().split("\\s+"); // handles multiple spaces
                if (!line.trim().isEmpty()) {
                    words += arr.length;
                }
            }

            br.close();
            System.out.println("Total words: " + words);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}