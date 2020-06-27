package aleatorio;
import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    public static void main(String[] args) {      
 Scanner entrada=new Scanner(System.in);
        int canF,canCo,ran;  

System.out.print("Ingrese la cantidad de Filas:");
canF=entrada.nextInt();

System.out.print("Ingrese la cantidad de Columnas:");
canCo=entrada.nextInt();

System.out.print("Números Aleatorios del 1 al:____(Ingrese el rango):");
ran=entrada.nextInt();
  Random r=new Random();
  int [][] matriz =new int [canF][canCo];
  for(int i=0; i<canF; i++){
  for(int j=0; j<canCo; j++){
          matriz[i][j]=r.nextInt(ran);    
      }     
  }
   //imprimir los numeros aleatorios
System.out.println("Matriz original");
for(int i=0;  i<canF; i++){
 for(int j=0; j<canCo; j++){
    System.out.print(" "+matriz[i][j]+" ");
    }
 System.out.println("");
 }

for(int i=0; i<canCo; i++){
for(int j=0; j<canF; j++){
   
  }
}   
    System.out.println("matriz Tranaspuesta");
    //trasnponer matriz 
    for(int i=0; i<canCo; i++){
        for(int j=0; j<canF; j++){           
        System.out.print(" "+matriz[j][i]+" ");
        }
      System.out.println();
    }    
     }  
}
