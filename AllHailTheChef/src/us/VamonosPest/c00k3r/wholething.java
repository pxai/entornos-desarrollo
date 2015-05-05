package us.VamonosPest.c00k3r;

import java.util.Vector;

public class wholething {
	Vector<stuff> mybitches = new Vector<stuff>();
	
	public void add_some_stuff (stuff s) {
		mybitches.add(s);
	}
	
	public void remove__stuff(int somewhere_in_da_array) {
		if (somewhere_in_da_array < mybitches.size())
			mybitches.removeElementAt(somewhere_in_da_array);
	}
	
	public String show_all_stuff () {
		String whatup_biatch = "";
		
		for (int I=0;I<mybitches.size();I++)
			whatup_biatch += mybitches.elementAt(I).showstuff() + "\n";
		
		return whatup_biatch;
	}
}
