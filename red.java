import java.util.*;

public class red {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        float minProb = 0.3F;
        float maxprob = 0.7F;
        float dropProb = minProb;
        System.out.println("enter the queue size");
        int queueSize = in.nextInt();
        System.out.println("enter the no of packets");
        int numPackets = in.nextInt();
        int queueLen = 0;
        for (int i = 1; i <= numPackets; i++) {
            if (queueLen >= queueSize) {
                System.out.println("Packet-" + i + " Dropped (Queue Full)");
            } else if (rand.nextFloat() < dropProb) {
                System.out.println("Packet-" + i + " Dropped (Random)");
                dropProb += (maxprob - minProb) / (numPackets - 1);
            } else {
                System.out.println("Packet Accepted");
                queueLen++;
                dropProb = minProb;
            }
        }
        in.close();
    }
}
