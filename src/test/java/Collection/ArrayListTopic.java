package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ArrayListTopic {
	@Test
	public void m1() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(55);
		set.add(45);
		set.add(789);
		set.add(58);
		set.add(56);
		set.add(78);
		set.add(100);
		System.out.println(set);
	    set.pollFirst();
	     System.out.println(set);
		//System.out.println(set.last());
		

	}

}
