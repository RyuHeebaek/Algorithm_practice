import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long peoples = Long.parseLong(br.readLine().trim());

        long windows = (long) Math.sqrt(peoples);

        System.out.print(windows);
    }

}