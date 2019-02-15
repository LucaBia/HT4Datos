public class FactoryPila {
    public static Pila createPila(String tipo) {
        switch (tipo) {
            case "arrayList": return new PilaArrayL();
            case "listSimple": return new PilaLst("simple");
            case "listDouble": return new PilaLst("double");
            case "listCircular": return new PilaLst("circular");
            case "vector": return new PilaVector();
            default: return null;
        }
    }
}
