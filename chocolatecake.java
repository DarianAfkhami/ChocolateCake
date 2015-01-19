package chocolatecake;
public class chocolatecake
{
	private int rows,cols;
	String[][] letterBlock;
	private String message;
	public chocolatecake(int r, int c)
	{
		rows = r;
		cols = c;
	}
	public String[][] getLetterBlock()
	{
		return letterBlock;
	}

	public void fillBlock(String str)
	{
		letterBlock = new String[rows][cols];
		
		if(str.length() >= rows*cols)
		{
			int tracker=0;
			str = str.substring(0, rows*cols);
			for(int y=0;y<rows;y++)
			{
				for(int x=0;x<cols;x++)
				{
					letterBlock[y][x] = str.substring(tracker, tracker+1);
					if(letterBlock[y][x].equals(" "))
					{
						letterBlock[y][x] = "x";
					}
					tracker++;
				}
			}
		}	
		
		else if (str.length() < rows*cols)
		{
			int tracker=0;
			for(int y=0;y<rows;y++)
			{
				for(int x=0;x<cols;x++)
				{
					if(tracker < str.length())
					{
						letterBlock[y][x] = str.substring(tracker, tracker+1);
						if(letterBlock[y][x].equals(" "))
						{
							letterBlock[y][x] = "x";						
						}
					}
					else
					{
						letterBlock[y][x] = "z";
					}
					tracker++;
				}
			}		
		}
		
		System.out.println("FILL BLOCK: ");
		for(int y=0;y<rows;y++)
		{
			for(int x=0;x<cols;x++)
			{
			System.out.print(letterBlock[y][x]);
			}
			System.out.println("\n");
		}
	}
	
	public void encryptBlock()
	{
		for(int x=0;x<cols;x++)
		{
			for(int y=0;y<rows;y++)
			{
				letterBlock[y][x] = letterBlock[x][y];
			}
		}
		
		System.out.println("ENCRYPT BLOCK: ");
		for(int y=0;y<rows;y++)
		{
			for(int x=0;x<cols;x++)
			{
			System.out.print(letterBlock[x][y]);
			}
		}
	
	}
}
