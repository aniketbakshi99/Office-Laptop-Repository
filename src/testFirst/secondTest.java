package testFirst;

public class secondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Deadly Hunter Prime";
        String[] splitArray = s.split("Hunter");
        for(int i=splitArray.length-1; i>-1; i--)
        {
        	System.out.println(splitArray[i]);
        }
	}

}
