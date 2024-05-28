//import java.util.Scanner;
public class uInput {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);

        System.out.println("Enter  your  name : ");

        String name = a.nextLine();

        System.out.println("Enter your pass : ");
        String pass = a.nextLine();

        if(name.equals("ram") && pass.equals("123")){
            System.out.println("Authorised user");
        }
        else{
            System.out.println("login out");
        }
        
        // System.out.println("your name is " +name);

        // if(name.equals("ram")){
        //     System.out.println("Authorised user");
        // }
        // else{
        //     System.out.println("login out");
        // }

        // if(name=="ram"){
        //     System.out.println("Authorised user");

        // }
        // else{
        //     System.out.println("login out");
        // }

        // int age = a.nextInt();

        // if (age >= 18){
        //     System.out.println("You can vote");
        // }
        // else{
        //     System.out.println("you cannot vote");
        // }


    }
}
