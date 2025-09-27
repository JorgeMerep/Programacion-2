package integrador_clases_objetos;

public class INTEGRADOR_CLASES_OBJETOS {

    public static void main(String[] args) {
        
        Tarjeta tc1 = new Tarjeta(EntidadFinanciera.VISA, "Santander", 777, 300000, new Persona(33123456, "Roberto", "Carlos", "11987654", "robertoc@gmail.com"));
        Posnet pos1 = new Posnet();
        Ticket tk1 = pos1.efectuarPago(tc1, 350000, 5);
        System.out.println(tk1);
       
        
    }
    
}
