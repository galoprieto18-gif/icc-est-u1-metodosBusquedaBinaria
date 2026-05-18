import Models.Persons;

public class BusquedaPersona {

    public void sortByYear (Persons [] persons){


        for(int i = 0; i< persons.length-1; i++){
            boolean swap = false;
            for (int j =0; j<persons.length-i-1; j++){
                if(persons[j].getEdad() > persons[j+1].getEdad()){
                    Persons temp = persons[j];
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
    
}
