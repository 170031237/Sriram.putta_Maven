package epam;
import epam.sriram_maven.choclates_maven.Chocolate;
import epam.sriram_maven.choclates_maven.Cadbury;
import epam.sriram_maven.choclates_maven.Barone;
import epam.sriram_maven.choclates_maven.Galaxy;
import epam.sriram_maven.gift.Gift;
import epam.sriram_maven.sweets.Gulabjamun;
import epam.sriram_maven.sweets.Kajukatli;
import epam.sriram_maven.sweets.Kheer;
import epam.sriram_maven.sweets.Rasgulla;
import epam.sriram_maven.sweets.Sweets;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choice;
        Scanner io=new Scanner(System.in);
        System.out.println("Getting chocolates....");
        Chocolate chocolate1=new Cadbury("Cadbury Dairy Milk",50,20);
        Chocolate chocolate2=new Barone("Barone",70,20);
        Chocolate chocolate3=new Galaxy("Galaxy",80,20);
        System.out.println("Getting Sweets....");
        Sweets sweets1=new Gulabjamun("Gulabjamun",100,200);
        Sweets sweets2=new Kheer("Kheer",900,100);
        Sweets sweets3=new Kajukatli("Kajukatli",400,200);
        Sweets sweets4=new Rasgulla("Rasgulla",00,100);
        Gift gift=new Gift();
        
       
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3,sweets4);
        System.out.println("Sorting  in gift according to price");
        gift.sort();
        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());
        do
        {
        	System.out.println("<==============Happy New Year Gifts=============> ");
            System.out.println(" '1' to view all candies : ");
            System.out.println(" '2' to view all sweets : ");
            System.out.println("'3' to know most expensive chocolate and sweets : ");
            choice=io.nextInt();
            switch(choice)
            {
                case 1:
                ArrayList<Chocolate> arrayList=gift.getChocolates();
                for (Chocolate c:arrayList) {
                    System.out.println(c.toString());
                }
                break;
                case 2:
                ArrayList<Sweets> arrayList1=gift.getSweets();
                for (Sweets s:arrayList1){
                    System.out.println(s.toString());
                }
                break;
                case 3:
                System.out.println("The Expensive Chocolate : "+mostExpensive(gift.getChocolates()));
                System.out.println("The Expensive Sweet : "+mostExpensive(gift.getSweets()));
                default:
                System.out.println("Please enter a valid option!!");
                break;
            }
        }
        while(choice < 4);
        io.close();
    }
    private static <T> String mostExpensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }
}