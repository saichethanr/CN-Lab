import java.util.*;
public class leaky {
public static void main(String [] args){
    Scanner in = new  Scanner(System.in);
    System.out.println("enter the no of packects");
    int numPackets = in.nextInt();
    System.out.println("enter the output rate");
    int outrate = in.nextInt();
    System.out.println("enter the bucket size");
    int bsize = in.nextInt();
    int filledbuffer=0;
    int sizeleft = bsize-filledbuffer;
    for(int i=1;i<=numPackets;i++){
        System.out.println("packet " + (i));
        System.out.println("enter the packet size");
        int psize = in.nextInt();
        sizeleft=bsize-filledbuffer;
        if(psize<=sizeleft){
            System.out.println("packet accepted ");
            filledbuffer+=psize;
        }
        else{
            System.out.println("packet dropped");
        }
        System.out.println(filledbuffer);
        filledbuffer-=outrate;
    }
}
}
