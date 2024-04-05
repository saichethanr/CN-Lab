import java.util.*;
public class leakybucket {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter the no of packets:");
        int numPackets=in.nextInt();
        System.out.println("enter the output packet size:");
        int outSize=in.nextInt();
        System.out.println("enter the bucket size");
        int bSize=in.nextInt();
        int filledbuffer=0;
        int sizeleft=bSize-filledbuffer;
        for(int i=1;i<=numPackets;i++){
            System.out.println("Packet : "  +i);
            System.out.println("enter the packet size");
            int pSize=in.nextInt();
            sizeleft=bSize-filledbuffer;
            if(pSize<=sizeleft){
                System.out.println("packet"+i+"accepted into bucket");
                filledbuffer+=pSize;
            }
            else{
                System.out.println("packet"+i+"dropped");
            }
            System.out.println(filledbuffer);
            filledbuffer-=outSize;                              
        }
    }
}
