import Models.Product;

public class BusquedaBinaria {

    public void sortByName (Product [] products){
        for (int i = 0; i< products.length-1; i++){
            boolean swap = false;
            for (int j =0; j<products.length-i-1; j++){
                if(products[j].getNombre().compareTo(products[j+1].getNombre())>0){
                    Product temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                    swap = true; 
                }
            }
            if (!swap){
                break;
            }

        }
    }

    public int findByName (Product [] products, String nombre){
        // definamos bajo & alto 
        int bajo = 0;
        int alto = products.length - 1;
         // comparemos con la clave 
        while (bajo <= alto){
            int central = (bajo + alto) / 2;
            if(products [central].getNombre().equals(nombre)) {
                return central;
            }
            // Si voy a la der o izq
            int comparacion = products[central].getNombre().compareTo(nombre);
            if(comparacion < 0) {
                bajo = central + 1 ;
            } else{
                alto = central - 1 ;
            }
        return -1;
        }
    }

        // definamos bajo & alto 
        // comparemos con la clave 
        // si es igual, retornamos el punto medio 
        // si es mayor, actualizamos el index correspondiente
        // si es menor, actualizamos el index correspondiente 


    }

