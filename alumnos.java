

import java.util.Scanner;
public class alumnos {
    public static void main(String[] args) {
       
        String nombre = "FRANCISCO MORALES";
        
        Scanner numero1 = new Scanner (System.in);
        System.out.println("Introduce la nota del examen1 ");
        double nota1 = numero1.nextDouble();
        
        Scanner numero2 = new Scanner (System.in);
        System.out.println("introduce la nota del examen 2");
        double nota2 = numero2.nextDouble();
        
        Scanner numero3 = new Scanner (System.in);
        System.out.println("introduce la nota del examen 3");
        double nota3 = numero3.nextDouble();
        
        Scanner numero4 = new Scanner (System.in);
        System.out.println("introduce la nota de la tarea 1");
        double nota4 = numero4.nextDouble();
        
        Scanner numero5 = new Scanner (System.in);
        System.out.println("introduce la nota de la tarea 2");
        double nota5 = numero5.nextDouble();
        
        double examen_1 = nota1 * 0.20;
        double examen_2 = nota2 * 0.20;
        double examen_3 = nota3 * 0.30;
        double tarea_1 = nota4 * 0.10;
        double tarea_2 = nota5 * 0.20;
        
        double nota_final = examen_1 + examen_2 + examen_3 + tarea_1 + tarea_2;
        
        if (nota_final >= 8 ) System.out.println("EL ALUMNO APROBO LA MATERIA CON LA NOTA DE:" + nota_final);
        else System.out.println("EL ALUMNO REPROBO LA MATERIA CON LA NOTA DE:" + nota_final);
       
        System.out.println("EL NOMBRE DEL ALUMNO ES:" + nombre);
    }
   }
