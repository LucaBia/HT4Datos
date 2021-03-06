/**
 * MyCalculator implementa la interfaz Calculator para realizar operaciones (postfix)
 */
public class MyCalculator implements Calculator {

    private static MyCalculator calculator;

    public MyCalculator(){}

    //Singleton
    public static MyCalculator createCalculator() {
        if (calculator == null) {
            calculator = new MyCalculator();
        }
        return calculator;
    }

    /**
     * Calcula cuales van a ser los numeros u operandos y el signo u operador
     * @param num1 primer operando / numero
     * @param num2 segundo operando / numero
     * @param op operando o signo artimetico
     * @return resultado del calculo
     */
    @Override
    public int calculate(int num1, int num2, String op) {
        int res = 0;

        if ("+".equals(op)) {
            res = num1 + num2;

        } else if ("-".equals(op)) {
            res = num2 - num1;

        } else if ("*".equals(op)) {
            res = num1 * num2;

        } else if ("/".equals(op)) {
            if (num2 == 0) {
                /*try{
                    int cero = 0;
                    throw new ArithmeticException();
                    //return 0;
                }catch(ArithmeticException ae){
                    System.out.println("Division entre cero");
                }*/
                return 0;


            }
            res = num2 / num1;

        }
        return res;
    }
}
