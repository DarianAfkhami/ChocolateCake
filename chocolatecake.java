package chocolatecake;
public class chocolatecake
{
	private int rows,cols;
	public chocolatecake(int r, int c)
	{
		rows = r;
		cols = c;
	}

	public void fillBlock(String str)
	{
		String[][] letterBlock = new String[rows][cols];
		int tracker=0;
		for(int y=0;y<rows;y++)
		{
			for(int x=0;x<cols;x++)
			{
				str = str.substring(0, rows*cols);
				letterBlock[y][x] = str.substring(tracker, tracker+1);
				tracker++;
				if(letterBlock[y][x].equals(" "))
				{
					letterBlock[y][x] = "x";
				}
			}		
		}
		
		for(int y=0;y<rows;y++)
		{
			for(int x=0;x<cols;x++)
			{
			System.out.print(letterBlock[y][x]);
			}
			System.out.println("\n");
		}
	}
	
}