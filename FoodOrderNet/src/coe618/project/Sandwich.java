package coe618.project;



import java.util.Scanner;

/**
 *
 * @author alisharif
 */
public class Sandwich extends Menu implements CustomerInterface{
    
    /**
     *
     */
    public void manager(){
        int tmp = 1;
        
        while(tmp == 1){
            Menu menu = new Menu();
            Scanner scan = new Scanner(System.in);
            System.out.print("Sandwich Name:");
            String name = scan.next();
            System.out.print("Sandwich Price:");
            int price = scan.nextInt();
            menulist.add(new foodItem(name, price));
            System.out.print("Do you want to add a new Sandwich ? Y:any number N: 9)"); 
            int input = scan.nextInt();
            if (input == 9) tmp = 0;
            
        }
              
    }
        
    /**
     *
     */
    @Override
    public void viewmenu() {
        int m = 1;
        for(foodItem i: menulist){
            System.out.println("(" + m + ") " + i.getFood() + " - " + i.getPrice());
            m++;
        }
        
    }

    /**
     *
     */
    @Override
    public void choosemenu(){
        int input;
        int tmp = 0;
        int m = 1;
        for (foodItem i : drink.menulist){
            m++;
        }
        while(tmp == 0){
            System.out.print("Choose sandwich (9 to exit): ");
            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();
            if(input == 9) tmp = 1;
            if(input > 0 && input < m) checklist.add(menulist.get(input-1));
            
        }
    }

    /**
     *
     */
    @Override
    public void viewcheck(){
        for(foodItem i : checklist) {
            System.out.println(i);
        }
    }
}