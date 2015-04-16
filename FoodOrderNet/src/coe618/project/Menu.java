package coe618.project;



import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends MenuTemplate{
    private static int order;
    protected ArrayList<foodItem> checklist = new ArrayList<foodItem>();
    protected ArrayList<foodItem> menulist = new ArrayList<foodItem>();
    protected static Sandwich Sandwich = new Sandwich();
    protected static Pizza pizza = new Pizza();
    protected static Salad salad = new Salad();
    protected static Drink drink = new Drink();
    protected static int total = 0;
    Restaurant res = new Restaurant();
    Scanner scan = new Scanner(System.in);
    private int CustManage;
    
    public void CustManage(){

        int tmp = 0;
        
        while(tmp == 0){
            
            System.out.println("Are you (1)Manager or (2)Customer or (9)Exit: ");
            System.out.println("");
            
            CustManage = scan.nextInt(); 
            if (CustManage == 1 || CustManage == 2) MenuList();
            else if (CustManage == 9) tmp = 1;
            }
        res.Thanks();
        
    }
    
    
    public void MenuList(){
        total = 0;
        checklist.removeAll(checklist);
        int tmp = 0;
        while (tmp == 0){
            System.out.println("");
            System.out.println("What is your choice:");
            System.out.println("(1) Sandwich");
            System.out.println("(2) Pizza");
            System.out.println("(3) Salad");
            System.out.println("(4) Special");
            System.out.println("");
            System.out.print("Order Number (9 to exit): ");
            Scanner scan = new Scanner(System.in);
            order = scan.nextInt();
            if (order == 1){
                if (CustManage == 1) Sandwich.manager(); 
                else {
                Sandwich.viewmenu();
		Sandwich.choosemenu();
                }
            }
            else if (order == 2){
                if (CustManage == 1) pizza.manager();
                else {
                pizza.viewmenu();
                pizza.choosemenu();
                }
            }
            else if (order == 3){
                if (CustManage == 1) salad.manager();
                else {
                salad.viewmenu();
		salad.choosemenu();
                }
            }
            else if (order == 4){
                if (CustManage == 1) drink.manager();
                else {
                drink.viewmenu();
		drink.choosemenu();
                }
            }
            else if (order == 9){
                tmp = 1;
            }
        }
        
        
            total();
            System.out.println("Total Amount: " + total);
        
    }
    
    @Override
    public void total(){
        int m = 1;
        for(foodItem i: Sandwich.checklist){
            System.out.println("(" + m + ") " + i.getFood() + " - " + i.getPrice());
            m++;
        }
        
        for(foodItem i: salad.checklist){
            System.out.println("(" + m + ") " + i.getFood() + " - " + i.getPrice());
            m++;
        }
        for(foodItem i: drink.checklist){
            System.out.println("(" + m + ") " + i.getFood() + " - " + i.getPrice());
            m++;
        }
        
        for(foodItem i: pizza.checklist){
            System.out.println("(" + m + ") " + i.getFood() + " - " + i.getPrice());
            m++;
        }
        
        for(foodItem i: Sandwich.checklist){
            total += i.getPrice();
        }
        for(foodItem i: pizza.checklist){
            total += i.getPrice();
        }
        for(foodItem i: salad.checklist){
            total += i.getPrice();
        }
        for(foodItem i: drink.checklist){
            total += i.getPrice();
        }
    }
    
    
    
}