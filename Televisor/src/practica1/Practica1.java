package practica1;

public class Practica1 {

    public static void main(String[] args) {

        Televisor tv = new Televisor("Sony", 55);

        tv.power();
        
        //tv.irCanalEspecifico(-25);
        //tv.irCanalEspecifico(150);
        tv.irCanalEspecifico(45);
        
        tv.mostrarInfo();
        

    }

}
