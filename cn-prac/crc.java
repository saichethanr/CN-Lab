import java.util.*;

public class crc {

    String crccheck(String data,String poly, boolean errcheck){
        StringBuilder rem = new StringBuilder(data);
        if(!errcheck){
            for(int i=0;i<poly.length()-1;i++){
                rem.append("0");
            }
        }
        for (int i=0;i<rem.length()-poly.length()+1;i++){
            if(rem.charAt(i)=='1'){
                for(int j=0;j<poly.length()-1;j++){
                    rem.setCharAt(i+j, rem.charAt(i+j)==poly.charAt(i) ? '0':'1');
                }
            }
        }
     return rem.substring(rem.length()-poly.length()+1);
    }
    public static void main(String [] args){
     crc ob = new crc();
     String poly  = "0101001";
     Scanner in = new Scanner(System.in);
     System.out.println("enter the data");
     String data = in.next();
     String rem = ob.crccheck(data,poly,false);
     String codeword = data + rem;
     System.out.println("code word " + codeword);
    
    System.out.println("enter the received code word ");
    String recdata = in.next();
    String recrem = ob.crccheck(recdata,poly,true);
    if(Integer.parseInt(recrem,2)==0){
        System.out.println("no error");
    }
    else{
        System.out.println("error");
    }
    }
}
