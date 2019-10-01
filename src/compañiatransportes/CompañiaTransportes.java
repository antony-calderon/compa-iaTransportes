
package compañiatransportes;

import javax.swing.JOptionPane;


public class CompañiaTransportes {
   

    Tiquete tiq1, tiq2, tiq3;
    public static void main(String[] args) {
        CompañiaTransportes com=new CompañiaTransportes();
        // TODO code application logic here
        com.crearTiquete();
    }
    public void crearTiquete(){
        tiq1.setNumeroViaje("01");
        tiq1.setHora("8:00 am");
        tiq1.setFecha("15/02/2019");
        tiq1.setNombrePasajero("Antony Calderon");
        tiq1.setCosto(25000);
        
        tiq2.setNumeroViaje("02");
        tiq2.setHora("7:00 am");
        tiq2.setFecha("15/03/2019");
        tiq2.setNombrePasajero("Alexander Torres");
        tiq2.setCosto(30000);
        
        tiq3.setNumeroViaje("03");
        tiq3.setHora("9:00 am");
        tiq3.setFecha("14/05/2019");
        tiq3.setNombrePasajero("Marcela Castro");
        tiq3.setCosto(20500);
        
        JOptionPane.showMessageDialog(null, "TIQUETE 1:\n"
                + "Numero de viaje: "+tiq1.getNumeroViaje()+"\n"+
                "Hora: "+tiq1.getHora()+"\n"+
                "Fecha: "+tiq1.getFecha()+"\n"+
                "Nombre pasajero: "+tiq1.getNombrePasajero()+"\n"+
                "Costo del tiquete: "+tiq1.getCosto());
        
        JOptionPane.showMessageDialog(null, "TIQUETE 2:\n"
                + "Numero de viaje: "+tiq2.getNumeroViaje()+"\n"+
                "Hora: "+tiq2.getHora()+"\n"+
                "Fecha: "+tiq2.getFecha()+"\n"+
                "Nombre pasajero: "+tiq2.getNombrePasajero()+"\n"+
                "Costo del tiquete: "+tiq2.getCosto());
        
        JOptionPane.showMessageDialog(null, "TIQUETE 3:\n"
                + "Numero de viaje: "+tiq3.getNumeroViaje()+"\n"+
                "Hora: "+tiq3.getHora()+"\n"+
                "Fecha: "+tiq3.getFecha()+"\n"+
                "Nombre pasajero: "+tiq3.getNombrePasajero()+"\n"+
                "Costo del tiquete: "+tiq3.getCosto());
        
        JOptionPane.showMessageDialog(null, "El valor total de los tiquetes es: "+(tiq1.getCosto()+tiq2.getCosto()+tiq3.getCosto()));
    }

    public CompañiaTransportes() {
        tiq1=new Tiquete();
        tiq2=new Tiquete();
        tiq3=new Tiquete();
    }
    
    
}
