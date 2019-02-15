public class FactoryPila {
    public static Pila createPila(String tipo) {
        switch (tipo) {
            case "AL": return new PilaArrayL();
            case "SL": return new PilaLst("simple");
            case "DL": return new PilaLst("double");
            case "CL": return new PilaLst("circular");
            case "V": return new PilaVector();
            default: return null;
        }
    }
}
