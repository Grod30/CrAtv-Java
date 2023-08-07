package type;

public enum ProductionApi {

    CLIENT_ID("api-prod"),
    TOKEN_URL("https://idp.comprobanteselectronicos.go.cr/auth/realms/rut/protocol/openid-connect/token"),
    LOGOUT_URL("https://idp.comprobanteselectronicos.go.cr/auth/realms/rut/protocol/openid-connect/logout"),
    API_URL("https://api.comprobanteselectronicos.go.cr/recepcion/v1");

    private final String value;

    ProductionApi(final String value){this.value = value;}

    public String getValue() {
        return value;
    }
}
