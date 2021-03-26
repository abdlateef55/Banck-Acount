/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banckacount;

public class banck {
   private String name;
   private String bankLocation;
   private int id;
   
   // method that sets the name
   public void setName(String name){
     this.name = name;
     }
   
   // returns the name "gets"
   public String getName(){
    return name;
     } 
   
    // method that sets the Location
    public void setbankLocation(String bankLocation){
       this.bankLocation = bankLocation;
     }
   // returns the location "gets"
   public String getbankLocation(){
    return bankLocation;
     } 
   
       // method that sets the Id 
 public void setid(int id){
     this.id = id;
     }
   //get id
 public int getid(){
 return this.id;
     }
 
    //desplay account informarion
    public void display(){
   System.out.println("id:" + id);
   System.out.println("Name:" + name);
   System.out.println("Location Bank:" + bankLocation);
       }

   }

