import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Scooby {
	
	int numberDataCollect;
	LinkedList<String> graph[];
	public Scooby(String fileName) throws FileNotFoundException
	{
		File text = new File (fileName);
		Scanner s = new Scanner(text);
		int numberDataCollect = s.nextInt();
		String firstLine = s.nextLine();
		String[] str = firstLine.split(" ");
		for(int i = 0; i <str.length; i++)
		{
			add(i, str[i].substring(0,2));
			graph[i] = new LinkedList();
		}
		
	}
	
	public void add(int x, String y)
	{
		graph[x].add(y);
	}
	
	public void DFS(int x)
	{
		boolean visit[] = new boolean[x];
		DFSGraph(x,visit);
	}
	public void DFSGraph(int x, boolean visit[])
	{
		visit[x] = true;
		for(int i = 0; i < graph.length; i++)
		{
			if(!visit[i])
			{
				DFSGraph(i,visit);
			}
		}
		
	}
	
	

}
