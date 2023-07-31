package type;

public enum TarifaImpuesto {
    TARIFA_0("01"),
    TARIFA_REDUCIDA_01("02"),
    TARIFA_REDUCIDA_02("03"),
    TARIFA_REDUCIDA_04("04"),
    TRANSITORIO_0("05"),
    TRANSITORIO_04("06"),
    TRANSITORIO_08("07"),
    TARIFA_GENERAL_13("08"),
    TARIFA_REDUCIDA_05("09");

    private final String value;

    TarifaImpuesto(final String value){ this.value = value;}

    public String getValue(){return this.value;}
}
