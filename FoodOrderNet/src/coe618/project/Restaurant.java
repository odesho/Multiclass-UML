package coe618.project;



import java.util.Scanner;
import static javafx.application.Platform.exit;

public class Restaurant{
    public static void main(String[] args){
        Menu menu = new Menu();
        System.out.println("----------------------");
        System.out.println(" Welocme to FoodHouse ");
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("It's better to start as a Manager since theres isn't food items on the menu list yet!");
        menu.CustManage();    }
    
    public void Thanks(){
        System.out.println("");
        System.out.println("Thank You for Visiting!");
        exit();
    }
}