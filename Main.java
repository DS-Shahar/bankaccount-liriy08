
public class Main {
	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount(3000,-1000,"Liri");
	   System.out.println(acct1.getBalance());
	     
	   boolean success = acct1.withdraw(1500);
	   System.out.println("success=" + success + ", balance=" + acct1.getBalance());
	     
	   acct1.deposit(300);
	   System.out.println("balance=" + acct1.getBalance());
	     
	   BankAccount acct2 = new BankAccount(3000, -1000,"Shir");
	   boolean success1 = acct1.transfer(acct2, 500);
	   System.out.println("transfer success = " + success1);
	     
	   BankAccount acct3 = new BankAccount(2400,-1000,"Lisa");
	   System.out.println(acct3.ToString());
	     
       BankAccount acct4 = new BankAccount(1000,-1000,"Lisa");
       BankAccount acct5 = new BankAccount(1000,-1000,"Bob");
       boolean success2 = acct4.transfer(acct5, 500);
       System.out.println("transfer success = " + success2);
       System.out.println(acct4.getBalance());
       System.out.println(acct5.getBalance());
       boolean success4 = acct4.transfer(acct5, 1600);
       System.out.println("transfer success = " + success4);
        
       
       
       System.out.println();
       //Rectangle
       Rectangle rec1 = new Rectangle(3,2);
       Rectangle rec2 = new Rectangle(5,4);
       rec1.draw(); //draw rectangle
       System.out.println();
       rec2.draw(); //draw rectangle
       
       System.out.println();
       rec1.scale(2);
       rec1.draw(); //draw rectangle
       
       System.out.println();
       int Area1 = rec1.calcArea();
       System.out.println("Area of rectangle 1 is: "+Area1);
       
       int Area2 = rec2.calcArea();
       System.out.println("Area of rectangle 2 is: "+Area2);
       
       int Perimeter1 = rec1.calcPerimeter();
       System.out.println("Perimeter of rectangle 1 is: "+Perimeter1);
       
       int Perimeter2 = rec2.calcPerimeter();
       System.out.println("Perimeter of rectangle 2 is: "+Perimeter2);
       System.out.println(rec1.ToString());
       System.out.println(rec2.ToString());
    }

}
