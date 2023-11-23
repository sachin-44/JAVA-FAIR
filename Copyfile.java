import java.io.*;
class CopyFile_48{
	public static void main(String args[])
	{
		int i;
		String str="";
		FileInputStream fin=null;
		FileOutputStream fout=null;
		
		if(args.length!=2)
		{
			System.out.println("Enter two files");
		}
		else
		{	
			try{
				fin=new FileInputStream(args[0]);
				fout=new FileOutputStream(args[1]);
				while((i=fin.read())!=-1)
				{
					System.out.print((char)i);
					str=str+(char)i;
					fout.write(str.getBytes());
					str="";
				}
				
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
				if(fout!=null)
					fout.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}	
			}
		}
	}
}
	
