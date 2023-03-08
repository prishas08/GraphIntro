import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryMaze {
	
	private int row;
	private int column;
	private int test;
	
	public BinaryMaze(String fileName) throws FileNotFoundException
	{
		File text = new File (fileName);
		Scanner s = new Scanner(text);
		row = s.nextInt();
		column = s.nextInt();
		test = s.nextInt();
	}
	
	public int BFS(int queue[][], Point start, Point end)
	{
		int rowArray[] = {-1,0,0,1};
		int colArray[] = {0,-1,1,0};
		boolean visit[][] = new boolean[row][column];
		visit[start.x][start.y]= true;
		Queue<node> n = new LinkedList<>();
		n.add(new node(start,0));
		while(!n.isEmpty())
		{
			node now = n.peek();
			Point p = now.p;
			//found
			if(p.x==end.x && p.y==end.y)
			{
				return now.far;
			}
			
			//else
			n.remove();
			for(int i = 0; i<4; i++)
			{
				int r = p.x+rowArray[i];
				int c = p.y+colArray[i];
				
				if(queue[r][c]==1 && !visit[r][c])
				{
					visit[r][c]=true;
					node next = new node(new Point(r,c) , now.far+1);
					n.add(next);
				}
			}
		}
		return -1;
		
	}
	
	private class node
	{
		Point p;
		int far;
		
		public node(Point poin, int y)
		{
			p = poin;
			far = y;
		}
	}
	private class Point
	{
		int x;
		int y;
		public Point(int one, int two)
		{
			x = one;
			y = two;
		}
	}
	

}
