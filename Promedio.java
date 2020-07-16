import java.util.Scanner;

public class Promedio {
    
    public static void main(String[] args) {
        Scanner est = new Scanner(System.in);
        Scanner canm = new Scanner(System.in);
        Scanner nest = new Scanner(System.in);
        int nu = 0;
        double suma = 0, prome = 0, acum = 0,suc = 0, promcur = 0;

        System.out.println("Digite cantidad de estudiantes");
        nu = est.nextInt();
        String asigna[] = {"Estructura ", "Discretas ", "Diferenciales"};
        String cantmes[] = {"Ene", "Feb", "Mes"};
        double notas[][][]= new double[(int)nu][asigna.length][cantmes.length];
        
        for(int i=0; i<nu; i++){
            for(int j=0; j<cantmes.length; j++){
                    for (int k=0; k<asigna.length; k++){
                        System.out.print(" Digite la nota "+ (k+1) + " del  Estudiante "+ (i+1) +" en el mes "+ (j+1)+": ");
                        notas[i][k][j] = nest.nextDouble();
                        suma += notas[i][k][j];
                        suc++;
                    }
            }
            prome = (suma / asigna.length)/ cantmes.length;
            acum += prome;
            suma=0;
            System.out.println("El promedio del estudiante " + (i+1)+ ", es: "+ prome+ ("\n"));  
       }
        promcur = (acum/nu);
        System.out.println("El promedio del curso es " +promcur);
 }
}
