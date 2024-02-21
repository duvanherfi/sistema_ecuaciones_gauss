/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaecuacionesgauss;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public abstract class Inversa {
    public static double[] fila1 = new double[4];
    public static double[] fila2 = new double[4];
    public static double[] fila3 = new double[4];
    public static double[] fila4 = new double[4];

    public static double[] Fila1 = new double[5];
    public static double[] Fila2 = new double[5];
    public static double[] Fila3 = new double[5];
    public static double[] Fila4 = new double[5];
    
   public static double determinante=0;
   
   public static double x1=0;
   public static double x2=0;
   public static double x3=0;
   public static double x4=0;
   
   public static double x5=0;
   public static double x6=0;
   public static double x7=0;
   public static double x8=0;
   
   public static double x9=0;
   public static double x10=0;
   public static double x11=0;
   public static double x12=0;
   
   public static double x13=0;
   public static double x14=0;
   public static double x15=0;
   public static double x16=0;

    public static boolean r = true;
    public static boolean incompatible = false;

    public static double[] get_fila1() {
        return fila1;
    }

    public static double[] get_fila2() {
        return fila2;
    }

    public static double[] get_fila3() {
        return fila3;
    }

    public static double[] getFila1() {
        return Fila1;
    }

    public static double[] getFila2() {
        return Fila2;
    }

    public static double[] getFila3() {
        return Fila3;
    }

    public static double[] getFila4() {
        return Fila4;
    }
    public static void cargarMatriz(JTextField e1,JTextField e2,JTextField e3,JTextField e4,JTextField e5,JTextField e6,
    JTextField e7,JTextField e8,JTextField e9){
    
    fila1[0]= Double.parseDouble(e1.getText());
    fila1[1]= Double.parseDouble(e2.getText());
    fila1[2]= Double.parseDouble(e3.getText());
    fila2[0]= Double.parseDouble(e4.getText());
    fila2[1]= Double.parseDouble(e5.getText());
    fila2[2]= Double.parseDouble(e6.getText());
    fila3[0]= Double.parseDouble(e7.getText());
    fila3[1]= Double.parseDouble(e8.getText());
    fila3[2]= Double.parseDouble(e9.getText());
     
    
    
    }
    public static String  encontrarDeterminante(){
    // Hallamos el determinante
    double coeficiente1= fila1[0];
    double coeficiente2= fila2[0];
    double coeficiente3= fila3[0];
    
    double resultado1=0;
    double resultado2=0;
    double resultado3=0;
    
  
    
    String resultado="";
    
  resultado1= coeficiente1 * ((fila2[1]*fila3[2])-(fila3[1]*fila2[2]));
  resultado2= coeficiente2 * ((fila1[1]*fila3[2])-(fila3[1]*fila1[2]));
  resultado3= coeficiente3 * ((fila1[1]*fila2[2])-(fila2[1]*fila1[2]));
  
  determinante= (resultado1 - resultado2 + resultado3);
   
   resultado=Double.toString(determinante);
   
   if(determinante==0.0){
   JOptionPane.showMessageDialog(null, "El determinante es 0, por lo tanto La matriz No tiene inversa");
   
   return "0";
   }else{
   return resultado;
   }
    }
   
   public static void matrizAdjunta(JTextField e1,JTextField e2,JTextField e3,JTextField e4,JTextField e5,JTextField e6,
    JTextField e7,JTextField e8,JTextField e9){
 
   
   
   // Hallamos los coeficientes respectivos de la matriz adjunta 
   x1= (fila2[1]*fila3[2])-(fila3[1]*fila2[2]);
   x2= -1*((fila2[0]*fila3[2])-(fila3[0]*fila2[2]));
   x3= (fila2[0]*fila3[1])-(fila3[0]*fila2[1]);
   
    
   x4= -1*((fila1[1]*fila3[2])-(fila3[1]*fila1[2]));
   x5= (fila1[0]*fila3[2])-(fila3[0]*fila1[2]);
   x6= -1*((fila1[0]*fila3[1])-(fila3[0]*fila1[1]));
   
   
   x7= (fila1[1]*fila2[2])-(fila2[1]*fila1[2]);
   x8= -1*((fila1[0]*fila2[2])-(fila2[0]*fila1[2]));
   x9= (fila1[0]*fila2[1])-(fila2[0]*fila1[1]);
   
   // Creamos la nueva matriz adjunta
   e1.setText(Double.toString(x1));
   e2.setText(Double.toString(x2));
   e3.setText(Double.toString(x3));
   
   e4.setText(Double.toString(x4));
   e5.setText(Double.toString(x5));
   e6.setText(Double.toString(x6));
   
   e7.setText(Double.toString(x7));
   e8.setText(Double.toString(x8));
   e9.setText(Double.toString(x9));

   }
   
   public static void matrizInversa3x3(JTextField e1,JTextField e2,JTextField e3,JTextField e4,JTextField e5,JTextField e6,
    JTextField e7,JTextField e8,JTextField e9){
   
   
  // Multiplicamos el determinante por las filas correspondientes
 
    
   e1.setText(x1 + "/" + determinante);
   e2.setText(x2 + "/" + determinante);
   e3.setText(x3 + "/" + determinante);
   
   e4.setText(x4 + "/" + determinante);
   e5.setText(x5 + "/" + determinante);
   e6.setText(x6 + "/" + determinante);
   
   e7.setText(x7 + "/" + determinante);
   e8.setText(x8 + "/" + determinante);
   e9.setText(x9 + "/" + determinante);
  
   }
   
   public static void mostrarDecimales(JTextField e1,JTextField e2,JTextField e3,JTextField e4,JTextField e5,JTextField e6,
    JTextField e7,JTextField e8,JTextField e9){
   double c1=0;
    double c2=0;
    double c3=0;
    
    double c4=0;
    double c5=0;
    double c6=0;
    
    double c7=0;
    double c8=0;
    double c9=0;
    
  // Multiplicamos el determinante por las filas correspondientes
    c1=(1/determinante)*(x1);
    c2=(1/determinante)*(x2);
    c3=(1/determinante)*(x3);
   
    c4=(1/determinante)*(x4);
    c5=(1/determinante)*(x5);
    c6=(1/determinante)*(x6);
    
    c7 =(1/determinante)*(x7);
    c8=(1/determinante)*(x8);
    c9=(1/determinante)*(x9);
    
   e1.setText(Double.toString(c1));
   e2.setText(Double.toString(c2));
   e3.setText(Double.toString(c3));
   
   e4.setText(Double.toString(c4));
   e5.setText(Double.toString(c5));
   e6.setText(Double.toString(c6));
   
   e7.setText(Double.toString(c7));
   e8.setText(Double.toString(c8));
   e9.setText(Double.toString(c9));
   
   
   
   }
   
   // Metodos para 4x4
   
   
   public static void cargarMatriz4x4(JTextField e1,JTextField e2,JTextField e3,JTextField e4,JTextField e5,JTextField e6,
    JTextField e7,JTextField e8,JTextField e9,JTextField e10,JTextField e11,JTextField e12,JTextField e13,JTextField e14,
   JTextField e15,JTextField e16
   ){
   
    fila1[0]= Double.parseDouble(e1.getText());
    fila1[1]= Double.parseDouble(e2.getText());
    fila1[2]= Double.parseDouble(e3.getText());
    fila1[3]= Double.parseDouble(e4.getText());
    
    fila2[0]= Double.parseDouble(e5.getText());
    fila2[1]= Double.parseDouble(e6.getText());
    fila2[2]= Double.parseDouble(e7.getText());
    fila2[3]= Double.parseDouble(e8.getText());

    
    fila3[0]= Double.parseDouble(e9.getText());
    fila3[1]= Double.parseDouble(e10.getText());
    fila3[2]= Double.parseDouble(e11.getText());
    fila3[3]= Double.parseDouble(e12.getText());

    
    fila4[0]= Double.parseDouble(e13.getText());
    fila4[1]= Double.parseDouble(e14.getText());
    fila4[2]= Double.parseDouble(e15.getText()); 
    fila4[3]= Double.parseDouble(e16.getText()); 
       
    
       
       
   
   }
   
   public static String Determinante4x4(){
    // Hallamos el determinante
    double coeficiente1= fila1[0];
    double coeficiente2= fila2[0];
    double coeficiente3= fila3[0];
    double coeficiente4= fila4[0];
    
    double resultado1=0;
    double resultado2=0;
    double resultado3=0;
    double resultado4=0;
    
    
  
    
 String resultado="";
 
 resultado1= coeficiente1  * Inversa.sarrusMetodo(fila2[1], fila2[2], fila2[3], fila3[1], fila3[2], fila3[3], fila4[1], fila4[2], fila4[3]);
 resultado2= coeficiente2  * Inversa.sarrusMetodo(fila1[1], fila1[2], fila1[3], fila3[1], fila3[2], fila3[3], fila4[1], fila4[2], fila4[3]);
 resultado3= coeficiente3  * Inversa.sarrusMetodo(fila1[1], fila1[2], fila1[3], fila2[1], fila2[2], fila2[3], fila4[1], fila4[2], fila4[3]);
 resultado4= coeficiente4  * Inversa.sarrusMetodo(fila1[1], fila1[2], fila1[3], fila2[1], fila2[2], fila2[3], fila3[1], fila3[2], fila3[3]);
    
  
  determinante= ((resultado1) - (resultado2) + (resultado3) - (resultado4));
   
   resultado=Double.toString(determinante);
   
   if(determinante==0.0){
   JOptionPane.showMessageDialog(null, "El determinante es 0, por lo tanto La matriz No tiene inversa");
   
   return "0";
   }else{
   return resultado;
   }
    }
   public static void matrizAdjunta4x4(JTextField e1,JTextField e2,JTextField e3,JTextField e4,JTextField e5,JTextField e6,
    JTextField e7,JTextField e8,JTextField e9,JTextField e10,JTextField e11,JTextField e12,JTextField e13,JTextField e14,
   JTextField e15,JTextField e16){
       
     // Encontramos la primera fila de la matriz adjunta
     x1= Inversa.sarrusMetodo(fila2[1], fila2[2], fila2[3], fila3[1], fila3[2], fila3[3], fila4[1], fila4[2], fila4[3]);
     x2= (-1)*(Inversa.sarrusMetodo(fila2[0], fila2[2], fila2[3], fila3[0], fila3[2], fila3[3], fila4[0], fila4[2], fila4[3]));
     x3= Inversa.sarrusMetodo(fila2[0], fila2[1], fila2[3], fila3[0], fila3[1], fila3[3], fila4[0], fila4[1], fila4[3]);
     x4= (-1)*(Inversa.sarrusMetodo(fila2[0], fila2[1], fila2[2], fila3[0], fila3[1], fila3[2], fila4[0], fila4[1], fila4[2]));
     
     // Encontramos la segunda fila de la matriz adjunta
     x5= (-1)*(Inversa.sarrusMetodo(fila1[1], fila1[2], fila1[3], fila3[1], fila3[2], fila3[3], fila4[1], fila4[2], fila4[3]));
     x6= Inversa.sarrusMetodo(fila1[0], fila1[2], fila1[3], fila3[0], fila3[2], fila3[3], fila4[0], fila4[2], fila4[3]);
     x7= (-1)*(Inversa.sarrusMetodo(fila1[0], fila1[1], fila1[3], fila3[0], fila3[1], fila3[3], fila4[0], fila4[1], fila4[3]));
     x8= (Inversa.sarrusMetodo(fila1[0], fila1[1], fila1[2], fila3[0], fila3[1], fila3[2], fila4[0], fila4[1], fila4[2]));
     
     // Encontramos la tercera fila de la matriz adjunta
     x9= Inversa.sarrusMetodo(fila1[1], fila1[2], fila1[3], fila2[1], fila2[2], fila2[3], fila4[1], fila4[2], fila4[3]);
     x10= (-1)*(Inversa.sarrusMetodo(fila1[0], fila1[2], fila1[3], fila2[0], fila2[2], fila2[3], fila4[0], fila4[2], fila4[3]));
     x11= Inversa.sarrusMetodo(fila1[0], fila1[1], fila1[3], fila2[0], fila2[1], fila2[3], fila4[0], fila4[1], fila4[3]);
     x12= (-1)*(Inversa.sarrusMetodo(fila1[0], fila1[1], fila1[2], fila2[0], fila2[1], fila2[2], fila4[0], fila4[1], fila4[2]));
   
     // Encontramos la cuarta fila de la matriz adjunta
     x13= (-1)*(Inversa.sarrusMetodo(fila1[1], fila1[2], fila1[3], fila2[1], fila2[2], fila2[3], fila3[1], fila3[2], fila3[3]));
     x14= Inversa.sarrusMetodo(fila1[0], fila1[2], fila1[3], fila2[0], fila2[2], fila2[3], fila3[0], fila3[2], fila3[3]);
     x15= (-1)*(Inversa.sarrusMetodo(fila1[0], fila1[1], fila1[3], fila2[0], fila2[1], fila2[3], fila3[0], fila3[1], fila3[3]));
     x16= Inversa.sarrusMetodo(fila1[0], fila1[1], fila1[2], fila2[0], fila2[1], fila2[2], fila3[0], fila3[1], fila3[2]);
   
     
     // Creamos la nueva matriz adjunta
   e1.setText(Double.toString(x1));
   e2.setText(Double.toString(x2));
   e3.setText(Double.toString(x3));
   e4.setText(Double.toString(x4));
   
   e5.setText(Double.toString(x5));
   e6.setText(Double.toString(x6));
   e7.setText(Double.toString(x7));
   e8.setText(Double.toString(x8));
   
   e9.setText(Double.toString(x9));
   e10.setText(Double.toString(x10));
   e11.setText(Double.toString(x11));
   e12.setText(Double.toString(x12));
   
   e13.setText(Double.toString(x13));
   e14.setText(Double.toString(x14));
   e15.setText(Double.toString(x15));
   e16.setText(Double.toString(x16));
   
   
    
   }
   
   public static void matrizInversa4x4(JTextField e1,JTextField e2,JTextField e3,JTextField e4,JTextField e5,JTextField e6,
    JTextField e7,JTextField e8,JTextField e9,JTextField e10,JTextField e11,JTextField e12,JTextField e13,JTextField e14,
   JTextField e15,JTextField e16){
   // Multiplicamos el determinante por las filas correspondientes
 
    
   e1.setText(x1 + "/" + determinante);
   e2.setText(x2 + "/" + determinante);
   e3.setText(x3 + "/" + determinante); 
   e4.setText(x4 + "/" + determinante);
   
   e5.setText(x5 + "/" + determinante);
   e6.setText(x6 + "/" + determinante);
   e7.setText(x7 + "/" + determinante);
   e8.setText(x8 + "/" + determinante);
   
   e9.setText(x9 + "/" + determinante);
   e10.setText(x10 + "/" + determinante);
   e11.setText(x11 + "/" + determinante);
   e12.setText(x12 + "/" + determinante);
   
   e13.setText(x13 + "/" + determinante);
   e14.setText(x14 + "/" + determinante);
   e15.setText(x15 + "/" + determinante);
   e16.setText(x16 + "/" + determinante);
   
   
   }
   
   
   
  
   public static double sarrusMetodo(double e1,double e2,double e3,double e4,double e5,double e6,double e7,double e8,double e9){
   
   double t=0;
   
   t=(((e1*e5*e9)+(e4*e8*e3)+(e7*e2*e6))-((e3*e5*e7)+(e6*e8*e1)+(e9*e2*e4)));
   
      return t;
   
   
   }
    
    
}
