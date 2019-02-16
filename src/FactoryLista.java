/**
 * Clase que compara, valida el tipo de link o lista es
 */
public class FactoryLista {
    /**
     * Verifica si es simple, double, o circular la relacion
     * @param tipo
     * @return tipo
     */
    public static Lista createTypeList(String tipo) {
        switch (tipo) {
            case "simple": return new ListSimpleLinked<>();
            case "double": return new ListDoubleLinked<>();
            case "circular": return new ListCircular<>();
            default: return null;
        }
    }
}
