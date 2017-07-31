package cw20170731;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		/* 1)
		try{
			FileInputStream f = new FileInputStream("help.txt");
			try{
				int read = f.read();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			finally{
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		*/
		/* 2)
		try{
			FileInputStream f = new FileInputStream("help.txt");
			try{
				int read = f.read();
			}
			finally{
					f.close();			
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	*/
		
		try(FileInputStream f = new FileInputStream("/help.txt")){
				int read = f.read();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
