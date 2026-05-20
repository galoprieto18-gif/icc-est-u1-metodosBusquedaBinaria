import Models.Person;

public class BusquedaPersona {

    public void sortByAge (Person [] persons){
        //Ordenamiento de arreglo. 
        for(int i = 0; i < persons.length-1; i++){
            boolean swap = false;
            for (int j =0; j < persons.length-i-1; j++){
                if(persons[j].getEdad() > persons[j+1].getEdad()){
                    Person temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
    public int findByAge (Person [] persons, int edad){
        System.out.println();
        System.out.println("---------BUSQUEDA DE LA PERSONA CON LA EDAD DE 18 AÑOS-----------");
        System.out.println("Arreglo Ordenado:");
        int bajo = 0;
        int alto = persons.length - 1;

        while (bajo <= alto){
            //calculo para encontrar el valor del centro.
            int centro= (bajo + alto) / 2;
            int valorCentro = persons [centro].getEdad();
            for( int i = bajo; i <= alto; i++){
            //Muestra solos los elementos que quedan en el rango de busqueda en cada iten. 
                System.out.print(persons[i].getEdad()+ "|");       
            }
            System.out.println();
            //Muestra el estado actual de la busqueda que va a rastrearla visualmente.
            System.out.print("bajo=" + bajo + "   ");
            System.out.print("alto=" + alto + "   ");
            System.out.print("centro="+ centro + "   ");
            System.out.print("valorCentro=" + valorCentro + "    ") ;
            
            if(persons[centro].getEdad() == edad ) {
                System.out.println(" --->ENCONTRADO");
                return centro;
            }
            // se implementa para diferenciar el avance entre derecha y izquierda.
            int comparacion = persons[centro].getEdad() - edad;

            if(comparacion < 0) {
                bajo = centro + 1;
                System.out.print(" --->DERECHA");
                System.out.println();
                
            }else{
                alto = centro - 1;
                System.out.print(" --->IZQUIERDA"); 
                System.out.println();
                 
        }
        System.out.println();
    }
    return -1;
}
}
