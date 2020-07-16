using System;

class Promemulti
{
static void Main(){
    double suma = 0, prome = 0, acum = 0,suc = 0, promcur = 0;
    int nu, cantmes, asigna;
    Console.WriteLine("Digite cantidad de estudiantes ");
    nu= int.Parse(Console.ReadLine());
    Console.WriteLine("Cantidad de meses ");
    cantmes= int.Parse(Console.ReadLine());
    Console.WriteLine("Cantidad de materias ");
    asigna= int.Parse(Console.ReadLine());


    int [,,] notas = new int[nu,cantmes,asigna];
 
        for (int i=0; i<nu; i++){
            for(int j=0; j<cantmes; j++){
                    for (int k=0; k<asigna; k++){
                        Console.WriteLine(" Digite la nota "+ (k+1) + " del  Estudiante "+ (i+1) +" en el mes "+ (j+1)+": ");
                    notas[i, k, j] = int.Parse(Console.ReadLine());
                        suma += notas[i,k,j];
                        suc++;
                    }
            }
            prome = (suma /  asigna)/ cantmes;
            acum += prome;
            suma=0;
            Console.WriteLine("El promedio del estudiante " + (i+1)+ ", es: "+ prome+ ("\n"));  
       }
        promcur = (acum/nu);
        Console.WriteLine("El promedio del curso es " +promcur);
 }
}
