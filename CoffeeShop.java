package com.foo;

import com.work.MenuItem;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);


        System.out.println("Please enter the name of item you want");
        String itemName=scanner1.nextLine();
        String d="egg";
        String e="bread";
        String f="tea";
        String g="storm";
        String h="malt";
        if (itemName.toLowerCase(Locale.ROOT).equals(d)||itemName.equals(e)||
                itemName.equals(f)||itemName.equals(g)||itemName.equals(h)) {
            String Name = "Egg";
            String Type = "Food";
            String Price = "GHS200";

            String Name1 = "Bread";
            String Type1 = "Food";
            String Price1 = "GHS300";

            String Name2 = "Tea";
            String Type2 = "Food";
            String Price2 = "GHS300";

            String Name3 = "Storm";
            String Type3 = "Drink";
            String Price3 = "GHS70";

            String Name4 = "Beta malt";
            String Type4 = "Drink";
            String Price4 = "GHS100";

            System.out.println("The list of items in ONEDON's shop");
            System.out.println("Name        Type        Price");
            System.out.println(Name + "         " + Type + "        " + Price);
            System.out.println(Name1 + "       " + Type1 + "        " + Price1);
            System.out.println(Name2 + "         " + Type2 + "        " + Price2);
            System.out.println(Name3 + "       " + Type3 + "       " + Price3);
            System.out.println(Name4 + "   " + Type4 + "       " + Price4);

            System.out.println("Please enter the number of items you want each orderly: ");
            int egg = scanner.nextInt();
            int bread = scanner.nextInt();
            int tea = scanner.nextInt();
            int storm = scanner.nextInt();
            int malt = scanner.nextInt();
          int  total=egg*200+bread*300+300*tea+70*storm+100*malt;
            System.out.println("list of food items you want to order");

if (egg>0){ System.out.println("Egg(s)");}
if(bread>0){ System.out.println("Bread"); }
if(tea>0){ System.out.println("Cup of tea"); }
            System.out.println("list of Dink(s) you want to order");
if(storm>0){ System.out.println("Storm energy drink");}
if(malt>0){ System.out.println("Malt");}
System.out.println("Please the total Amount your item cost is GHS"+total+".000");
            System.out.println("Kindly enter your amount");
int amount=scanner.nextInt();
if(amount==total){
    System.out.println("Please the items are ready, THANK YOU");
}else {
    System.out.println("Your amount could not reach the required amount,sorry your order failed");
}

        }
        else {
            System.out.println("Please this item is currently unavailable");
        }

    }

}
