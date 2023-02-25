
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class coche {
    public String Matricula;
    public String Marca;
    public String Modelo;
    Propietario propi;
    public static int total_c;

    
    public coche(String matri, String marca, String modelo) {
        Matricula = matri;
        Marca = marca;
        Modelo = modelo;

        total_c++;
    }

    public void VER_COCHES(ArrayList<coche> cochesList) {
        for (int i = 0; i < cochesList.size(); i++) {

            System.out.println("La matricula es: " + cochesList.get(i).Matricula);
            System.out.println("La marca es: " + cochesList.get(i).Marca);
            System.out.println("El modelo es: " + cochesList.get(i).Modelo);
            System.out.println(" ");
        }
    }

    public void VER_COCHE(ArrayList<coche> cochesList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que coche quieres visualizar? Introduce su matricula");
        String BuscarCoche = sc.next();
        boolean exite = false;
        int clave = 0;
        
        for (int j = 0; j < cochesList.size(); j++) {
            if (BuscarCoche.equalsIgnoreCase(cochesList.get(j).Matricula)) {
                exite = true;
                clave = j;
            }
        }
        if (exite == true) {
            System.out.println("La matricula es: " + cochesList.get(clave).Matricula);
            System.out.println("La marca es: " + cochesList.get(clave).Marca);
            System.out.println("El modelo es: " + cochesList.get(clave).Modelo);
            System.out.println(" ");

        } else if (exite == false) {
            System.out.println("El coche no exite");
        }
    }
    
    public static int BUSCAR_COCHE(ArrayList<coche> cochesList, String matri_nueva){
        int pos=-1;
        boolean exite=false;
        for (int j = 0; j < cochesList.size(); j++) {
            if (matri_nueva.equalsIgnoreCase(cochesList.get(j).Matricula)){
                exite=true;
                pos=j;
            }
        }
        
        return pos;
    }
}
