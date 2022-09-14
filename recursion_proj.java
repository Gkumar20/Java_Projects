// fabinocci number using  recursion 

import java.util.LinkedList;

import javax.print.event.PrintEvent;
public class recursion_proj{
    // static int sum = 0;
    static int recuson(int i){  
        int sum=0;
        if(i<=1){
            return i;
        }else{
            sum = recuson(i-1)+recuson(i-2);
        }
        return sum;
    }
    public static void main(String[] args) {
        for(int i=0;i<=9;i++){
            System.out.println(recuson(i));
        }
        // System.out.println(recuson(5));
    }
}