
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
public class Propietario {

    public String dni;
    public String nombre;
    public int tlf;

    public Propietario(String nombre, String dni, int tlf) {
        this.nombre = nombre;
        this.dni = dni;
        this.tlf = tlf;
    }

    public void VER_PROPIS(ArrayList<Propietario> propiList) {
        for (int i = 0; i < propiList.size(); i++) {
            System.out.println("El propietario es: " + propiList.get(i).nombre);
            System.out.println("Su DNI es: " + propiList.get(i).dni);
            System.out.println("Su telefono es: " + propiList.get(i).tlf);
            System.out.println(" ");
        }
    }

    public void VER_PROPI(ArrayList<Propietario> propiList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que propietario quieres visualizar? Introduce su DNI");
        String BuscarDNI = sc.next();
        boolean exite = false;
        int clave = 0;

        for (int j = 0; j < propiList.size(); j++) {
            if (BuscarDNI.equalsIgnoreCase(propiList.get(j).dni)) {
                exite = true;
                clave = j;
            }
        }
        if (exite == true) {
            System.out.println("El propietario es: " + propiList.get(clave).nombre);
            System.out.println("Su DNI es: " + propiList.get(clave).dni);
            System.out.println("Su telefono es: " + propiList.get(clave).tlf);
            System.out.println(" ");

        } else if (exite == false) {
            System.out.println("El propietario no exite");
        }
    }

    public static int BUSCAR_PROPI(ArrayList<Propietario> propiList, String dni_nuevo) {
        int pos = -1;
        
        for (int j = 0; j < propiList.size(); j++) {
            if (dni_nuevo.equalsIgnoreCase(propiList.get(j).dni)) {
                
                pos = j;
                break;
            }
        }

        return pos;

    }

    public void ASIGNA_PROP(ArrayList<Propietario> propiList, ArrayList <coche> cochesList) {
        Scanner sc=new Scanner(System.in);
        
        String matri, dni;
        int posProp, posCoche;
        
        System.out.println("Introduce matricula:");
        matri=sc.next();
        System.out.println("Introduce DNI");
        dni=sc.next();
        
        posCoche=coche.BUSCAR_COCHE(cochesList,matri);
        
        posProp=Propietario.BUSCAR_PROPI(propiList, dni);
        
        if (posCoche>=0 && posProp>=0){
            cochesList.get(posCoche).propi=propiList.get(posProp);
        }
        
              
        
    }
}
