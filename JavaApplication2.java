/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class JavaApplication2 {

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
        
        System.out.print("Price: ");
        sellPrice = sellerPrice.nextInt();
        
        System.out.println("Great! Thanks for entering your information");
        
        Scanner myDec = new Scanner(System.in);
        int dec;
        
        System.out.print("Does anyone have any interest to buy this " + sellItem + " from " + sellName + " 1/2: ");
        dec = myDec.nextInt();
        if(dec == 1){
            System.out.println("Item Info: " + "\n " + "Item Name: " + sellItem + "\n" + "Owner: " + sellName + "\n" +"Price: " + sellPrice);
            
            Scanner buyName = new Scanner (System.in);
            String buyerName;
            
            System.out.print("Name: ");
            buyerName = buyName.nextLine();
            
            Scanner myPrice = new Scanner(System.in);
            int setPrice;
            
            System.out.print("Set your price: ");
            setPrice = myPrice.nextInt();
            
            if(setPrice > sellPrice){
                System.out.println("Congratulations!");
            }
            else if(setPrice < sellPrice){
                System.out.println("Enter a valid price!");
            }
            else{
                System.out.println("Null");
            }
        }
        else{
            System.out.println("Ok");
        }
    }
    else{
        System.out.println("Close the program.");
    }
    }
    
}
