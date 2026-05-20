
import Models.Person;
//import Models.Product;

public class App {
    public static void main(String[] args) {
        System.out.println("Busqueda Persona");
        //Crear el arreglo.
        Person [] persons = App.generatePersonList();
        BusquedaPersona bPersona = new BusquedaPersona();
        //Orden por edad.
        bPersona.sortByAge(persons);
        //Imprime en orden el arreglo.
            for (Person Person: persons){
                System.out.println(Person);
            }
        //Establece la edad de persona a buscar.
        int res = bPersona.findByAge(persons, 18);
            if (res >= 0){
            System.out.println();
            System.out.println("La persona con la edad " + persons[res].getEdad() +" "+ " es " + persons[res].getNombre());
        }else{
            System.out.println("No se encontro");
        
        }
    }
    public static Person [] generatePersonList() {
        Person [] persons1 = new Person[9];
        persons1[0] = new Person("Pablo", 4);
        persons1[1] = new Person("Maria", 5);
        persons1[2] = new Person("Juan", 18);
        persons1[3] = new Person("David", 60);
        persons1[4] = new Person("Mateo", 25);
        persons1[5] = new Person("Diego", 12);
        persons1[6] = new Person("Ana"  , 8);
        persons1[7] = new Person("Alicia", 9);
        persons1[8] = new Person("Jaime", 40);
        return persons1;
    }
}
         // //Product [] products = {
        //     new Product("Laptop", 20),
        //     new Product("Smartphone", 25),
        //     new Product("Tablet", 10),
        //     new Product("Monitor", 5),
        //     new Product("Keyboard", 15)
        // //     };
        // System.out.println("Busqueda Binaria");
        // BusquedaBinaria bBinaria = new BusquedaBinaria();
        // bBinaria.sortByName(products);
        //     for (Product product : products){
        //         System.out.println(product);
        //     }

        // int res = bBinaria.findByName(products, "Laptop");
        // if (res >= 0){
        //     System.out.println("Entre en pos = " + res);
        // }else{
        //     System.out.println("No se encontro");
        // }

    

