import java.util.*;

public class red {
    public static void main(String [] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        float minProb = 0.3F;
        float maxProb = 0.7F;
        float dropProb = minProb;
        System.out.println("enetr the queue size");
        int queuesize = in.nextInt();
        System.out.println("enter the no of packets");
        int numPackets = in.nextInt();
        int queueLen=0;
        for(int i=0;i<numPackets;i++){
          if(queueLen>=queuesize){
            System.out.println("packet "+ i+1 +  "dropped" + " queue full");
          }
          else if( rand.nextFloat() <dropProb){
               System.out.println("packet "+ (i+1) +  "  dropped" + " random");
               dropProb =(maxProb-minProb)/numPackets-1;
          } 
          else{
            System.out.println("packet accepted");
            queueLen++;
            dropProb=minProb;
          }
        }

    }


}
