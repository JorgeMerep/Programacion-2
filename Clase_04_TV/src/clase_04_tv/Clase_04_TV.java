package clase_04_tv;

// Programar volumen y setear canal

public class Clase_04_TV {

    public static void main(String[] args) {
        
        try {
            Televisor tv1 = new Televisor("Sony", 55);
            
            tv1.mostrarInfo();
            tv1.power();
            tv1.subirVolumen();
            tv1.setearCanal(25);
            tv1.mostrarInfo();
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
         
        ControlRemoto cr = new ControlRemoto();
        
        Televisor tv2 = new Televisor("Samsung", 40);
        cr.setTv(tv2);
        
        
        
        

        //tv2.mostrarInfo();
        
        /* for (int i=0; i < 100; i++) {
          tv1.bajarCanal();
        }*/
               
    }
    
}
