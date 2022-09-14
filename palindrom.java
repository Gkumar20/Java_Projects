import java.util.Scanner;

public class palindrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();

        String num_str = String.valueOf(num);
        int numlen = num_str.length();
        // System.out.println(num_str.charAt(0));
        boolean result = true;
        for(int i=0;i<(numlen)/2;i++){
            if(num_str.charAt(i) ==num_str.charAt(numlen-1-i)){
                result = true;
            }else{
                result= false;
                break;
            }
        }       
        if(result){
            System.out.println(num+"is a palindrom number");
        }else{
            System.out.println(num+"is not palindrom number");
        }

       
    }
}