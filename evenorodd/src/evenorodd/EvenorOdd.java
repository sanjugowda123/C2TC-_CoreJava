package evenorodd;

public class EvenorOdd {

	public static void main(String[] args) {
		int num=675;
		boolean flag=((num&1)==0)?true:false;
		if(flag)
		{
			System.out.println(+num+"is even number");
		}
		else
		{
			System.out.println(+num+"is odd number");
		}
		// TODO Auto-generated method stub

	}

}
