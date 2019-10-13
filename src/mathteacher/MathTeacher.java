/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathteacher;
import java.util.Scanner;

/**
 *
 * @author Esmeralda_Iyescas
 */


public class MathTeacher {
    
    int n1;
    int n2;
    
    public MathTeacher(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public static int addNumbers(int n1, int n2){
    return n1 + n2;
    }
    
    public static int subtractNumbers(int n1, int n2){
    return n1 - n2;
    }
    
    public static int multiplyNumbers(int n1, int n2){
    return n1 * n2;
    }
    
    public static int divideNumbers(int n1, int n2){
    return n1 / n2;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String endProgram;
        boolean isNum; 
        boolean cont = true;
        System.out.println("Welcome to *Mental Math Practice* where you can test your addition, subtraction, multiplication, and division."); 
       
        do{
        System.out.println("Enter two integers:");
        do{
            if(scan.hasNextInt()){
                num1 = scan.nextInt();
                isNum = true;
            }else{
                isNum = false;
                scan.next(); //clear the scanner
            }
        }while(!isNum); // while this true or not false
        
         do{
            if(scan.hasNextInt()){
                num2 = scan.nextInt();
                isNum = true;
            }else{
                isNum = false;
                scan.next(); //clear the scanner
            }
        }while(!isNum); // while this true or not false
        
            
		System.out.println("Enter 1 to add the two numbers.");
		System.out.println("Enter 2 to subtract the second number from the first number.");
		System.out.println("Enter 3 to multiply the two numbers.");
		System.out.println("Enter 4 to divide the first number by the second number.");
		
		int userInput = scan.nextInt();

        if(userInput == 1){
            System.out.println(MathTeacher.addNumbers(num1, num2));
        }
        if(userInput == 2){
            System.out.println(MathTeacher.subtractNumbers(num1, num2));
        }
        if(userInput == 3){
            System.out.println(MathTeacher.multiplyNumbers(num1, num2));
        }
        if(userInput == 4){
            System.out.println(MathTeacher.divideNumbers(num1, num2));
        }

        System.out.println("Enter 'Quit' to end the program.");
        endProgram = scan.next();
        
        if(endProgram.equals("Quit")){
            cont = false;
        }
      /*   while(cont){
             System.out.println("Enter two integers:");
             num1 = scan.nextInt();
            num2 = scan.nextInt();
        
         }  */ 
        
        
        }while(cont);

        
    }
    
}