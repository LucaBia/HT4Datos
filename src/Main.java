import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Clase principal
 * @author gianlucariverabiagioni / franciscorosal
 */
public class Main {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        MyCalculator calculator = MyCalculator.createCalculator();
        Pila pila;
        String tipo;

        System.out.println("Ingrese la implementacion de Stack que desea usar: ");
        System.out.println("ArrayList: AL");
        System.out.println("Vector: V");
        System.out.println("SimpleList: SL");
        System.out.println("DoubleList: DL");
        System.out.println("CircularList: CL");
        tipo = read.next();

        pila = FactoryPila.createPila(tipo);

        //para leer el archivo
        ArrayList<String> archivo = new ArrayList<>();
        try {
            Stream<String> lines = Files.lines(
                    Paths.get("datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(archivo::add);
        } catch (IOException e ){
            System.out.println("Ha ocurrido un error");
        }


        for (String anArchivo : archivo) {

            String[] caracteres = anArchivo.split("");
            ArrayList<String> operacion = new ArrayList<>(Arrays.asList(caracteres));

            for (String anOperacion : operacion) {
                int num;
                try {
                    num = Integer.parseInt(anOperacion);
                    pila.push(num);
                } catch (Exception e) {
                    if (!anOperacion.equals(" ")) {
                        int num1 = (int) pila.pop();
                        int num2 = (int) pila.pop();
                        int resultado = calculator.calculate(num1, num2, anOperacion);
                        pila.push(resultado);
                    }
                }
            }
            System.out.println("resultado = " + pila.pop());
        }
    }
}
