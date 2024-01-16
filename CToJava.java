/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.tojava;
import java.util.Scanner;

/**
 *
 * @author CL3-03
 */
public class CToJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to our bidding system");
    
    Scanner myDecide = new Scanner(System.in);
    int decide;
    
    System.out.print("Hey do you want to sell something on the auction 1/2? : ");
    decide = myDecide.nextInt();
    
    if(decide == 1){
        System.out.println("Great! please enter the information needed.");
        
        Scanner sellerName = new Scanner(System.in);
        String sellName;
        
        System.out.print("Name: ");
        sellName = sellerName.nextLine();
        
        Scanner sellerItem = new Scanner(System.in);
        String sellItem;
        
        System.out.print("Item: ");
        sellItem = sellerItem.nextLine();
        
        Scanner sellerPrice = new Scanner(System.in);
        int sellPrice;
        
        System.out.print("Price(Pesos): ");
        sellPrice = sellerPrice.nextInt();
        
        System.out.println("Great! Thanks for entering your information");
        
        Scanner myDec = new Scanner(System.in);
        int dec;
        
        System.out.print("Does anyone have any interest to buy this " + sellItem + " from " + sellName + " 1/2: ");
        dec = myDec.nextInt();
        if(dec == 1){
            System.out.println("Item Info: " + "\n " + "Item Name: " + sellItem + "\n" + "Owner: " + sellName + "\n" +"Price(Pesos): " + sellPrice);
            
            Scanner buyName = new Scanner (System.in);
            String buyerName;
            
            System.out.print("Name: ");
            buyerName = buyName.nextLine();
            
            Scanner myPrice = new Scanner(System.in);
            int setPrice;
            
            System.out.print("Set your price(Pesos): ");
            setPrice = myPrice.nextInt();
            
            if(setPrice > sellPrice){
                System.out.println("Congratulations! for the highest bid!");
                
                Scanner higherPrice = new Scanner (System.in);
                int highPrice;
                
                System.out.print("Is there anyone who want to buy for a higher price press 1 for yes 2 for no: ");
                highPrice = higherPrice.nextInt();
                
                if(highPrice == 1){
                    Scanner buyTwo = new Scanner(System.in);
                    String buyerTwo;
            
                    System.out.print("Name: ");
                    buyerTwo = buyTwo.nextLine();
            
                    Scanner myPriceTwo = new Scanner(System.in);
                    int setPriceTwo;
            
                    System.out.print("Set your price(Pesos): ");
                    setPriceTwo = myPriceTwo.nextInt();
                    if(setPriceTwo > highPrice){
                        System.out.println("Congratulations to " + buyerTwo);
                    }
                }
                else if(highPrice == 2){
                    System.out.println("Congratulations!");
                }
            }
            else if(setPrice < sellPrice){
                System.out.println("Enter a valid price!");
            }
            else{
                System.out.println("Enter a valid input!");
            }
        }
        else{
            System.out.println("Ok");
        }
    }
    else{
        System.out.println("Close the program.");
    }
    
    Admin:
    System.out.println("The Admin will close the program");
    
    Scanner adminUn = new Scanner(System.in);
    String adminUserName;
    
    System.out.print("Admin User: ");
    adminUserName = adminUn.nextLine();
    
    Scanner adminPass = new Scanner(System.in);
    String adminPassword;
    
    System.out.print("Admin Password: ");
    adminPassword = adminPass.nextLine();
    
    if("pass".equals(adminPassword) && "admin".equals(adminUserName)){
        System.exit(0);
    }
    else{
        System.out.println("Incorrect Un or Pass");
    }
    
    }
}
