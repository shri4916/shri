package BasePackage;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArraylistToArray
{
	public static void main(String[] args)
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("10");
		al.add("52");
		al.add("20");
		al.add("17");
		al.add("87");
		al.add("64");
		System.out.println(al);
		String [] c= new String[al.size()];

		al.toArray(c);
		
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
	}
	

}
