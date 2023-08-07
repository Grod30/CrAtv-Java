package type;

public enum StagingApi {
    CLIENT_ID("api-stag"),
    TOKEN_URL("https://idp.comprobanteselectronicos.go.cr/auth/realms/rutstag/protocol/openid-connect/token"),
    LOGOUT_URL("https://idp.comprobanteselectronicos.go.cr/auth/realms/rutstag/protocol/openid-connect/logout"),
    API_URL("https://api.comprobanteselectronicos.go.cr/recepcion-sandbox/v1");

    private final String value;

    StagingApi(final String value){this.value = value;}

    public String getValue() {
        return value;
    }
}
