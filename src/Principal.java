
import java.util.Scanner;

//estamos registrando los datos de un alumno con POO en un arreglo

public class Principal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        Alumno a[]=new Alumno[2];//creamos nuestro 1er objeto en forma de arreglo
        //Llenar de forma manual
        /*
        a[0].setMatricula(12);
        a[0].setNombre("sjdjbd");
        a[0].getMatricula();
        */
        String nombre="";
        int matricula=0;
        char grupo=' ';
        int grado=0;
        
        
        
        for(int i=0;i<a.length;i++){
            System.out.print("Ingresa tu nomnbre: ");
            nombre=entrada.nextLine();
            System.out.print("Ingresa tu matricula: ");
            matricula=entrada.nextInt();
            System.out.print("Ingresa tu grupo:");
            grupo=entrada.next().charAt(0);
            System.out.print("Ingresa grado: ");
            grado=entrada.nextInt();
            entrada.nextLine();//para corregir cuando se salta al momento de correr
            a[i]=new Alumno(nombre,matricula,grupo,grado);//para asociarlo tenemos q vincularlo al constructor
            //
        }
       
        for(int i=0;i<a.length;i++){
            System.out.println("nombre:"+a[i].getNombre()+" "+a[i].getMatricula()+" "+a[i].getGrupo()+ " "+a[i].getGrado());
        }
        
        
        
        
        
        
        
    }
}
