package pkgAnalizadorLéxico;

import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Jan Carlo
 */
public class Metodos {
    
    
    Scanner scan = new Scanner(System.in);

    int contador;
    String primeraCondicional;
    String segundaCondicional;
    String[] partesSentenciaDescompuesta;
        
    ByteArrayOutputStream textoAnalisis = new ByteArrayOutputStream();
    PrintStream textoE = new PrintStream(textoAnalisis);
    PrintStream old = System.out;
        
    public void inicio(){
        
        contador = 0;
        primeraCondicional = "";
        segundaCondicional = "";
        validacion();
        
    }
    
    public void validacion(){
        
              
        for (int i = 1; i <= partesSentenciaDescompuesta.length; i++) {

            contador = contador + 1;
            
        }
        
        if (partesSentenciaDescompuesta[0].equals("si")) {
            if (contador == 10) {

                if (partesSentenciaDescompuesta[6].equals("{") && partesSentenciaDescompuesta[9].equals("}")) {

                    primeraCondicional = partesSentenciaDescompuesta[2] + " " + partesSentenciaDescompuesta[3]
                            + " " + partesSentenciaDescompuesta[4];
                    
                    System.setOut(textoE);
                    System.out.println("*****EVALUACION DE CADENA INGRESADA*****");
                    System.out.println("========================================");
                    System.out.println("La(s) palabra(s) reservada(s) es: " + partesSentenciaDescompuesta[0]);
                    System.out.println("Primera Condicional: " + primeraCondicional);
                    System.out.println("1er. parametro Condicional: " + partesSentenciaDescompuesta[2]);
                    System.out.println("Operador Condicional: " + partesSentenciaDescompuesta[3]);
                    System.out.println("2do. parametro Condicional: " + partesSentenciaDescompuesta[4]);
                    System.out.println("Accion a realizar si se cumple: " + partesSentenciaDescompuesta[7]);
                    System.out.flush();
                    System.setOut(old);
                    frmAnalizadorLexico.txtAreaTexto.setText(textoAnalisis.toString());
                    
                    

                } else {
                    System.out.println("Verifique las llaves de Apertura y Cierre");
                    JOptionPane.showMessageDialog(null, "Verifique las llaves de Apertura y Cierre", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                }

            } 
            else if (contador == 20) {
                if (partesSentenciaDescompuesta[6].equals("{") && partesSentenciaDescompuesta[9].equals("}")
                        && partesSentenciaDescompuesta[16].equals("{") && partesSentenciaDescompuesta[19].equals("}")) {
                    primeraCondicional = partesSentenciaDescompuesta[2] + " " + partesSentenciaDescompuesta[3]
                            + " " + partesSentenciaDescompuesta[4];
                    segundaCondicional = partesSentenciaDescompuesta[12] + " " + partesSentenciaDescompuesta[13]
                            + " " + partesSentenciaDescompuesta[14];
                    
                    System.setOut(textoE);
                    System.out.println("========================================");
                    System.out.println("*****EVALUACION DE CADENA INGRESADA*****");
                    System.out.println("La(s) palabra(s) reservada(s) es: " + partesSentenciaDescompuesta[0] + " ... "
                            + partesSentenciaDescompuesta[10]);
                    System.out.println("Primera Condicional: " + primeraCondicional);
                    System.out.println("1er. parametro Condicional: " + partesSentenciaDescompuesta[2]);
                    System.out.println("Operador Condicional: " + partesSentenciaDescompuesta[3]);
                    System.out.println("2do. parametro Condicional: " + partesSentenciaDescompuesta[4]);
                    System.out.println("Accion a realizar si se cumple: " + partesSentenciaDescompuesta[7]);
                    System.out.println("========================================");
                    System.out.println("Segunda Condicional: " + segundaCondicional);
                    System.out.println("1er. parametro Condicional: " + partesSentenciaDescompuesta[12]);
                    System.out.println("Operador Condicional: " + partesSentenciaDescompuesta[13]);
                    System.out.println("2do. parametro Condicional: " + partesSentenciaDescompuesta[14]);
                    System.out.println("Accion a realizar si se cumple: " + partesSentenciaDescompuesta[17]);
                    System.out.flush();
                    System.setOut(old);
                    frmAnalizadorLexico.txtAreaTexto.setText(textoAnalisis.toString());
                }
                else {
                    System.out.println("Verifique las llaves de apertura y cierre");
                    JOptionPane.showMessageDialog(null, "Verifique las llaves de Apertura y Cierre", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                }

            }
            else if (contador == 25){
                
                if (partesSentenciaDescompuesta[6].equals("{") && partesSentenciaDescompuesta[9].equals("}")
                   && partesSentenciaDescompuesta[16].equals("{") && partesSentenciaDescompuesta[19].equals("}")
                   && partesSentenciaDescompuesta[21].equals("{") && partesSentenciaDescompuesta[24].equals("}")){
                    
                    System.setOut(textoE);
                    System.out.println("========================================");
                    System.out.println("*****EVALUACION DE CADENA INGRESADA*****");
                    System.out.println("La(s) palabra(s) reservada(s) es: " + partesSentenciaDescompuesta[0] + " ... "
                            + partesSentenciaDescompuesta[10] + " ... " + partesSentenciaDescompuesta[20]);
                    System.out.println("Primera Condicional: " + primeraCondicional);
                    System.out.println("1er. parametro Condicional: " + partesSentenciaDescompuesta[2]);
                    System.out.println("Operador Condicional: " + partesSentenciaDescompuesta[3]);
                    System.out.println("2do. parametro Condicional: " + partesSentenciaDescompuesta[4]);
                    System.out.println("Accion a realizar si se cumple: " + partesSentenciaDescompuesta[7]);
                    System.out.println("========================================");
                    System.out.println("Segunda Condicional: " + segundaCondicional);
                    System.out.println("1er. parametro Condicional: " + partesSentenciaDescompuesta[12]);
                    System.out.println("Operador Condicional: " + partesSentenciaDescompuesta[13]);
                    System.out.println("2do. parametro Condicional: " + partesSentenciaDescompuesta[14]);
                    System.out.println("Accion a realizar si se cumple: " + partesSentenciaDescompuesta[17]);
                    System.out.println("========================================");  
                    System.out.println("Accion a realizar si no se cumple ninguna de las condicionales anteriroes: "
                            + partesSentenciaDescompuesta[22]);
                    System.out.flush();
                    System.setOut(old);
                    frmAnalizadorLexico.txtAreaTexto.setText(textoAnalisis.toString());
                }
                else {
                    System.out.println("Verifique las llaves de apertura y cierre");
                    JOptionPane.showMessageDialog(null, "Verifique las llaves de Apertura y Cierre", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                
                }   
                
            }
            else{
                System.out.println("Usted esta tratando de realizar la funcion " + partesSentenciaDescompuesta[0]
                + ", le recomendamos verificar el buen uso de la sintaxis");
                
                JOptionPane.showMessageDialog(null, "Usted esta tratando de realizar la funcion " + partesSentenciaDescompuesta[0]
                + ", le recomendamos verificar el buen uso de la sintaxis", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        else if (partesSentenciaDescompuesta[0].equals("Repeticion")){
            if (contador==17){
                if (partesSentenciaDescompuesta[1].equals("(") && partesSentenciaDescompuesta[3].equals("(")
                        && partesSentenciaDescompuesta[6].equals(")") && partesSentenciaDescompuesta[7].equals(";")
                        && partesSentenciaDescompuesta[11].equals(";") && partesSentenciaDescompuesta[13].equals(")")
                        && partesSentenciaDescompuesta[14].equals("{") &&partesSentenciaDescompuesta[16].equals("}")){
                    
                    System.setOut(textoE);
                    System.out.println("========================================");
                    System.out.println("*****EVALUACION DE CADENA INGRESADA*****");
                    System.out.println("La(s) palabra(s) reservada(s) es: " + partesSentenciaDescompuesta[0] + " .. "
                    + partesSentenciaDescompuesta[2]);
                    System.out.println("La declaracion de variable(s) es: " + partesSentenciaDescompuesta[2]
                    + partesSentenciaDescompuesta[3] + partesSentenciaDescompuesta[4] + " " +partesSentenciaDescompuesta[5] 
                    + partesSentenciaDescompuesta[6]);
                    System.out.println("La condicion para la repeticion es: " + partesSentenciaDescompuesta[8]
                    + partesSentenciaDescompuesta[9] + partesSentenciaDescompuesta[10]);
                    System.out.println("La secuencia de crecimiento del ciclo es de: " + partesSentenciaDescompuesta[12]);
                    System.out.println("Accion a realizar si se cumple la condicion: " + partesSentenciaDescompuesta[15]);
                    System.out.flush();
                    System.setOut(old);
                    frmAnalizadorLexico.txtAreaTexto.setText(textoAnalisis.toString());
                    
                }                               
                else{
                    System.out.println("Sintaxis incorrecta, verifique el buen uso de parentesis y llaves de apertura y cierre");
                    JOptionPane.showMessageDialog(null, "Sintaxis incorrecta, verifique el buen uso de parentesis y llaves de apertura y cierre", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else {
                System.out.println("Sintaxis incorrecta, verifique que cada parentesis y llave se cierren adecuadamente,"
                        + " respetando tambien los espacios necesarios para cada estructura de datos");
                JOptionPane.showMessageDialog(null, "Sintaxis incorrecta, verifique que cada parentesis y llave se cierren adecuadamente,"
                        + " respetando tambien los espacios necesarios para cada estructura de datos", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (partesSentenciaDescompuesta[0].equals("Mientras")){
            if (contador == 12){
                if (partesSentenciaDescompuesta[1].equals("(") && partesSentenciaDescompuesta[5].equals(")")
                        && partesSentenciaDescompuesta[6].equals("{") && partesSentenciaDescompuesta[8].equals(";")
                        && partesSentenciaDescompuesta[10].equals(";") && partesSentenciaDescompuesta[11].equals("}")){
                    
                    System.setOut(textoE);
                    System.out.println("========================================");
                    System.out.println("*****EVALUACION DE CADENA INGRESADA*****");
                    System.out.println("La(s) palabra(s) reservada(s) es: " + partesSentenciaDescompuesta[0]);
                    System.out.println("La condicion que se debe de cumplir: " + partesSentenciaDescompuesta[2]
                    + partesSentenciaDescompuesta[3] + partesSentenciaDescompuesta[4]);
                    System.out.println("Accion a realizar: " + partesSentenciaDescompuesta[7]);
                    System.out.println("El condicional que ira aumentando es: " + partesSentenciaDescompuesta[9]);
                    System.out.flush();
                    System.setOut(old);
                    frmAnalizadorLexico.txtAreaTexto.setText(textoAnalisis.toString());
                    
                }
                else{
                    System.out.println("Sintaxis incorrecta, verifique el buen uso de parentesis y llaves de apertura y cierre");
                    JOptionPane.showMessageDialog(null, "Sintaxis incorrecta, verifique el buen uso de parentesis y llaves de apertura y cierre", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else {
                System.out.println("Sintaxis incorrecta, verifique que cada parentesis y llave se cierren adecuadamente,"
                        + " respetando tambien los espacios necesarios para cada estructura de datos");
                JOptionPane.showMessageDialog(null, "Sintaxis incorrecta, verifique que cada parentesis y llave se cierren adecuadamente,"
                        + " respetando tambien los espacios necesarios para cada estructura de datos", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (partesSentenciaDescompuesta[0].equals("Hacer") && partesSentenciaDescompuesta[7].equals("Mientras")){
            if (contador==13){
                if (partesSentenciaDescompuesta[1].equals("{") && partesSentenciaDescompuesta[3].equals(";")
                        && partesSentenciaDescompuesta[5].equals(";") && partesSentenciaDescompuesta[6].equals("}")
                        && partesSentenciaDescompuesta[8].equals("(") && partesSentenciaDescompuesta[12].equals(")")){
                    
                    System.setOut(textoE);
                    System.out.println("========================================");
                    System.out.println("*****EVALUACION DE CADENA INGRESADA*****");
                    System.out.println("La(s) palabra(s) reservada(s) es: " + partesSentenciaDescompuesta[0] + " ... "
                    + partesSentenciaDescompuesta[7]);
                    System.out.println("Accion a realizar si se cumple la condicion: " + partesSentenciaDescompuesta[2]);
                    System.out.println("Variable que aumentara para la condicion: " + partesSentenciaDescompuesta[4]);
                    System.out.println("Condicion que debe cumplirse para la cadena: " + partesSentenciaDescompuesta[9]
                    + partesSentenciaDescompuesta[10] + partesSentenciaDescompuesta[11]);
                    System.out.flush();
                    System.setOut(old);
                    frmAnalizadorLexico.txtAreaTexto.setText(textoAnalisis.toString());
                }
                else{
                    System.out.println("Verifique las llaves de apertura y cierre");
                    JOptionPane.showMessageDialog(null, "Verifique las llaves de apertura y cierre", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                System.out.println("Usted esta tratando de realizar la funcion " + partesSentenciaDescompuesta[0]
                + ", le recomendamos verificar el buen uso de la sintaxis");
                JOptionPane.showMessageDialog(null, "Usted esta tratando de realizar la funcion " + partesSentenciaDescompuesta[0]
                + ", le recomendamos verificar el buen uso de la sintaxis", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (partesSentenciaDescompuesta[0].equals("Dec")){
            if (contador == 8) {
                if (partesSentenciaDescompuesta[1].equals("(") && partesSentenciaDescompuesta[3].equals("[") 
                        && partesSentenciaDescompuesta[5].equals("]") && partesSentenciaDescompuesta[6].equals(")")
                        && partesSentenciaDescompuesta[7].equals(";")){
                    
                    System.setOut(textoE);
                    System.out.println("========================================");
                    System.out.println("*****EVALUACION DE CADENA INGRESADA*****");
                    System.out.println("Palabra Reservada: " + partesSentenciaDescompuesta[0]);
                    System.out.println("Tipo de Variable que se asigna: " + partesSentenciaDescompuesta[2]);
                    System.out.println("Variables asignadas: " + partesSentenciaDescompuesta[4]);
                    System.out.flush();
                    System.setOut(old);
                    frmAnalizadorLexico.txtAreaTexto.setText(textoAnalisis.toString());
                    
                }
                else {
                    System.out.println("Verifique que se estan abriendo y cerrando con normalidad"
                            + " las llaves y parentesis abiertas durante la escritura de su codigo");
                    JOptionPane.showMessageDialog(null, "Verifique que se estan abriendo y cerrando con normalidad"
                            + " las llaves y parentesis abiertas durante la escritura de su codigo", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else {
                System.out.println("Usted esta intentando realizar la estrctura" + partesSentenciaDescompuesta[0]
                + ", le recomendamos verificar el uso correcto de la sintaxis");
                JOptionPane.showMessageDialog(null, "Usted esta intentando realizar la estrctura" + partesSentenciaDescompuesta[0]
                + ", le recomendamos verificar el uso correcto de la sintaxis", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
        else if (partesSentenciaDescompuesta[0].equals("Asign")){
            if (contador == 9){
                if (partesSentenciaDescompuesta[1].equals("(") && partesSentenciaDescompuesta[7].equals(")")
                        && partesSentenciaDescompuesta[8].equals(";")){
                    
                    System.setOut(textoE);
                    System.out.println("========================================");
                    System.out.println("*****EVALUACION DE CADENA INGRESADA*****");
                    System.out.println("Palabra Reservada: " + partesSentenciaDescompuesta[0]);
                    System.out.println("Variable donde se almacena: " + partesSentenciaDescompuesta[2]);
                    System.out.println("Primer termino: " + partesSentenciaDescompuesta[4]);
                    System.out.println("Operador Aritmetico: " + partesSentenciaDescompuesta[5]);
                    System.out.println("Segundo termino: " + partesSentenciaDescompuesta[6]);
                    System.out.flush();
                    System.setOut(old);
                    frmAnalizadorLexico.txtAreaTexto.setText(textoAnalisis.toString());
                    
                }
                else {
                    System.out.println("Verifique el correcto uso de los operadores de apertura y cierre");
                    JOptionPane.showMessageDialog(null, "Verifique el correcto uso de los operadores de apertura y cierre", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                
                  
                    
                }
                
            }
            
            else {
                System.out.println("Usted esta intentando realizar la estrctura" + partesSentenciaDescompuesta[0]
                + ", le recomendamos verificar el uso correcto de la sintaxis");
                JOptionPane.showMessageDialog(null, "Usted esta intentando realizar la estrctura" + partesSentenciaDescompuesta[0]
                + ", le recomendamos verificar el uso correcto de la sintaxis", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
        
        else {
            System.out.println("Verifique la correcta escritura de las palabras reservadas");
            JOptionPane.showMessageDialog(null, "Verifique la correcta escritura de las palabras reservadas", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        
    }
}
