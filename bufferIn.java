// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.io.*;

public class bufferIn {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("enter your name: ");
        System.out.println("enter your name : ");
        // String name = a.readLine();
       int age = Integer.parseInt(a.readLine());
        System.out.println("your name is : "+age);

    }

}
