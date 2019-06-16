package Harkkatyo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * 
 * Created Mar 10, 2017
 * @author Mikael Heininen y104491 <a href="mailto:mikael.heininen@student.uwasa.fi">mikael.heininen@student.uwasa.fi</a>
 */
public class HomeList 
{
	/**
	 * ArrayList called list2 saving Car objects.
	 */
	private ArrayList<Car> list2;
	
	/**
	 * Constructor is for creating ArrayList called list2 which saves Car objects.
	 */
	public HomeList()
	{
		list2 = new ArrayList<Car>();
	}
	
	/**
	 * Adds g to HomeList.
	 * @param g the g to add to HomeList.
	 */
	public void Add(Car g)
	{
		list2.add(g);
	}
	
	/**
	 * Removes d from HomeList.
	 * @param d the d to remove from HomeList.
	 */
	public void Remove(Car d)
	{
		list2.remove(d);
	}
	
	/**
	 * 
	 * Checks if HomeList is empty, if so notes user from that.
	 * If HomeList is not empty then prints it.
	 */
	public void PrintHomeList()
	{
		if(list2.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Kaikki autot varattu!");
		}
		
		for(Car u: list2)
		{
			JOptionPane.showMessageDialog(null, u);
		}
		
	}
	
	
	/**
	 * Searches l from HomeList, if found returns 1, if not found returns 0.
	 * @param l the l to search from HomeList.
	 * @return 1
	 * @return 0
	 */
	public int CheckPrintHomeList(Car l)
	{
		if(list2.contains(l))
			return 1;
		else
			return 0;
	}
	

	
}
