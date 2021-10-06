/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blascomatiasmartin_tp7;

/**
 *
 * @author M
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia i = new Materia(1, "Ingles I de primer año", 1);
        Materia ii = new Materia(2, "Matemáticas de primer año", 1);
        Materia iii = new Materia(3, "Laboratorio 1 de primer año", 1);
        Alumno a1 = new Alumno (1001, "López", "Martin");
        Alumno a2 = new Alumno (1002, "Martínez", "Brenda");
        
        a1.agregarMateria(i);
        a1.agregarMateria(ii);
        a1.agregarMateria(iii);
        
        a2.agregarMateria(i);
        a2.agregarMateria(ii);
        a2.agregarMateria(iii);
        a2.agregarMateria(iii);
        
        System.out.println("El alumno López esta inscripto en: "+a1.cantidadMaterias()+" materias");
        System.out.println("El alumno Martínez inscripto en: "+a2.cantidadMaterias()+" materias");
    }
    
}
