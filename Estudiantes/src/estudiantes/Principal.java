/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;


public class Principal {
    public static void main (String[] agrs){
        
        Estudiantes[] estudiantes= new Estudiantes[3];
        
        //Estudiante 1
        estudiantes[0] = new Estudiantes("Juan","Perez","1234567890");
        String [] m= {"M1","M2"};
        
        estudiantes [0].setMaterias(m);
        String [] materiasEstudiantes = estudiantes[0].getMaterias();
        
        System.out.println("# Estudiante 1");
        System.out.println("Nombre completo: "+ estudiantes[0].getNombre()
                +" "+estudiantes[0].getApellido());
        System.out.println("Cédula: "+ estudiantes[0].getCedula());
        System.out.println("Materias: ");
        for(int i=0; i<materiasEstudiantes. length; i++){
            int n=1+i;
            System.out.println(n +". "+materiasEstudiantes[i]);
        }
        System.out.println();
        
        //Estudiante 2
        estudiantes[1] = new Estudiantes("María","Castro","0987654321");
        String [] m1= {"M2","M3","M4"};
        
        estudiantes [1].setMaterias(m1);
        String [] materiasEstudiantes1 = estudiantes[1].getMaterias();
        
        System.out.println("# Estudiante 2");
        System.out.println("Nombre completo: "+ estudiantes[1].getNombre()
                +" "+estudiantes[1].getApellido());
        System.out.println("Cédula: "+ estudiantes[1].getCedula());
        System.out.println("Materias: ");
        for(int i=0; i<materiasEstudiantes1. length; i++){
            int n=1+i;
            System.out.println(n +". "+materiasEstudiantes1[i]);
        }
        System.out.println();
        
        //Estudiante 3
        estudiantes[2] = new Estudiantes("Pedro","Benitez","5678654323");
        String [] m2= {"M2","M3","M4","M5"};
        
        estudiantes [2].setMaterias(m2);
        String [] materiasEstudiantes2 = estudiantes[2].getMaterias();
        
        System.out.println("# Estudiante 3");
        System.out.println("Nombre completo: "+ estudiantes[2].getNombre()
                +" "+estudiantes[2].getApellido());
        System.out.println("Cédula: "+ estudiantes[2].getCedula());
        System.out.println("Materias: ");
        for(int i=0; i<materiasEstudiantes2. length; i++){
            int n=1+i;
            System.out.println(n +". "+materiasEstudiantes2[i]);
        }
        System.out.println();
        
        //Resumen de materias
        System.out.println("###RESUMEN DE MATERIAS###");
        int ma1=1;
        int ma2=1;
        int ma3=1;
        int ma4=1;
        int ma5=1;
        
        //Comparación de cada arreglo para ver cual se repite
        for(int i=0; i<materiasEstudiantes1. length; i++){
            if(materiasEstudiantes[0] == materiasEstudiantes1[i] ){
                ma1++;
            } if (materiasEstudiantes[1] == materiasEstudiantes1[i] ){
                ma2++;
            }
        }
        for(int i=0; i<materiasEstudiantes2. length; i++){
            if(materiasEstudiantes[0] == materiasEstudiantes2[i] ){
                ma1++;
            } if (materiasEstudiantes[1] == materiasEstudiantes2[i] ){
                ma2++;
            }
        }
        for(int i=0; i<materiasEstudiantes2. length; i++){
            if(materiasEstudiantes1[1] == materiasEstudiantes2[i] ){
                ma3++;
            } if(materiasEstudiantes1[2] == materiasEstudiantes2[i] ){
                ma4++;
            } 
        }
        for(int i=0; i<materiasEstudiantes. length; i++){
            if(materiasEstudiantes2[3] == materiasEstudiantes[i] ){
                ma5++;
            } 
        }
        for(int i=0; i<materiasEstudiantes1. length; i++){
            if(materiasEstudiantes2[3] == materiasEstudiantes1[i] ){
                ma5++;
            } 
        }
        
        System.out.println("M1= "+ ma1);
        System.out.println("M2= "+ ma2);
        System.out.println("M3= "+ ma3);
        System.out.println("M4= "+ ma4);
        System.out.println("M5= "+ ma5);
        
    }
}
