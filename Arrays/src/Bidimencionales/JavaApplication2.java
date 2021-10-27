package Bidimencionales;
//https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=182:ejercicios-ejemplos-resueltos-con-arrays-arreglos-unidimensionales-en-java-calcular-letra-dni-cu00904c&catid=58&Itemid=180

import java.util.Scanner;


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int DATA[];
        int tam=0;
       
        DATA=LeerArray( );
        ImprimeArray(DATA);
        tam=BuscaValCant(DATA, 5);
        System.out.println("  ");
        
        if (tam!=0){
        System.out.println("  ");
        System.out.println(" Posiciones ");
           for (int i=0;i<tam;i++)
                  System.out.print("  "+PosicArr(DATA,tam,5)[i]);
           
           System.out.println("  ");
        }
    }
        
    public static int [] LeerArray( ){
        
        int data[];
       
        data = new int[10];
        
        for (int i=0;i<data.length;i++)
            data[i]=(int)(Math.random() * 5) +1;
       
        return data;
    }
    
     public static void ImprimeArray(int DATA[] ){
        
        for (int i=0;i<DATA.length;i++)
            System.out.print("  "+DATA[i]);
    }
     
       public static int [] PosicArr(int DATA[], int tam, int valor){
        
           int arPos [];
           int k=0;
           
           arPos=new int[tam];
           
        for (int i=0;i<DATA.length;i++){
             if (DATA[i]==valor){
                   arPos[k]=i;
                   k++;
         }}
            
        return arPos;
    }
        public static int BuscaValCant(int DATA[], int valor){
        
           int k=0;
           
        for (int i=0;i<DATA.length;i++)
            if (DATA[i]==valor)
                   k++;
        
        return k;
    }
       
}
