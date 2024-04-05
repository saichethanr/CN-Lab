import java.util.*;

class Frame{
    int number;
    String data;
}
public class framesort {
public static void main(String [] args){
    System.out.println("enter the no of frames ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Frame []frames = new Frame[n];
    for (int i=0;i<n ;i++){
       frames[i]=new Frame();
       System.out.println("eneter the frame number ");
       frames[i].number = in.nextInt();
       System.out.println("enter the data ");
       frames[i].data = in.next();
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(frames[j].number > frames[j+1].number){
                Frame temp = frames[j];
                frames[j] =frames[j+1];
                frames[j+1] =temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.println("sorted frames are"+"\t"+frames[i].number+"\t"+frames[i].data);

    }

}    
}
