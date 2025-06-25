package irapractice;

public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//METHODS DEMO
		project4 d = new project4();
		String name = d.getData();
		System.out.println(name);
		project5 d2 = new project5();
		d2.getuserData();
		getData2();
	}

	public String getData()
	
	{
		System.out.println ("hello world");
		return "ira jade hingada";
	}
	
    public static String getData2()
	
	{
		System.out.println ("hello world");
		return "ira jade hingada";
	}
}


//This method: Method with a return value
//Is public – meaning it can be accessed from other classes.
//Returns a String – the method is declared with String instead of void, so it must return a value of type String.
//Has no parameters – empty parentheses () mean it doesn't take any input.

# Using methods with return types and object interaction #
