package BasePackage;

import java.util.ArrayList;
import java.util.HashMap;

public class CloneArrayList 
{
	public static void main(String[] args)
	{
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(52);
		al.add(20);
		al.add(17);
		al.add(87);
		al.add(64);
		System.out.println(al);
		ArrayList a2= new ArrayList();
		a2= (ArrayList) al.clone();
		System.out.println(a2);
		

	}


}
