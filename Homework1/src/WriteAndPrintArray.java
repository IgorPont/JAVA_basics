import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteAndPrintArray {
    static void writeArrTxt(String fileName, int[] arr) {
        String text = Arrays.toString(arr);
        try (FileWriter fw = new FileWriter(fileName, false)) {
            fw.write(text);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
