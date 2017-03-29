package graf_l_a;

import java.util.ArrayList;

public class Graf 
{
	ArrayList<ArrayList<Integer>> graf;
	Graf()
	{
		graf=new ArrayList<ArrayList<Integer>>();
	}
	
	public void addNod(int nod,int i)
	{
		graf.add(new ArrayList<Integer>());
		graf.get(i).add(nod);
	}
	public void addMuchie(int n1,int n2)
	{
		try
		{
			for(int i=0;i<graf.size();i++)
			{
				if(graf.get(i).get(0)==n1)
				{
					int j=graf.get(i).size();
					
						graf.get(i).add(j,n2);
			
				}
			}
			for(int i=0;i<graf.size();i++)
			{
				if(graf.get(i).get(0)==n2)
				{
					int j=graf.get(i).size();
					graf.get(i).add(j,n1);
			
				}
			}
			

		}
		catch(Exception e)
		{
			System.out.println("Nu exista aceste noduri. Muchia nu poate fi adaugata.");
		}
	}
	public void deleteNod(int nod)
	{
		try
		{
			
			for(int i=0;i<graf.size();i++)
				if(graf.get(i).get(0)==nod)graf.remove(i);
			
			for(int i=0;i<graf.size();i++)
				for(int j=0;j<graf.get(i).size();j++)
				{
					if(graf.get(i).get(j)==nod)graf.get(i).remove(j);
				}
					
			
		}
		catch(Exception e)
		{
			System.out.println("Nu exista acest nod");
		}
	}

	public void deleteMuchie(int n1, int n2)
	{
		
		try
		{
			
			for(int i=0;i<graf.size();i++)
			{
				if(graf.get(i).get(0)==n1)
				{
					for(int j=0;j<graf.get(i).size();j++)
						if(graf.get(i).get(j)==n2)graf.get(i).remove(j);
			
				}
			}
			for(int i=0;i<graf.size();i++)
			{
				if(graf.get(i).get(0)==n2)
				{
					for(int j=0;j<graf.get(i).size();j++)
						if(graf.get(i).get(j)==n1)graf.get(i).remove(j);
			
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Nu exista aceasta muchie");
		}
	}
}
