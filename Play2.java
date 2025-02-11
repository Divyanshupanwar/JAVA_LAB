import java.util.*;
public class Play2 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user Type:(1:TERM DEPOSIT   2: RECURRING DEPOSIT)");
        int btype = sc.nextInt();
        while(btype != 1 &&  btype != 2){
            System.out.println("input valid:");
            btype = sc.nextInt();  
        }
        if(btype ==1){
            System.out.println("TERM DEPOSIT USER ! WELCOME");
        }
        else{
            System.out.println("RECURIING DEPOSIT USER ! WELCOME");
        }

        System.out.println("enter principal amount:");
        long p = sc.nextLong();
        System.out.println("enter rate:");
        float rate = sc.nextFloat();
        System.out.println("enter time period:");
        int t = sc.nextInt();
        double  a  = 0;
        switch(btype){
            case 1:
            double temp  = Math.pow((1+rate/100.0),t);
            a = p*temp;
            break;
            case 2:
            a = (p*t)+((p*t*(t+1))/2.0*(rate/100.0)*(1.0/12.0));
            break;
            default:
            break;

        }
        System.out.println("amount for given data is:"+a);
        sc.close();
    }
    
}
