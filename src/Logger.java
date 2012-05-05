import java.io.*;

public class Logger {
	
	BufferedWriter wr;
	
	public Logger(){
		try{
			wr = new BufferedWriter(new FileWriter("log.txt"));
		}
		catch(IOException e){
			
		}
	}
		
	
	public void writeToLog(String msg){
		try {
			wr.write(msg + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(){
		try {
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
