/**
 * Clase que verifica el menu, el tipo de lista a usar
 */
public class FactoryPila {
    /**
     * valida con que letras del menu ingresadas correspone a la pila
     * @param tipo linked
     * @return tipo
     */
    public static Pila createPila(String tipo) {
        switch (tipo) {
            case "AL": return new PilaArrayL();
            case "SL": return new PilaLst("simple");
            case "DL": return new PilaLst("double");
            case "CL": return new PilaLst("circular");
            case "V": return new PilaVector();
            case "al": return new PilaArrayL();
            case "sl": return new PilaLst("simple");
            case "dl": return new PilaLst("double");
            case "cl": return new PilaLst("circular");
            case "v": return new PilaVector();
            default: return null;
        }
    }
}
