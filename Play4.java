import java.util.*;

public  class Play4{
    public static int divsum(int a){
        int sum = 0;
        for(int i = 1;i<a;i++){
            if(a %i == 0){
                sum += i;
            }

        }
        return sum;
    }
     public static  boolean isamicable(int a,int b){
        int asum = divsum(a)/a;
        int bsum =  divsum(b)/b;
        if(asum == bsum)return true;
        return false;

    }
    public static boolean isabundant(int a){
    int sum = divsum(a);
    if(sum == a)return true;
    return false;    
    
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.println("enter first number :");
     int a = sc.nextInt();
     System.out.println("enter 2nd number:");
     int b = sc.nextInt();
     boolean ans = isamicable(a,b);
     if(ans == true){
        System.out.println("nuber are amicable or friendly!");
     }
     else{
        System.out.println("numbers are not friendly!");
     }
     if(isabundant(a)){
      System.out.println("number"+a+" is abundant :");
      

    }
    else{
    System.out.println("number"+a+"is not  abundant :");
    }
    
      if(isabundant(b)){
      System.out.println("number"+b+" is abundant :");
      

    }
    else{
    System.out.println("number"+b+"is not  abundant :");
    }
    
}
     

}
