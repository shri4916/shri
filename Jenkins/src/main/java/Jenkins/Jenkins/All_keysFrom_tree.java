package Jenkins.Jenkins;

import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class All_keysFrom_tree
{
	@Test
	public  void nfirrst()
	{
		TreeMap al= new TreeMap();
		al.put("10", "02");
		al.put("52","63");
		al.put("20","52");
		al.put("17","78");
		al.put("87","85");
		al.put("64","89");
		System.out.println(al);
		
		Set s=al.keySet();
		System.out.println(s);
		
	}

}
