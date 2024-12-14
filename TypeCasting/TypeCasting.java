package TypeCasting;

public class TypeCasting {
 public static void main(String[] args) {
    //implicito (widening)
    int numeroInt = 100;
    long numeroLong = numeroInt;
    double numeroDouble = numeroInt;

    System.out.println(numeroLong);
    System.out.println(numeroDouble);

    //explicito (narrowing)
    double valorDouble = 9.78;
    int valorInt = (int) valorDouble;

    System.out.println(valorInt);
 }   
}
