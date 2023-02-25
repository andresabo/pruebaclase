
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
public class coches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matri, marca, modelo, propi, dni;
        int telefono;
        
        ArrayList<coche> cochesList = new ArrayList();
        coche cocheOb1= null;
        
        ArrayList<Propietario> propiList= new ArrayList();
        Propietario propiOb1=null;
        int opc;
        do {
            System.out.println("1. Alta datos del coche");
            System.out.println("2. Ver datos de todos los coches");
            System.out.println("3. Ver datos de coche en concreto");
            System.out.println("4. Introduce matricula para buscar coche");
            System.out.println("5. Alta datos del propietario");
            System.out.println("6. Ver datos de todos los propietarios");
            System.out.println("7. Ver datos de propietario concreto");
            System.out.println("8. Introduce dni para buscar propietario");
            System.out.println("9. Asignar propietario a coche");

            opc = sc.nextInt();
            switch (opc) {
                case 1:

                    System.out.println("Introduce matricula:");
                    matri = sc.next();
                    System.out.println("Introduce marca:");
                    marca = sc.next();
                    System.out.println("Introduce modelo");
                    modelo = sc.next();

                    cocheOb1=new coche(matri, marca, modelo);
                    cochesList.add(cocheOb1);

                    break;

                case 2:
                    cocheOb1.VER_COCHES(cochesList);
                   
                    break;

                case 3:
                    cocheOb1.VER_COCHE(cochesList);
                    break;
                
                case 4:
                    System.out.println("Introduce matricula:");
                    String matri_nueva=sc.next();
                    int posicion=cocheOb1.BUSCAR_COCHE(cochesList, matri_nueva);
                    System.out.println("El coche esta en la posicion " + posicion);
                    break;
                    
                case 5:
                    System.out.println("Introduce propietario:");
                    propi = sc.next();
                    System.out.println("Introduce DNI:");
                    dni = sc.next();
                    System.out.println("Introduce telefono:");
                    telefono = sc.nextInt();

                    propiOb1=new Propietario(propi, dni, telefono);
                    propiList.add(propiOb1);
                    break;
                    
                case 6:
                    propiOb1.VER_PROPIS(propiList);
                    
                    break;
                    
                case 7:
                    propiOb1.VER_PROPI(propiList);
                    
                    break;
                    
                case 8:
                    System.out.println("Introduce DNI:");
                    String dni_nuevo=sc.next();
                    int posPropi=propiOb1.BUSCAR_PROPI(propiList, dni_nuevo);
                    System.out.println("El propietario esta en la posicion " + posPropi);
                    
                    break;
                    
                case 9:
                    propiOb1.ASIGNA_PROP(propiList, cochesList);
                         
            }
        } while (opc != 0);
    }
}
