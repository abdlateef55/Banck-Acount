
package banckacount;

import java.util.Scanner;


public class BanckAcount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        boolean again = true;
        do{
       client myaccount = new client();
       banck banckacount = new banck();
       System.out.println("1- View Your Account");
       System.out.println("2- Deposit Money");
       System.out.println("3- withdrawal Money");
       System.out.println("4- Exit");
       System.out.print("Enter Number between 1 to 4 : " );
       choice = input.nextInt();
       
       switch(choice){
            case 1:
                System.out.println("\t\t\tWelcom To your Account : ");
            myaccount.viewAccount();
            System.err.println("_____________________");
            break;
            
            case 2:
                 System.out.println("\t\t\tYour Last deposit");
                myaccount.deposit();
                System.err.println("_____________________");
                break;
            case 3:
                System.out.println("\t\t\tYour Last withdrawal");
                 myaccount.withdrawal();
                 System.err.println("_____________________");
                break;
            default:
                System.err.println("\t\t\tAccount is Closed Done");
                again = false;
                System.err.println("_____________________");
                break;
        }
        }while(again != false);
                    
             
                    
       



}

    }
    

