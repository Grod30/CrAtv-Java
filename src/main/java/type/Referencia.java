package type;

public enum Referencia {
    ANULA_DOCUMENTO_DE_REFERENCIA("01"),
    CORRIGE_TEXTO_DOCUMENTO_DE_REFERENCIA("02"),
    CORRIGE_MONTO("03"),
    REFERENCIA_A_OTRO_DOCUMENTO("04"),
    SUSTITUYE_COMPROBANTE_PROVISIONAL_POR_CONTINGENCIA("05"),
    OTROS("99");


    private final String value;

    Referencia(final String value){ this.value = value;}

    public String getValue() {return value;}
}
