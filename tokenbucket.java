import java.util.*;

public class tokenbucket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the bucket capcity");
        int bSize = in.nextInt();
        int tokens = 0;
        int tokenrate = 3;
        System.out.println("enter the number of req: ");
        int n = in.nextInt();
        int[] request = new int[n];
        System.out.println("enter the no of packets in each request");
        for (int i = 0; i < n; i++) {
            request[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            tokens = Integer.min((tokenrate + tokens), bSize);
            System.out.println("no of tokens:" + tokens);
            if (request[i] <= tokens) {
                System.out.println("no of packtes : " + request[i]);
                System.out.println("packtes exepted");
                tokens -= request[i];
                System.out.println("tokens remaining " + tokens);
            } 
            else {
                System.out.println("packets dropped ");
                System.out.println("insufficient storage");
                System.out.println("remainign tokens" + tokens);
            }

        }
        in.close();
    }
}
