//  AUTORES: BRAULIO ALONSO MONTALVO RONZÓN        ING. EN SISTEMAS COMPUTACIONALES    8° SEMESTRE
//           MARIA ESTEL BÁEZ GONZÁLEZ
//           HEBER FABIAN GARCÍA TAPIA
//  MATERIA: ARQUITECTURA DE SOFTWARE PARA LA WEB           "PROYECTO UI"


package proyectou1;

import INTERFAZ.*;
import javax.swing.JOptionPane;

//EJECUTABLE DEL PROYECTO
public class Main {

    public static void main(String[] args) {
        
        int o=0;
        //VENTANA EN DONDE SE LE PREGUNTA AL USUARIO SOBRE QUÉ DIRECTORIO QUIERE CONSULTAR
        do{
            //EL USUARIO DIGITA EL CONSULTORIO DESEADO
            o = Integer.parseInt(JOptionPane.showInputDialog("======= DIRECTORIO DE CONTACTOS ======\n\nPOR FAVOR, ELIJA UN DIRECTORIO A OPERAR:\n"
                                                             + "US -------- [ 1 ]\nFRANCIA -------- [ 2 ]\nMEXICO -------- [ 3 ]"));

            switch(o){
                case 1:US obj = new US();               //DIRECTORIO DE US
                       obj.setVisible(true);
                       obj.setResizable(true);
                       obj.setLocationRelativeTo(null);
                       break;
                case 2:FRANCIA obj2 = new FRANCIA();    //DIRECTORIO DE FRANCIA
                       obj2.setVisible(true);
                       obj2.setResizable(true);
                       obj2.setLocationRelativeTo(null);
                       break;
                case 3:MEXICO obj3 = new MEXICO();      //DIRECTORIO DE MÉXICO
                       obj3.setVisible(true);
                       obj3.setResizable(true);
                       obj3.setLocationRelativeTo(null);
                       break;
               default: JOptionPane.showMessageDialog(null, "ERROR\n\nElija la opción correcta.");  //EN CASO DE QUE EL USUARIO DIGITE UNA OPCIÓN ERRONEA
            }           
        }while(o!=1 && o!=2 && o!=3);   //CONDICIONAL DE LA SELECCIÓN DE DIRECTORIO
    }    
}
