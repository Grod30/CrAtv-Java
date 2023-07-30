package type;

public enum Identificacion  {
    CEDULA_FISICA("01"),
    CEDULA_JURIDICA("02"),
    DIMEX("03"),
    NITE("04");

    private final String value;

    Identificacion(final String value){
        this.value = value;
    }

    public String getValue(){return this.value;}
}
