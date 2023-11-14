package Functions;

import java.util.Scanner;

public class Insurance {
    static void premium(String name,String gender,int age,String city)
    {
//        if person age is 25 to 35 and gender is male and city is metro , Output is Premium is 6%
        if(age>25 || age<35 && gender == "m" && city =="metro")
            System.out.println("Premium is 6%");
        else if(age>25 || age<40 && gender == "m" && city =="non-metro")
            System.out.println("Premium is 4%");
        else if(age>25 || age<42 && gender == "f" && city =="metro")
            System.out.println("Premium is 3%");
        else if(age>25 || age<45 && gender == "f" && city =="non-metro")
            System.out.println("Premium is 2%");
        else
            System.out.println("Not Insured");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter all name in lower case ");
        System.out.println("Person name ");
        String name = sc.nextLine();
        System.out.println("Person gender");
        String gen = sc.next();
        System.out.println("Person age ");
        int age = sc.nextInt();
        System.out.println("Person city");
        String city = sc.next();
        premium(name,gen,age,city);
    }
}
//if person age is 25 to 40 and gender is male and city is non-metro, Output is Premium 4%
//		if person age is 25 to 42 and gender is female and city is Metro, Output is Premium 3%
//		if person age is 25 to 45 and gender is female and city is non-metro , output is Premium 2%
//		else
// 		Not Insured