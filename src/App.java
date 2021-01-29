
public class App {

	public static void main(String[] args) {
	//Item Price
	int jacketPrice = 50;
	int helmetPrice = 200;
	
	System.out.println("The price of the jacket is:" + 
	" " + jacketPrice + " " + "dollars");
	System.out.println("The price of the helmet is:" + " "
	+ helmetPrice + " " + "dollars");
	
	//Amount of money in wallet
	int moneyInWallet = 350;
	double accountBalance = 10987.22;
	
	System.out.println("I have" + " " + moneyInWallet + " "
			+ "dollars in my wallet");
	System.out.println("I have an account balance of" + " " + accountBalance + " " + "dollars");
	
	//Amount of money after purchase
	moneyInWallet = moneyInWallet - helmetPrice - jacketPrice;
			System.out.println("I have" + " " + moneyInWallet + " "
+					"dollars in my wallet after helmet and jacket purchase");
	//Number of friends
	
	int outOfState = 11;
	int inState = 22;
	System.out.println("I have" + " " + outOfState + " " +
			"friends out of state");
	System.out.println("I have" + " " + inState + " " + 
			"friends in state");
	
	//Friends I have made per year according to age
	int myAge1 = 33;
	int result = (outOfState + inState) / myAge1;
	System.out.println("I have made" + " " + result + " " + 
	"friend per year based on my age");

	
	//Age in years
	
	int myAge = 33;
	int wifesAge = 31;
	System.out.println("My age is:" + " " + myAge);
	System.out.println("My wife's age is:" + " " + wifesAge);
	
	//First Name 
	
	String firstName = "William"; 
	String wifesFirstName = "Kirsten";
	
	System.out.println("My first name is:" + " " + firstName);
	System.out.println("My wife's first name is:" + " " + wifesFirstName) ;
	
			
	
	//Last Name
			
	String lastName = "Boucher";
	String wifesLastName = "Boucher";
	
	System.out.println("My last name is:" + " " + lastName);
	System.out.println("My wife's last name is:" + " " + wifesLastName);
	
	
	//Middle Initial 
	
	char middleInitial = 'L';
	char wifesMiddleInitial = 'E';
	
	System.out.println("My middle initail is:" + " " + middleInitial);
	System.out.println("my wife's middle initial is:" + " " + wifesMiddleInitial);
	
	//My full name
	String fullName = firstName + " " + middleInitial + " " + 
			lastName;
	

	System.out.println("My full name is:" + " " + fullName);
	
	
	}

}
