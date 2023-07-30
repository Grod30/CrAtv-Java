package type;

public enum Telefono {
    TELEFONO("Telefono"),
    FAX("Fax");

    private final String value;

    Telefono(final String value){ this.value = value;}

    public String getValue(){return this.value;}
}
