package graf_l_a;

import java.util.Scanner;

public class MainPg {

	public static void main(String[] args) 
	{
		Scanner citire=new Scanner(System.in);
		Graf G=new Graf();
/*	
		G.addNod(1, 0);
		G.addNod(2, 1);
		G.addNod(3, 2);
		Afiseaza(G);
		
		G.addMuchie(1, 2);
		G.addMuchie(3, 2);
		Afiseaza(G);
		System.out.println();
		
		G.deleteNod(2);
		Afiseaza(G);
*/
		int continua=1;
		int i=0,optiune;
		
		AfisareOptiuni();
	
	
		try{
		while(continua==1)
		{
			System.out.println("Introduceti optiunea ");
			 optiune=citire.nextInt();
		switch (optiune)
		{
		case 0:
		{
			continua=0;
				break;
		}
		case 1:
		{
			System.out.println("Introdu nodul:");
			int x=citire.nextInt();
			i=G.graf.size();
			G.addNod(x,i);
			System.out.println("Noua lista:");
			Afiseaza(G);
			break;
		}
		case 2:
		{
			System.out.println("Introduceti muchia:");
			int x=citire.nextInt();
			int y=citire.nextInt();
			G.addMuchie(x, y);
			System.out.println("Noua lista:");
			Afiseaza(G);
			break;
		}
		case 3:
		{
			System.out.println("Nodul pe care doriti sa il stergeti:");
			int x=citire.nextInt();
			G.deleteNod(x);
			System.out.println("Noua lista:");
			Afiseaza(G);
			break;
		}
		case 4:
		{
			System.out.println("Introduceti muchia pe care doriti sa o stergeti: ");
			int x=citire.nextInt();
			int y=citire.nextInt();
			G.deleteMuchie(x, y);
			System.out.println("Noua lista:");
			Afiseaza(G);
			break;
		}
		case 5:
		{
			int c_n=1,c_l=1,i1=0,j1=1;
			do
			{
				System.out.println("Introduceti nodul (end->0): ");
				c_n=citire.nextInt();
				
				if(c_n!=0)
				{
				G.addNod(c_n,i1);
				
				System.out.println("Introduceti nodurile adiacente acestuia (end->0): ");
				
				do
				{
					c_l=citire.nextInt();
					if(c_l!=0)
					{
					G.graf.get(i1).add(j1,c_l);
					j1++;
					}
				}while(c_l!=0);
				i1++;
				j1=1;
				}
				
			}while(c_n!=0);
			break;
		}
		case 6:
		{
			Afiseaza(G);
			break;
		}
		case 7:
		{
		AfisareOptiuni();
		break;
		}
	}
		}
		}
		catch(Exception e)
		{
			System.out.println("Operatia nu este posibila");
		}
	}
	public static void Afiseaza(Graf g)
	{
		for(int i=0;i<g.graf.size();i++)
		{
			for(int j=0;j<g.graf.get(i).size();j++)
				System.out.print(g.graf.get(i).get(j)+" ");
			System.out.println();
		}
	}

	public static void AfisareOptiuni()
	{
		System.out.println("1 -- Adauga nod");
		System.out.println("2 -- Adauga muchie");
		System.out.println("3 -- Sterge nod");
		System.out.println("4 -- Sterge muchie");
		System.out.println("5 -- Introdu lista de adiacenta");
		System.out.println("6 -- Afiseaza lista de adiacenta");
		System.out.println("7 -- Afiseaza meniul");
		System.out.println("0 -- Exit");
	}
	
}
