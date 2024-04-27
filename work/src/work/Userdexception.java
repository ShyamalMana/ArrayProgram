package work;

public class Userdexception
{
	static void voting(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("not eligible for vote");
		}
		else
		{
			System.out.println(" eligible for vote");
		}
	}
	public static void main(String[] args) {
		try {
			voting(19);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
