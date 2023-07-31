package type;

public enum CondicionVenta {

    CONTADO("01"),
    CREDITO("02"),
    CONSIGNACION("03"),
    APARTADO("04"),
    ARRENDAMIENTO_CON_OPCION_DE_COMPRA("05"),
    ARRENDAMIENTO_EN_FUNCION_FINANCIERA("06"),
    COBROS_A_FAVOR_DE_UN_TERCERO("07"),
    SERVICIOS_PRESTADOS_POR_EL_ESTADO_A_CREDITO("08"),
    PAGO_DE_LOS_SERVICIOS_PRESTADOS_AL_ESTADO("09"),
    VENTA_A_CREDITO_EN_IVA_HASTA_90_DIAS("10"),
    PAGO_DE_VENTA_A_CREDITO_EN_IVA_HASTA_90_DIAS("11"),
    OTROS("99");

    private final String value;

    CondicionVenta(final String value){ this.value = value;}

    public String getValue(){return this.value;}
}
