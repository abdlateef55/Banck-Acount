
package banckacount;

import java.util.Scanner;

public class client{
     banck account = new banck(); //declaration banck class to use in this class
    //private int id;
    private double card = 1000; //value of card equal 1000 
    //private String name ;
    Scanner input = new Scanner(System.in);
     private double inputMoney ;
    
   
    // siter card
    void setcard(double card){
     this.card = card;
     }
   //get card
  public  double getcard(){
      
    return this.card;
     }

  /*
  void setMoney(double inputMoney){
  this.inputMoney = inputMoney = input.nextDouble();
  }
  
  public double getMoney(){
  return this.inputMoney;
  }
 */
    //Deposit >>>>  إيداع 
    public void deposit(){
        System.out.print("Enter number you can deposit : ");
        inputMoney = input.nextDouble();
     card = card + inputMoney;
    System.out.println("you money is : " + card+"$");
    }
    

    //The withdrawal >>> السحب 
    int withdrawal(){
       System.out.print("Enter withdrawal number : ");
        inputMoney = input.nextDouble();
         if(inputMoney > card){
     System.out.println("Sorry Not enough money !!!");
       System.out.println("you money is : " + card+"$");
     return 1;
    }else{
        card = card - inputMoney;
     System.out.println("you money is : " + card+"$");
        return 0;
       }
    }
        //View account >>> عرض الحساب 
    public void viewAccount(){
/***********this Variable in bank class ******************/
                                                    /*|||*/
       //             /*|||*/
        account.setid(1);                         /*|||*/
        account.setName("modather Ibrahim");              /*|||*/
        account.setbankLocation("khartoum");    /*|||*/
        account.display();                     /*|||*/
 /**************************************************/
 
       
       System.out.println("Your balance is  " + card);
        
    }
    
}
