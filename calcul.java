class calcul{
    public static void main(String [] args){
        int n;
        for(int i = 100; i<105; i++){
            n = persistance(i);
            System.out.println("Persistance total de " + i +" = " + n);
        }
    }

    public static int produit(int n){
        int p = 1;
        while(n!=0){
            p *= n%10;
            n = n/10;
            System.out.println("reste de /10:" + p + " Nouveau nombre : " + n);
        }
        return p;
    }

    public static int persistance(int n){
        int persistance = 0;
        while(n>9){
            n = produit(n);
            persistance ++;
            System.out.println("Nombre calculé: " + n + "Persistance :" + persistance);
        }
        return persistance;
    }
}





//créer une fonction qui cherche si le nombre trouvé est déja dans la mémoire

