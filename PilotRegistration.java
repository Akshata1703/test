import java.io.*;
import java.util.Scanner;
public class PilotRegistration{
	String name;
	int age;
	int education;
	int percentage;
	int height;
	int eyesight;
	
PilotRegistration(String name,int age,int education,int percentage, int height, int eyesight){
		this.name = name;
		this.age = age;
		this.education = education;
		this.percentage = percentage;
		this.height = height;
		this.eyesight = eyesight;
}		
		
public void display() {
    if(age>=18 && age<=30) {
        if(education>=12) {
            if(percentage>=60) {
		if(height>=5) {
		  if(eyesight>=20 && eyesight<=100) {
                System.out.println("Congratulations, you are eligible for Pilot Registration");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Education: " + education);
                System.out.println("Percentage: " + percentage);
		System.out.println("Height: " + height);
		System.out.println("Eyesight: " + eyesight);
            } else {
                System.out.println("You are not eligible because your eyesight is not between 20-100");
            } }
		else {
                System.out.println("You are not eligible because your height is shoter than 5 feet");
            }	}		
		else {
                System.out.println("You are not eligible because your percentage is below 60");
            }	}
         else {
            System.out.println("You are not eligible because you are not educated in 12 standard");
     }   }
     else {
        System.out.println("You are not eligible because age limit is 18 to 30");
    }
}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		System.out.println("Enter your education:");
		int education = sc.nextInt();
		System.out.println("Enter your percentage:");
		int percentage = sc.nextInt();
		System.out.println("Enter your Height:");
		int height = sc.nextInt();
		System.out.println("Enter your Eyesight:");
		int eyesight = sc.nextInt();
		PilotRegistration obj = new PilotRegistration(name,age,education,percentage,height,eyesight);
		obj.display();
} 
}