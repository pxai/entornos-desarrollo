/**
 * 
 */
package us.VamonosPest.c00k3r;


public class stuff {
	String name_of_stuff;
	float gr;
	
	public stuff(String l, float g) 
	{
		name_of_stuff = l;
		gr = g;
	}
	
	public String showstuff () 
	{
		return name_of_stuff + ": " + gr + "gr.";
	}

}
