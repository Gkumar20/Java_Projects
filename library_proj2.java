import java.util.Scanner;
import java.util.*;
class library1{
    public String[] Books = new String[5];
    public void addbook(){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<Books.length;i++) {
            System.out.println("Enter book name to add in library");
            String str1 = sc.nextLine();
            Books[i]=str1;
        }
        // sc.close();
    }

    public void issuebook(){
        System.out.println("Enter book num");
        showavailablebook();
        Scanner sc1 = new Scanner(System.in);
        int booknum = sc1.nextInt();
        System.out.println(Books[booknum]+" has been issued");
        Books[booknum] = null;
        // sc1.close();
    }

    public void showavailablebook(){
        int j=0;
        for (String string : Books) {
            System.out.println("("+j+")"+string);
            j++;
        }
    }
    public void returnbook(){
        System.out.println("Enter book name: ");
        Scanner sc1 = new Scanner(System.in);
        String rtbook = sc1.nextLine();
        for (int i=0;i<Books.length;) {
            if(Books[i] == null){
                Books[i] = rtbook;
                break;
            }else if(Books[i] != null){
                i++;
            }else{
                System.out.println("library have not sufficiant space to store the book");
                break;
            }
        }
        // sc1.close();
    }
}
public class library_proj2 {
    public static void main(String[] args) {
        // we have to implement a library using java programming 
        //method : add book,issue bbok, return book, showavailable book
        //properties : Array to store the available books
        //array to store the issued books
        // library1 b1 = new library1();
        library1 b = new library1();
        Scanner scan5 = new Scanner(System.in);
        b.addbook();
        for(int i=0;i<4;i++){
            try {
                System.out.println("Enter a number for what you want do: \n 1. issue book \n 2. return book \n 3.show available books");
                int num = scan5.nextInt();
                switch(num){
                    case 1: b.issuebook(); break;
                    case 2: b.returnbook(); break;
                    case 3: b.showavailablebook(); break;
                    default:System.out.println("Please Enter valid operation number");
                }
            }
            catch(Exception e) {
                //  Block of code to handle errors
                System.out.println("problem in try and except:-"+e);
            }
        }
        
    //    scan5.close(); 
    }
    // public static void program(){
        
    // }
}

