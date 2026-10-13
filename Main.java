/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juperez03
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registro del estudinante");
        System.out.print("Ingrese nombre: ");
        String nombreEst = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edadEst = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Ingrese documento: ");
        String docEst = scanner.nextLine();
        System.out.print("Ingrese programa: ");
        String programaEst = scanner.nextLine();
        System.out.print("Ingrese promedio: ");
        double promedioEst = scanner.nextDouble();
        scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombreEst, edadEst, docEst, programaEst, promedioEst);
        System.out.println("\n Registro del profesor ");
        System.out.print("Ingrese nombre: ");
        String nombreProf = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edadProf = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese documento: ");
        String docProf = scanner.nextLine();
        System.out.print("Ingrese area: ");
        String areaProf = scanner.nextLine();
        System.out.print("Ingrese salario base: ");
        double salarioProf = scanner.nextDouble();
        System.out.print("Ingrese horas catedra: ");
        int horasProf = scanner.nextInt();

        Profesor profesor = new Profesor(nombreProf, edadProf, docProf, areaProf, salarioProf, horasProf);
        System.out.println("Informacion del estudiante");
        System.out.println("Rol: " + estudiante.getRol());
        estudiante.mostrarInfo();

        System.out.println("Inforcion del Profesor");
        System.out.println("Rol: " + profesor.getRol());
        profesor.mostrarInfo();

        scanner.close();
    }
}


