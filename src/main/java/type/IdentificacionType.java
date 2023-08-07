package type;

public enum IdentificacionType {
    CEDULA_FISICA("01"),
    CEDULA_JURIDICA("02"),
    DIMEX("03"),
    NITE("04");

    private final String value;

    IdentificacionType(final String value){
        this.value = value;
    }

    public String getValue(){return this.value;}
}
