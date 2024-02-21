/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaecuacionesgauss;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author duvan
 */
public class Hilo1 extends Thread {
    JTextField a;
    JLabel var1;
    JLabel var2;
    JLabel var3;
    JLabel var4;
    
    JTextField b;
    JLabel var5;
    JLabel var6;
    JLabel var7;
    JLabel var8;
    
    JTextField c;
    JLabel var9;
    JLabel var10;
    JLabel var11;
    JLabel var12;
    
    JTextField d;
    JLabel var13;
    JLabel var14;
    JLabel var15;
    JLabel var16;
    
    public Hilo1(JTextField a,JTextField b,JTextField c,JTextField d, JLabel var1, JLabel var2, JLabel var3, JLabel var4,JLabel var5, JLabel var6, JLabel var7, JLabel var8,
    JLabel var9, JLabel var10, JLabel var11, JLabel var12,JLabel var13, JLabel var14, JLabel var15, JLabel var16){
        this.a=a;
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
        this.var4=var4;
        this.b=b;
        this.var5=var5;
        this.var6=var6;
        this.var7=var7;
        this.var8=var8;
        this.c=c;
        this.var9=var9;
        this.var10=var10;
        this.var11=var11;
        this.var12=var12;
        this.d=d;
        this.var13=var13;
        this.var14=var14;
        this.var15=var15;
        this.var16=var16;
        
        
    }
    
    public void run() {
        while (true) {
            if (!a.isFocusOwner()) {
                var1.setText(a.getText());
                var2.setText(a.getText());
                var3.setText(a.getText());
                var4.setText(a.getText());
            }
            if (!b.isFocusOwner()) {
                var5.setText(b.getText());
                var6.setText(b.getText());
                var7.setText(b.getText());
                var8.setText(b.getText());
            }
            if (!c.isFocusOwner()) {
                var9.setText(c.getText());
                var10.setText(c.getText());
                var11.setText(c.getText());
                var12.setText(c.getText());
            }
            if (!d.isFocusOwner()) {
                var13.setText(d.getText());
                var14.setText(d.getText());
                var15.setText(d.getText());
                var16.setText(d.getText());
            }
        }
    }
}
