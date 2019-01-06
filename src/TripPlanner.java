import java.util.Scanner;

public class TripPlanner {
    public static void main(String args[]){
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name,city;
        Scanner input = new Scanner(System.in);
        name =  input.nextLine();
        System.out.print("Nice to meet you "+name+", Where are you travelling to? ");
        city =  input.nextLine();
        System.out.println("Great! "+city+" sounds like a great trip");
        System.out.println("*******");
        System.out.println();
        System.out.println();
        travelTime();
        timeDiff();
        counArea();
    }
    public static void travelTime(){
        System.out.print("How many days are you going to spend travelling?");
        Scanner input = new Scanner(System.in);
        int day,spend;
        double con;
        String curr;
        day = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend in trip?");
        spend = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        input.nextLine();
        curr = input.nextLine();
        System.out.print("How many "+curr+" are there in USD?");
        con = input.nextDouble();
        System.out.println("If you are travelling for "+day+" days that is the same as "+(day*24)+" hours"+" or"+(day*24*60)+" minutes");
        double spend_per_day = (((double)(spend/day))*100)/100.0;
        double spend_curr = (((double)(spend/day))*100)/100.0;
        System.out.print("If you are going to spend $"+spend+" USD that means per day you can spend upto "+spend_per_day+" USD");
        System.out.print("Your total budget in "+curr+" is "+(con*spend)+ curr+" which per day is "+ spend_curr +" "+curr);
        System.out.println("*******");
        System.out.println();
        System.out.println();
    }
    public static void timeDiff(){
        System.out.print("What is the time difference in your home and your destination?");
        int td;
        Scanner input = new Scanner(System.in);
        td = input.nextInt();
        int time_mid = td%24;
        if(time_mid<0)
            time_mid+=24;

        System.out.print("That means that when it is midnight at home it will be "+time_mid+":00 in your travel destination");
        System.out.println(" and when it is noon at home it will be "+((12+td)%24)+":00.");
        System.out.println("*******");
        System.out.println();
        System.out.println();
    }
    public static void counArea(){
        System.out.print("What is the square area of your destination country in Km2?");
        int dis;
        Scanner input = new Scanner(System.in);
        dis = input.nextInt();
        double miles =((int)((dis*0.621*0.621)*100))/100.0;
        System.out.println("In miles2, that is "+miles);
        System.out.println("*******");
        System.out.println();
        System.out.println();
    }
}
