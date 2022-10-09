package Practical3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AccountHolder {

    int count=0;
    ArrayList en = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public void getAge(){
        System.out.println("Enter Your Age ");
        int age= in.nextInt();
        en.add(age);
        if(age>=21 && age<=60){
            count++;
        }
    }
    public void getincome(){
        System.out.println("Enter Your Income ");
        int income= in.nextInt();
        en.add(income);
        if(income>15000){
            count++;
        }
    }
    public void getExp(){
        System.out.println("Enter Your Work Experience ");
        int exp= in.nextInt();
        en.add(exp);
        if(exp>1){
            count++;
        }
    }
    public void getctz(){
        System.out.println("Enter Your Citizenship ");
        String ctz= in.next();
        en.add(ctz);
        if(Objects.equals(ctz, "Indian")){
            count++;
        }

    }

    public void compare(){
        if(count == 4){
            System.out.println("You are Eligible for Personal Loan");
        }
        else{
            System.out.println("You are not Eligible for it");
        }
    }
}
