//define the class_name
public class Addition {
  
  //declare and initializes the variables to add
	static int a,b,c;
  
  //add function
	public static void add() {
    
    //adding the values of a and b then printing the value of sum
		c= a+b;
		System.out.println(c);
	}
	public static void main(String args[]) {
    //calling the add function 
    a=10;
    b=133;
		add();
	}
}


//Output will be:
143
