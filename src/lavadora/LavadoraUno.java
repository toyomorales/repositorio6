
package lavadora;

import libreria.LLFunciones1;
import java.util.Scanner;


public class LavadoraUno {
    public static void main(String[] args) {
        //esta el la actuaización de la lavadora
        Scanner entrada = new Scanner(System.in);
        System.out.println("La ropa es blanco o de color");
        System.out.println("Presione 1 si es blanca / presione 2 si es de color");
        int tipodeRopa = entrada.nextInt();
        System.out.println("Cuantos Kilos de ropa");
        int kilos = entrada.nextByte();
        LLFunciones1 f = new LLFunciones1(kilos, tipodeRopa);
        f.setTipoRopa(tipodeRopa);
        System.out.println("el tipo de ropa es: "+f.getTipoRopa());
        f.cicloFinalizado();
    }
    
}
