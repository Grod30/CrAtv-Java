package type;

public enum CodigoProductoServicio {

    CODIGO_DEL_PRODUCTO_DEL_VENDEDOR("01"),
    CODIGO_DEL_PRODUCTO_DEL_COMPRADOR("02"),
    CODIGO_DEL_PRODUCTO_ASIGNADO_POR_LA_INDUSTRIA("03"),
    CODIGO_DE_USO_INTERNO("04"),
    OTROS("99");
    private final String value;

    CodigoProductoServicio(final String value){ this.value = value;}

    public String getValue(){return this.value;}
}
