package type;

public enum DescripcionMensaje {
    ACEPTADO("1"),
    ACEPTACION_PARCIAL("2"),
    RECHAZADO("3");

    private final String value;

    DescripcionMensaje(final String value){ this.value = value;}

    public String getValue(){return this.value;}
}
