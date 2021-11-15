package Actividad11;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
     
     
        int choice;
        boolean isOn = true;
        String[] buttons = {"triangulo", "Circulo", "Cuadrado", "Salir"};
        
        while(isOn){
            
            Circal Circal = new Circal();
            trical trical = new trical();
            squ squ = new squ();
            
            choice = JOptionPane.showOptionDialog(
            null,
            "Seleccione una opción a calcular: ",
            "Calculadora",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE, null,
            buttons,
            buttons[0]
            );
            
            System.out.println(choice);
            
            switch(choice){
                case -1:
                    // Exit on Widow
                    isOn = false;
                    break;
                case 0:
                    // Triangle
                    try{
                        
                        String Height = JOptionPane.showInputDialog(null,
                        "Ingrese el valor de la altura: ");
                        double convertHeight = Double.parseDouble(Height);
                        
                        String Base = JOptionPane.showInputDialog(null,
                        "Ingrese el valor de la base: ");
                        double convertBase = Double.parseDouble(Base);
                        
                        JOptionPane.showMessageDialog(null,
                        "Perímetro: " + trical.getPerimeter(convertBase, convertHeight) + "\n" +
                        "Área: " + trical.getArea(convertBase, convertHeight));
                    } catch(Exception e){
                        
                        JOptionPane.showMessageDialog(null, "Opción no reconocida. \n"
                        + "Regresando al menú.");
                    }
                    break;
                case 1:
                    // Circle
                    try{
                        
                        String radius = JOptionPane.showInputDialog(null,
                        "Ingrese el valor del radio: ");
                        double radConvert = Double.parseDouble(radius);
                                            
                        JOptionPane.showMessageDialog(null,
                        "Perímetro: " + Circal.getPerimeter(radConvert) + "\n" +
                        "Área: " + Circal.getArea(radConvert));
                    } catch(Exception e){
                        
                        JOptionPane.showMessageDialog(null, "Opción no reconocida. \n"
                        + "Regresando al menú.");
                    }
                    break;
                case 2:
                    // Square
                    try{
                        
                        String Side = JOptionPane.showInputDialog(null,
                        "Ingrese el valor del lado: ");
                        double sideConvert = Double.parseDouble(Side);
                        
                        JOptionPane.showMessageDialog(null,
                        "Perímetro: " + squ.getPerimeter(sideConvert) + "\n" +
                        "Área: " + squ.getArea(sideConvert));
                    } catch(Exception e){
                        
                        
                    }
                    break;
                case 3:
                    // Exit
                    isOn = false;
                    break;
            }
            
            
        }




    }
}
