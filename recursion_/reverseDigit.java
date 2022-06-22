package recursion_;
import java.util.*;
public class reverseDigit {
    public static void main(String args[]){


        System.out.println(rev(12321));
        System.out.println(pali(rev(12345)));
      

    }
    static int rev(int n){
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    private static int helper(int n,int digit){
     if(n%10==n){
         return n;
     }
     int rem = n%10;
   return rem * (int)(Math.pow(10,digit-1)) + helper(n/10,digit-1);

    }

    static boolean pali(int n){
        if(n==rev(n)){
           return true;
        }
        else{
            return false;
        }
    }
}
