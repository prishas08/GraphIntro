import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChildsPlay {
	
	private int n;
	private int m;
	private int l;
	private ArrayList<List> graph;
	
	public ChildsPlay(String fileName) throws FileNotFoundException
	{
		File text = new File (fileName);
		Scanner s = new Scanner(text);
		int num = s.nextInt();
		n = s.nextInt();
		m = s.nextInt();
		l = s.nextInt();
		graph = new ArrayList<List>();
		while(m!=0)
		{
			graph.add(new List(s.nextInt()));
			graph.get(m).add(s.next());
			m--;
		}
		
		for(int i = 0; i < num; i++)
		{
			game();
		}
		
	}
	
	public int game()
	{
		int counter = 0;
		
		return counter;
	}

}
