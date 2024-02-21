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
 * @author duvan
 */
public abstract class Resolver {

    public static double[] fila1 = new double[4];
    public static double[] fila2 = new double[4];
    public static double[] fila3 = new double[4];

    public static double[] Fila1 = new double[5];
    public static double[] Fila2 = new double[5];
    public static double[] Fila3 = new double[5];
    public static double[] Fila4 = new double[5];

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

    public static NumberFormatException CrearMatriz3x3(JTextField e1, JTextField e2, JTextField e3, JTextField e5,
            JTextField e6, JTextField e7, JTextField e8, JTextField e10,
            JTextField e11, JTextField e12, JTextField e13, JTextField e15) {

        //se crea la primera fila de la matriz 
        String[] f = e1.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila1[0] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila1[0] = Double.parseDouble(e1.getText());
        }

        f = e2.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila1[1] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila1[1] = Double.parseDouble(e2.getText());
        }

        f = e3.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila1[2] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila1[2] = Double.parseDouble(e3.getText());
        }

        f = e5.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila1[3] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila1[3] = Double.parseDouble(e5.getText());
        }

        //se crea la segunda fila de la matriz 
        f = e6.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila2[0] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila2[0] = Double.parseDouble(e6.getText());
        }

        f = e7.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila2[1] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila2[1] = Double.parseDouble(e7.getText());
        }

        f = e8.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila2[2] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila2[2] = Double.parseDouble(e8.getText());
        }

        f = e10.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila2[3] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila2[3] = Double.parseDouble(e10.getText());
        }
        //se crea la tercera fila de la matriz 
        f = e11.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila3[0] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila3[0] = Double.parseDouble(e11.getText());
        }

        f = e12.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila3[1] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila3[1] = Double.parseDouble(e12.getText());
        }

        f = e13.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila3[2] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila3[2] = Double.parseDouble(e13.getText());
        }

        f = e15.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                fila3[3] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            fila3[3] = Double.parseDouble(e15.getText());
        }

        return null;
    }

    public static NumberFormatException CrearMatriz4x4(JTextField e1, JTextField e2, JTextField e3, JTextField e4, JTextField e5,
            JTextField e6, JTextField e7, JTextField e8, JTextField e9, JTextField e10,
            JTextField e11, JTextField e12, JTextField e13, JTextField e14, JTextField e15,
            JTextField e16, JTextField e17, JTextField e18, JTextField e19, JTextField e20) {
        //se crea la primera fila de la matriz 
        String[] f = e1.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila1[0] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila1[0] = Double.parseDouble(e1.getText());
        }

        f = e2.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila1[1] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila1[1] = Double.parseDouble(e2.getText());
        }

        f = e3.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila1[2] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila1[2] = Double.parseDouble(e3.getText());
        }

        f = e4.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila1[3] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila1[3] = Double.parseDouble(e4.getText());
        }

        f = e5.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila1[4] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila1[4] = Double.parseDouble(e5.getText());
        }

        //se crea la segunda fila de la matriz 
        f = e6.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila2[0] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila2[0] = Double.parseDouble(e6.getText());
        }

        f = e7.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila2[1] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila2[1] = Double.parseDouble(e7.getText());
        }

        f = e8.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila2[2] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila2[2] = Double.parseDouble(e8.getText());
        }

        f = e9.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila2[3] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila2[3] = Double.parseDouble(e9.getText());
        }

        f = e10.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila2[4] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila2[4] = Double.parseDouble(e10.getText());
        }
        //se crea la tercera fila de la matriz 
        f = e11.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila3[0] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila3[0] = Double.parseDouble(e11.getText());
        }

        f = e12.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila3[1] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila3[1] = Double.parseDouble(e12.getText());
        }

        f = e13.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila3[2] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila3[2] = Double.parseDouble(e13.getText());
        }

        f = e14.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila3[3] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila3[3] = Double.parseDouble(e14.getText());
        }

        f = e15.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila3[4] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila3[4] = Double.parseDouble(e15.getText());
        }
        //se crea la cuarta fila de la matriz 
        f = e16.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila4[0] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila4[0] = Double.parseDouble(e16.getText());
        }

        f = e17.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila4[1] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila4[1] = Double.parseDouble(e17.getText());
        }

        f = e18.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila4[2] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila4[2] = Double.parseDouble(e18.getText());
        }

        f = e19.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila4[3] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila4[3] = Double.parseDouble(e19.getText());
        }

        f = e20.getText().split("/", 2);

        if (f.length == 2) {
            try {
                Fraccion a = new Fraccion(Double.parseDouble(f[0]), Double.parseDouble(f[1]));
                Fila4[4] = a.toDouble();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "VERIFICAR NUMERO FRACCIONARIO", "ERROR EN CAMPOS DE TEXTO", JOptionPane.INFORMATION_MESSAGE);
                return e;
            }
        } else {
            Fila4[4] = Double.parseDouble(e20.getText());
        }

        return null;
    }

    public static String resolver3x3() {
        String resultado = "";
        if ((fila1[0] == 0 && fila2[0] == 0 && fila3[0] == 0) || (fila1[1] == 0 && fila2[1] == 0 && fila3[1] == 0) || (fila1[2] == 0 && fila2[2] == 0 && fila3[2] == 0)) {
            JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCONSISTENTE", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
            r = false;
        } else if ((fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) || (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) || (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0)) {
            JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCONSISTENTE", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
            r = false;
        } else {
            if (fila1[0] != 0) {
                double t = 0;
                t = fila1[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila1[i] = fila1[i] / t;
                }
                resultado += "\n 1.SE DIVIDE LA FILA1 POR EL COEFICIENTE1 QUE TIENE DICHA FILA\n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila2[i] = (fila1[i] * t) + fila2[i];
                }

                resultado += "\n 2. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    //*******************************************************************************
                    t = -fila3[0];
                    for (int i = 0; i < fila1.length; i++) {
                        fila3[i] = (fila1[i] * t) + fila3[i];
                        if(fila3[i]==fila2[i]){
                            incompatible=true;
                        }
                    }
                    resultado += imprimirMatriz3x3();
                    
                    
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = fila2[1];
                for (int i = 1; i < fila1.length; i++) {
                    fila2[i] = fila2[i] / t;
                }

                resultado += "\n 3. SE DIVIDE LA FILA2 POR EL COEFICIENTE2 QUE TIENE DICHA FILA\n " + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila3[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila3[i] = (fila1[i] * t) + fila3[i];
                }

                resultado += "\n 4. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila3[1];
                for (int i = 0; i < fila1.length; i++) {
                    fila3[i] = (fila2[i] * t) + fila3[i];
                }

                resultado += "\n 5. SE MULTIPLICA LA FILA2 POR EL COEFICIENTE2 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = fila3[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila3[i] = fila3[i] / t;
                }

                resultado += "\n 6. SE DIVIDE LA FILA3 POR EL COEFICIENTE3 QUE TIENE DICHA FILA\n " + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila2[i] = (fila3[i] * t) + fila2[i];
                }

                resultado += "\n 7. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila2[i] = (fila3[i] * t) + fila2[i];
                }

                resultado += "\n 8. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila1[2];
                for (int i = 1; i < fila1.length; i++) {
                    fila1[i] = (fila3[i] * t) + fila1[i];
                }

                resultado += "\n 9. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila1[1];
                for (int i = 1; i < fila1.length; i++) {
                    fila1[i] = (fila2[i] * t) + fila1[i];
                }

                resultado += "\n 10. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

            } else if (fila2[0] != 0) {
                double f = 0;
                for (int i = 0; i < fila2.length; i++) {
                    f = fila1[i];
                    fila1[i] = fila2[i];
                    fila2[i] = f;
                }

                double t = 0;

                t = fila1[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila1[i] = fila1[i] / t;
                }
                resultado += "\n 1.SE DIVIDE LA FILA1 POR EL COEFICIENTE1 QUE TIENE DICHA FILA\n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila2[i] = (fila1[i] * t) + fila2[i];
                }

                resultado += "\n 2. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = fila2[1];
                for (int i = 1; i < fila1.length; i++) {
                    fila2[i] = fila2[i] / t;
                }

                resultado += "\n 3. SE DIVIDE LA FILA2 POR EL COEFICIENTE2 QUE TIENE DICHA FILA\n " + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila3[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila3[i] = (fila1[i] * t) + fila3[i];
                }

                resultado += "\n 4. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila3[1];
                for (int i = 0; i < fila1.length; i++) {
                    fila3[i] = (fila2[i] * t) + fila3[i];
                }

                resultado += "\n 5. SE MULTIPLICA LA FILA2 POR EL COEFICIENTE2 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = fila3[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila3[i] = fila3[i] / t;
                }

                resultado += "\n 6. SE DIVIDE LA FILA3 POR EL COEFICIENTE3 QUE TIENE DICHA FILA\n " + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila2[i] = (fila3[i] * t) + fila2[i];
                }

                resultado += "\n 7. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila2[i] = (fila3[i] * t) + fila2[i];
                }

                resultado += "\n 8. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila1[2];
                for (int i = 1; i < fila1.length; i++) {
                    fila1[i] = (fila3[i] * t) + fila1[i];
                }

                resultado += "\n 9. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila1[1];
                for (int i = 1; i < fila1.length; i++) {
                    fila1[i] = (fila2[i] * t) + fila1[i];
                }

                resultado += "\n 10. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

            } else if (fila3[0] != 0) {
                double f = 0;
                for (int i = 0; i < fila2.length; i++) {
                    f = fila1[i];
                    fila1[i] = fila3[i];
                    fila3[i] = f;
                }
                double t = 0;
                t = fila1[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila1[i] = fila1[i] / t;
                }
                resultado += "\n 1.SE DIVIDE LA FILA1 POR EL COEFICIENTE1 QUE TIENE DICHA FILA\n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila2[i] = (fila1[i] * t) + fila2[i];
                }

                resultado += "\n 2. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = fila2[1];
                for (int i = 1; i < fila1.length; i++) {
                    fila2[i] = fila2[i] / t;
                }

                resultado += "\n 3. SE DIVIDE LA FILA2 POR EL COEFICIENTE2 QUE TIENE DICHA FILA\n " + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila3[0];
                for (int i = 0; i < fila1.length; i++) {
                    fila3[i] = (fila1[i] * t) + fila3[i];
                }

                resultado += "\n 4. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila3[1];
                for (int i = 0; i < fila1.length; i++) {
                    fila3[i] = (fila2[i] * t) + fila3[i];
                }

                resultado += "\n 5. SE MULTIPLICA LA FILA2 POR EL COEFICIENTE2 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = fila3[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila3[i] = fila3[i] / t;
                }

                resultado += "\n 6. SE DIVIDE LA FILA3 POR EL COEFICIENTE3 QUE TIENE DICHA FILA\n " + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila3[3] == 0 && fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila3[0] == 0 && fila3[1] == 0 && fila3[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila2[i] = (fila3[i] * t) + fila2[i];
                }

                resultado += "\n 7. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila2[2];
                for (int i = 2; i < fila1.length; i++) {
                    fila2[i] = (fila3[i] * t) + fila2[i];
                }

                resultado += "\n 8. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila2[3] == 0 && fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila2[0] == 0 && fila2[1] == 0 && fila2[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila1[2];
                for (int i = 1; i < fila1.length; i++) {
                    fila1[i] = (fila3[i] * t) + fila1[i];
                }

                resultado += "\n 9. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

                t = -fila1[1];
                for (int i = 1; i < fila1.length; i++) {
                    fila1[i] = (fila2[i] * t) + fila1[i];
                }

                resultado += "\n 10. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz3x3();
                resultado += "\n ***********************************************************************************************************\n";

                if (fila1[3] == 0 && fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;

                } else if (fila1[0] == 0 && fila1[1] == 0 && fila1[2] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return resultado;
                }

            }
        }

        return resultado;
    }

    public static String resolver4x4() {
        String result = "";
        if ((Fila1[0] == 0 && Fila2[0] == 0 && Fila3[0] == 0 && Fila4[0] == 0) || (Fila1[1] == 0 && Fila2[1] == 0 && Fila3[1] == 0 && Fila4[1] == 0)
                || (Fila1[2] == 0 && Fila2[2] == 0 && Fila3[2] == 0 && Fila4[2] == 0) || (Fila1[3] == 0 && Fila2[3] == 0 && Fila3[3] == 0 && Fila4[3] == 0)) {
            JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCONSISTENTE", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
            r = false;
        } else if ((Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[3] == 0) || (Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[3] == 0) || (Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[3] == 0) || (Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[3] == 0)) {
            JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCONSISTENTE", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
            r = false;
        } else {

            if (Fila1[0] != 0) {
                double t = 0;
                t = Fila1[0];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila1[i] = Fila1[i] / t;
                }

                result += "\n 1.SE DIVIDE LA FILA1 POR EL COEFICIENTE1 QUE TIENE DICHA FILA\n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila1[3] == 0 && Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila2[0];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila2[i] = (Fila1[i] * t) + Fila2[i];
                }

                result += "\n 2. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila2[3] == 0 && Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila3[0];
                for (int i = 0; i < Fila3.length; i++) {
                    Fila3[i] = (Fila1[i] * t) + Fila3[i];
                }
                result += "\n 3. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";
                if (Fila3[3] == 0 && Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila4[0];
                for (int i = 0; i < Fila4.length; i++) {
                    Fila4[i] = (Fila1[i] * t) + Fila4[i];
                }
                result += "\n 4. SE MULTIPLICA LA FILA1 POR EL COEFICIENTE1 DE LA FILA4 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA4, ALMACENANDO EL RESULTADO EN LA FILA4 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila4[3] == 0 && Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = Fila2[1];
                for (int i = 0; i < Fila2.length; i++) {
                    Fila2[i] = Fila2[i] / t;
                }
                result += "\n 5.SE DIVIDE LA FILA2 POR EL COEFICIENTE2 QUE TIENE DICHA FILA\n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila2[3] == 0 && Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila3[1];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila3[i] = (Fila2[i] * t) + Fila3[i];
                }

                result += "\n 6. SE MULTIPLICA LA FILA2 POR EL COEFICIENTE2 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila3[3] == 0 && Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila4[1];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila4[i] = (Fila2[i] * t) + Fila4[i];
                }

                result += "\n 7. SE MULTIPLICA LA FILA2 POR EL COEFICIENTE2 DE LA FILA4 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA4, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila4[3] == 0 && Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = Fila3[2];
                for (int i = 0; i < Fila2.length; i++) {
                    Fila3[i] = Fila3[i] / t;
                }
                result += "\n 8.SE DIVIDE LA FILA3 POR EL COEFICIENTE3 QUE TIENE DICHA FILA\n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila3[3] == 0 && Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila4[2];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila4[i] = (Fila3[i] * t) + Fila4[i];
                }

                result += "\n 9. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA4 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA4, ALMACENANDO EL RESULTADO EN LA FILA4 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila4[3] == 0 && Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila2[2];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila2[i] = (Fila3[i] * t) + Fila2[i];
                }

                result += "\n 10. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA3, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila2[3] == 0 && Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = Fila4[3];
                for (int i = 0; i < Fila2.length; i++) {
                    Fila4[i] = Fila4[i] / t;
                }
                result += "\n 11.SE DIVIDE LA FILA4 POR EL COEFICIENTE4 QUE TIENE DICHA FILA\n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila4[3] == 0 && Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;

                    return result;

                } else if (Fila4[0] == 0 && Fila4[1] == 0 && Fila4[2] == 0 && Fila4[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila3[3];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila3[i] = (Fila4[i] * t) + Fila3[i];
                }

                result += "\n 12. SE MULTIPLICA LA FILA4 POR EL COEFICIENTE4 DE LA FILA3 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA4, ALMACENANDO EL RESULTADO EN LA FILA3 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila3[3] == 0 && Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila3[0] == 0 && Fila3[1] == 0 && Fila3[2] == 0 && Fila3[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila2[3];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila2[i] = (Fila4[i] * t) + Fila2[i];
                }

                result += "\n 13. SE MULTIPLICA LA FILA4 POR EL COEFICIENTE4 DE LA FILA2 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA2, ALMACENANDO EL RESULTADO EN LA FILA2 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila2[3] == 0 && Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila2[0] == 0 && Fila2[1] == 0 && Fila2[2] == 0 && Fila2[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }
                t = -Fila1[3];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila1[i] = (Fila4[i] * t) + Fila1[i];
                }

                result += "\n 14. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE4 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila1[3] == 0 && Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila1[2];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila1[i] = (Fila3[i] * t) + Fila1[i];
                }

                result += "\n 15. SE MULTIPLICA LA FILA3 POR EL COEFICIENTE3 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila1[3] == 0 && Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }

                t = -Fila1[1];
                for (int i = 0; i < Fila1.length; i++) {
                    Fila1[i] = (Fila2[i] * t) + Fila1[i];
                }

                result += "\n 16. SE MULTIPLICA LA FILA2 POR EL COEFICIENTE2 DE LA FILA1 CON EL SIGNO CONTRARIO "
                        + "Y SE SUMA CON LA FILA1, ALMACENANDO EL RESULTADO EN LA FILA1 \n" + imprimirMatriz4x4();
                result += "\n ***********************************************************************************************************\n";

                if (Fila1[3] == 0 && Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[4] == 0) {

                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION COMPATIBLE INDETERMINADA", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;

                } else if (Fila1[0] == 0 && Fila1[1] == 0 && Fila1[2] == 0 && Fila1[3] == 0) {
                    JOptionPane.showMessageDialog(null, "SISTEMA DE ECUACION INCOMPATIBLE ", "ERROR AL INGRESAR DATOS", JOptionPane.ERROR_MESSAGE);
                    r = false;
                    return result;
                }
            }
        }

        return result;

    }

    public static String imprimirMatriz3x3() {
        String salida = "";
        for (int i = 0; i < fila1.length; i++) {

            salida += " [" + fila1[i] + "] ";
        }
        salida += "\n";
        for (int i = 0; i < fila2.length; i++) {
            salida += " [" + fila2[i] + "] ";
        }
        salida += "\n";
        for (int i = 0; i < fila3.length; i++) {
            salida += " [" + fila3[i] + "] ";
        }
        return salida;
    }

    public static String imprimirMatriz4x4() {
        String salida = "";
        for (int i = 0; i < Fila1.length; i++) {

            salida += " [" + Fila1[i] + "] ";
        }
        salida += "\n";
        for (int i = 0; i < Fila2.length; i++) {
            salida += " [" + Fila2[i] + "] ";
        }
        salida += "\n";
        for (int i = 0; i < Fila3.length; i++) {
            salida += " [" + Fila3[i] + "] ";
        }

        salida += "\n";
        for (int i = 0; i < Fila4.length; i++) {
            salida += " [" + Fila4[i] + "] ";
        }
        return salida;
    }

    

}
