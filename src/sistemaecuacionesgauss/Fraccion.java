package sistemaecuacionesgauss;

public class Fraccion {
     private double num;
     private double den;
  public Fraccion() {
     num=0;
     den=1;
  }
  public Fraccion(double x, double y) {
     num=x;
     den=y;
  }
  public static Fraccion sumar(Fraccion a, Fraccion b){
     Fraccion c=new Fraccion();
     c.num=a.num*b.den+b.num*a.den;
     c.den=a.den*b.den;
     return c;
  }
  public static Fraccion restar(Fraccion a, Fraccion b){
     Fraccion c=new Fraccion();
     c.num=a.num*b.den-b.num*a.den;
     c.den=a.den*b.den;
     return c;
  }

  public static Fraccion multiplicar(Fraccion a, Fraccion b){
     return new Fraccion(a.num*b.num, a.den*b.den);
  }
  public static Fraccion inversa(Fraccion a){
     return new Fraccion(a.den, a.num);
  }
  public static Fraccion dividir(Fraccion a, Fraccion b){
     return multiplicar(a, inversa(b));
  }

  private double mcd(){
     double u=Math.abs(num);
     double v=Math.abs(den);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=(int) (u%v);
          u=v;
          v=r;
     }
     return u;
  }

  public Fraccion simplificar(){
     int dividir=(int) mcd();
     num/=dividir;
     den/=dividir;
     return this;
  }

  public String toString(){
     String texto=num+" / "+den;
     return texto;
  }
  
  public double toDouble(){
     double div= (float) (num/den);
      return div;
  }
}