package Rough;
import java.util.Scanner;
public class Calculator {
	double a,b;
 Calculator(int a, int b){
	 this.a=a;
	 this.b=b;
 }
 public void multipy(){
	 double M = this.a*this.b;
	 System.out.println("Result:");
	 System.out.println(this.a + "*" + this.b + " = "+ M);
 }
 public void divide() {
	 double D = this.a/this.b;
	 System.out.println("Result:");
	 System.out.println(this.a + "%" + this.b + " = "+ D);
	
 }
 public void addition() {
	 double A = this.a+this.b;
	 System.out.println("Result:");
	 System.out.println(this.a + "+" + this.b + " = "+ A);
 }
 public void subtraction() {
	 if(this.a>this.b) {
	 double S = this.a-this.b;
	 System.out.println("Result:");
	 System.out.println(this.a + "-" + this.b + " = "+ S);
	 }else if(this.b>this.a) {
		 double S = this.b-this.a;
		 System.out.println("Result:");
		 System.out.println(this.b + "-" + this.a + " = "+ S);
	 }
 }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter two numbers: ");
	System.out.println("");
	Calculator myObj = new Calculator(sc.nextInt(),sc.nextInt());
	System.out.print("Enter the arithmetic symbol to be executed on the given numbers: ");
	System.out.println("+ or - or % or *");
	System.out.println("");
	Scanner symbol = new Scanner(System.in);
	String sym = symbol.nextLine();
	String w = "+";
	String x = "-";
	String y = "%";
	String z = "*";
	symbol.close();
	sc.close();
	if (sym.equals(w) ) {
		myObj.addition();
	}
	else if(sym.equals(x)) {
		myObj.subtraction();
	}
	else if(sym.equals(y)) {
		myObj.divide();
	}
	else if(sym.equals(z)) {
		myObj.multipy();
	}
	
	}
	
}
