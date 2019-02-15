public class FactoryLista {
    public static Lista createTypeList(String tipo) {
        switch (tipo) {
            case "simple": return new ListSimpleLinked<>();
            case "double": return new ListDoubleLinked<>();
            case "circular": return new ListCircular<>();
            default: return null;
        }
    }
}
