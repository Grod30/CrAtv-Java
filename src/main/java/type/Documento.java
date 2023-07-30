package type;

public enum Documento {
    COMPRAS_AUTORIZADAS("01"),
    VENTAS_EXENTAS_A_DIPLOMATICOS("02"),
    AUTORIZADO_POR_LEY_ESPECIAL("03"),
    EXCENCIONES_DIRECCION_GENERAL_DE_HACIENDA("04"),
    TRANSITORIO_V("05"),
    TRANSITORIO_IX("06"),
    TRANSITORIO_XVII("07"),
    OTROS("99");

    private final String value;

    Documento(final String value){
        this.value = value;
    }

    public String getValue(){return this.value;}

}
