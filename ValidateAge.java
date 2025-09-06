class CustomValidAgeException extends Exception{
	public CustomValidAgeException(String str){
		super(str);
	}
}

public class ValidateAge {
	public static void main(String args[]){
		try{
			int a=15;
			int b=0;
			if(b == 0){
				throw new CustomValidAgeException("Divide by zero is not possible...");
			}
			int c=a/b;
			System.out.println("Result: " + c);
		}
		catch(CustomValidAgeException e){
			System.out.println(e.getMessage());
		}
	}
}