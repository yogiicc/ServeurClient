/*
 * 1) Connexion au serveur
 * 2) Etat + nb de coeurs
 * 3) Debut des taches: Creation du Thread, Calcul, retour res, etc
 */

import java.io.*;
import java.net.*;

public class WorkerZ{
    static int port = 12345;
    static String pseudo;

    static int etat;
    static int nbCoeurs;

    public static void main(String[] args) {

        //CONNEXION AU SERVEUR
        Socket socket = new Socket("IP", port);
        System.out.println("SOCKET = " + socket);


        //recevoir et envoyer des infos
        BufferedReader sisr = new BufferedReader(
                               new InputStreamReader(socket.getInputStream()));
        PrintWriter sisw = new PrintWriter(new BufferedWriter(
                                new OutputStreamWriter(socket.getOutputStream())),true);



        
        sisw.print("WO");
        //Worker Connecté et pas de taches crées
        if(etat==0){
            //creation de Thread en fonction du nombre de coeurs
            for(int i = 0; i<nbCoeurs; i++){
                Thread  [] nbTh = new Thread[nbCoeurs] ;
                nbTh[i]= new taches(); 
            }
            sisw.println("WD");
            //Worker Disponible avec taches en attente crées
            etat = 1; 
        }
    }
    
    
}




class taches extends Thread{
    static int numTh;
    

    public void run(){
        String calcul = "persistance";
        int nbCalcule = 15;
        int res;
        switch(calcul){
            case "persistance":
                res = calcul.persistance(nbCalcule);
                break;
            /*case "moyenne":
                res = calcul.moyenne(nbCalcule);
                break();*/
        }
        
    }
}
 
