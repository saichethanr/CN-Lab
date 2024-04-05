import java.util.*;
public class token {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the bucket capacity");
        int bSize = in.nextInt();
        int tokens=0;
        int tokenrate=3;
        System.out.println("enetr the no of requests");
        int n = in.nextInt();
        int [] requests = new int[n];
        System.out.println("enter the no of packtes in every request");
        for(int i=0;i<n;i++){
            requests[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            tokens = Integer.min((tokens+tokenrate), bSize);
            System.out.println("tokens present is " + tokens);
            if(requests[i]<=tokens){
                System.out.println("no of packet" + requests[i]);
                System.out.println("packets accepted");
                tokens-=requests[i];
                System.out.println("tokens remmaining " + tokens);
            }
            else{
                System.out.println("no of packtes " + requests[i]);
                System.out.println("packets dropped ");
                System.out.println("tokens remmaining " + tokens);
            }

        }
        in.close();
    }
}
