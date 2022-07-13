import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Parte 1 : 
        System.out.println(sumar(5, 10, 15));
        
        //Parte 2 : 
        Coche nuevoCoche=new Coche();
        nuevoCoche.aumentarPuertas();
        System.out.println("numero de puertas: "+ nuevoCoche.numeroPuertas);
    }
         public static  int sumar(int param1,int param2,int param3){
            return param1+param2+param3;
        }

    public static class Coche{
        private int numeroPuertas=4;
        public Coche(){}

        public int aumentarPuertas(){
            return numeroPuertas++;
        }

    }
}
