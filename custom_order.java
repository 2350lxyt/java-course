// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

/*public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
    //  System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  

	 
    // Introduce shop and prompt user to input first name
      

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

	
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

  
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
	Scanner keyboard = new Scanner (System.in); 
	String firstName; // User's first name
	String itemOrder; // Item ordered
	String frostingType; // Frosting ordered
	String fillingType; // Filling ordered
	String toppings; // Toppings ordered
	String input;  // User input

	double cost = 15.00; // Cost of cake and cupcakes
	final double TAX_RATE = .08;  // Sales tax rate
	double tax; // Amount of tax
	
	// Introduce shop and prompt user to input first name

	System.out.println("Welcome to Java's Cake & Cupcake Shop!");
	System.out.println("We make custom cakes with our secret cake batter!");

	System.out.print("What is your first name? ");
	firstName = keyboard.nextLine();

	System.out.print(firstName + ", please see our MENU below: ");
	System.out.print("\n"); // skips a line	  

  
	System.out.println("_______________________________________________");      
	System.out.println("        MENU         QUANTITY    BASE COST  ");
	System.out.println("_______________________________________________"); 
	System.out.println("        Cake                     1            $15     ");
	System.out.println("   Set of Cupcakes       6            $15     ");
	System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
	System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
	System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
	System.out.println("_______________________________________________");
	
	System.out.println("Do you want CUPCAKES or a CAKE?");
	itemOrder = keyboard.nextLine();
	
	System.out.println("What type of FROSTING do you want? ");
	System.out.println("Vanilla, Chocolate, Strawberry or Coco");
	frostingType = keyboard.nextLine();
	
	System.out.println("What type of FILLING do you want? ");
	System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
	fillingType = keyboard.nextLine();
	
	System.out.println("What type of TOPPINGS do you want? ");
	System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
	toppings = keyboard.nextLine();

	System.out.println();
	System.out.println(firstName + " , your order is as follows: ");
	System.out.println("_________________________________________");
	System.out.println("Item Ordered: " + itemOrder);
	System.out.println("Frosting: " + frostingType);
	System.out.println("Filling: " + fillingType);
	System.out.println("Toppings: " + toppings);
	System.out.println("_________________________________________");

	System.out.printf("The cost of your order is: $%.2f\n", cost);
	tax = cost * TAX_RATE;
	System.out.printf("The tax is: $%.2f\n", tax);
	System.out.printf("The total due is: $%.2f\n",(tax + cost));


	}
}*/

//中文修改版
public class custom_order {
    public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in); 
	String firstName; // 记录姓氏
	String itemOrder; // 记录蛋糕
	String frostingType; // Frosting ordered
	String fillingType; // Filling ordered
	String toppings; // Toppings ordered
	String input;  // User input

	double cost = 15.00; // Cost of cake and cupcakes
	final double TAX_RATE = .08;  // Sales tax rate
	double tax; // Amount of tax
	
	// Introduce shop and prompt user to input first name

	System.out.println("欢迎光临蛋糕店!");

	System.out.print("请问您贵姓? \n");
	firstName = keyboard.nextLine();//记录姓氏

	System.out.print(firstName + "先生/女士, 请看我们的菜单: ");
	System.out.print("\n"); // skips a line	  

  
	System.out.println("____________________________________________");      
	System.out.println("	名称		重量		价格  		");
	System.out.println("____________________________________________"); 
	System.out.println("	蛋糕		    1		$15     ");
	System.out.println("	纸杯蛋糕	    6		$15     ");
	System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	System.out.println("	口味 (香草,巧克力,草莓,可可)");
	System.out.println("	馅料 (摩卡,薄荷,柠檬,焦糖,香草)");
	System.out.println("	配料 (糖屑,桂皮,可可粉,坚果)");
	System.out.println("____________________________________________");
	
	System.out.println("您想要蛋糕还是纸杯蛋糕?");
	itemOrder = keyboard.nextLine();
	
	System.out.println("您要添加什么? ");
	System.out.println("我们有：香草,巧克力,草莓,可可");
	frostingType = keyboard.nextLine();
	
	System.out.println("您想要什么馅的? ");
	System.out.println("我们有：摩卡,薄荷,柠檬,焦糖,香草");
	fillingType = keyboard.nextLine();
	
	System.out.println("您想要什么作为配料? ");
	System.out.println("我们有：糖屑,桂皮,可可粉,坚果");
	toppings = keyboard.nextLine();

	System.out.println();
	System.out.println(firstName + "先生/女士, 您的订单如下: ");
	System.out.println("_________________________________________");
	System.out.println("蛋糕类型: " + itemOrder);
	System.out.println("  口味  : " + frostingType);
	System.out.println("  馅料  : " + fillingType);
	System.out.println("  配料  : " + toppings);
	System.out.println("_________________________________________");

	System.out.printf("订单的价格为: $%.2f\n", cost);
	tax = cost * TAX_RATE;
	System.out.printf("制作及包装费: $%.2f\n", tax);
	System.out.printf("应付金额为: $%.2f\n",(tax + cost));


	}
}