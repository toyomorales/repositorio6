
package libreria;


public class LLFunciones {
    private int kilos = 0, tipodeRopa = 0, llenadocompleto = 0, lavadocompleto = 0, secadocompleto = 0;
    
    public LLFunciones(int kilos, int tipodeRopa){
        this.kilos = kilos;
        this.tipodeRopa = tipodeRopa;
      }

    private void llenado(){
        if (kilos <=20){
            llenadocompleto = 1;//averiguar lo que es una bandera
            System.out.println("Llenando.....");
            System.out.println("Llenado completo");
        }else{
            System.out.println("La carga sobrepasa el peso, disminuya la misma");
        }
    }
    
    private void lavado(){
        llenado();
        
        if (llenadocompleto==1){
            
            if(tipodeRopa==1){
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando....");
                lavadocompleto = 1;
            }else if(tipodeRopa==2){
                
                System.out.println("Ropa de color / lavado intenso");
                System.out.println("Lavando...");
                lavadocompleto = 1;
            }else{
                System.out.println("No ha considerado el tipo de ropa");
                System.out.println("Se lavara como ropa de color / Lavado intenso");
                System.out.println("Lavando");
                lavadocompleto = 1;
            }
            
        }    
    }
    
    private void secado(){
        lavado();
        if (lavadocompleto==1){
            System.out.println("Secando...");
            secadocompleto = 1;
            
        }
    }
    public void cicloFinalizado(){
        secado();
        if (secadocompleto==1){
            System.out.println("La ropa esta lista");
        }
    }
}
