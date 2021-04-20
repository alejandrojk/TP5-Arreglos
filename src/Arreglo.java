public class Arreglo {

    public static void sumarLista(int lista[]){
        int suma = 0;
        double promedio;
        for(int i=0;i<lista.length;i++)
        {
            suma += lista[i];
        }
        System.out.println("La suma es: "+suma);
        promedio = (suma/lista.length);
        System.out.println("El promedio es: "+promedio);
        
    }

    public static void buscaMayor(int numeros[][]){
        int mayor;
        mayor = numeros[0][0];
        for(int i=0;i<numeros.length;i++)
        {
            for(int j=0;j<numeros[i].length;j++)
            {
                if(numeros[i][j]>mayor)
                {
                    mayor = numeros[i][j];
                }
            }
        }
        System.out.println("El mayor de los numeros del arreglo es: "+mayor);
    }

    public static void cuentaVocales(String cadena){
        int vocal = 0;
        for(int i=0;i<cadena.length();i++)
        {
            if((cadena.charAt(i)=='a')||(cadena.charAt(i)=='e')||(cadena.charAt(i)=='i')||(cadena.charAt(i)=='o')||(cadena.charAt(i)=='u'))
            {
                vocal++;
            }
        }
        System.out.println("El numero de vocales es: "+vocal);
    }

    public static int cuentaCaracter(String cadena, char caracter){
      int pos = 0;
      int cont = 0;
      pos = cadena.indexOf(caracter);
      while(pos != -1){
        cont++;
        pos = cadena.indexOf(caracter, pos+1);
    }
      System.out.println("El caracter se repite: "+ cont +" veces");
      return cont;
    }
}
