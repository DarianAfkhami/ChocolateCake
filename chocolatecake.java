package chocolatecake;
public class chocolatecake
{
	private int rows,cols;
	String[][] letterBlock;
	private String message = "";

	public String[][] getLetterBlock()
	{
		return letterBlock;
	}

	public void fillBlock(String str, int r, int c)
	{
		rows = r;
		cols = c;
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
						letterBlock[y][x] = "'";
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
							letterBlock[y][x] = "'";						
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
	
	public String encryptBlock()
	{
		for(int x=0;x<cols;x++)
		{
			for(int y=0;y<rows;y++)
			{
				message = message + letterBlock[y][x];
			}
		}
		
		System.out.println("ENCRYPT BLOCK: ");
		System.out.println(message);
		return message;
	}
}
