import java.util.*;
import java.io.*;


public class Serveur {
    
    private static int port = 12345;
    
    private ServeurSocket serveurSocket;
    private Hastable<int nb, int persistance> Persistance;
    private ArrayList<Worker> nbWorker;

    public Serveur() throws IOException{
        serveurSocket = new ServeurSocket(port);
        Persistance = new Hashtable<int, int>();
        nbWorker = new ArrayList<Worker>();


        new Thread(new DistributionTache()).start();
    }

    private synchronized addWorker(String PseudoWorker, int nbCoeurs){
       //recupére un worker qui s'est connecté
        //ajoute un worker au tableau de workers
    }

    
}
