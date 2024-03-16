import java.io.*;
import java.net.*;

public class Worker {
    
}

class GererWorker extends Thread {
    private BufferedReader entreeClavier;
	private ObjectOutputStream pw;

	public GererWorker(ObjectOutputStream pw) {
		entreeClavier = new BufferedReader(new InputStreamReader(System.in));
		this.pw = pw;
	}

    public void run(){
        String str;
        try{
            while(!(str = entreeClavier.readLine()).equals("STOP")){
                if(str.startsWith(Message.workerConnection.texte)){
                    
                }
            }
        }
    }


}
