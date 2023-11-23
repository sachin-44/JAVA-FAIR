import java.io.*;
class CountFile_48{
	public static void main(String args[]){
		FileInputStream fin=null;
		int i;
		int charCount=0;
		int lineCount=0;
		int wordCount=0;
		String str="";
		if(args.length!=1)
		{
			System.out.println("Enter a file name");
		}
		else
		{
			try{
				fin=new FileInputStream(args[0]);
				while((i=fin.read())!=-1)
				{
					if((char)i=='\n')
					{
						lineCount++;
						wordCount++;
					}
						
					else if((char)i==' ')
					{
						wordCount++;
						charCount++;
					}
					else
					{
						charCount++;
					}
					
				}
				System.out.println("Characters:"+ charCount);
				System.out.println("words:"+ wordCount);
				System.out.println("line:"+ lineCount);
			}
				
			
			catch(FileNotFoundException f)
			{
				System.out.println(f);
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			finally
			{
			try{
				if(fin!=null)
					fin.close();
				
			}
			catch(IOException e)
			{
				System.out.println(e);
			}	
		}
		}
	}
}	
						
