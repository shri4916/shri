package Jenkins.Jenkins;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

public class CloneArrayList 
{
	@Test
	public void kahihi(String[] args)
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
