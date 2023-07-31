package type;

public enum Mediopago {
    EFECTIVO("01"),
    TARJETA("02"),
    CHEQUE("03"),
    TRANSFERENCIA_DEPOSITO_BANCARIO("04"),
    RECAUDADO_POR_TERCEROS("05"),
    OTROS("99");

    private final String value;

    Mediopago(final String value){ this.value = value;}

    public String getValue(){return this.value;}
}
