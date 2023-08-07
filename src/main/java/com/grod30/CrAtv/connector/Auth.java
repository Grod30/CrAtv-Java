package com.grod30.CrAtv.connector;

import com.sun.jdi.event.ExceptionEvent;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;

import java.util.Properties;

// TODO: implement refresh token and ask for token and logout token
public class Auth{
    private OAuthClient client;
    private OAuthClientRequest request;
    private OAuthAccessTokenResponse token;

    public Auth(OAuthClientRequest request) {
        this.client = new OAuthClient(new URLConnectionClient());
        this.request = request;

        try{
            this.token = client.accessToken(request, OAuth.HttpMethod.POST, OAuthJSONAccessTokenResponse.class);
        } catch (OAuthProblemException | OAuthSystemException e) {
            throw new RuntimeException(e);
        }
    }


    public Auth() {
        this.client = new OAuthClient(new URLConnectionClient());
        try {
            this.request = OAuthClientRequest
                    .tokenLocation("https://idp.comprobanteselectronicos.go.cr/auth/realms/rut-stag/protocol/openid-connect/token")
                    .setGrantType(GrantType.PASSWORD)
                    .setClientId("api-stag")
//                    TODO: set here the username and password temporarily based on the config.properties file
                    .setUsername("")
                    .setPassword("")
                    .buildBodyMessage();

            this.token = client.accessToken(request, OAuth.HttpMethod.POST, OAuthJSONAccessTokenResponse.class);
        } catch (OAuthSystemException | OAuthProblemException e) {
            throw new RuntimeException(e);
        }
    }

    public OAuthClient getClient() {
        return client;
    }

    public void setClient(OAuthClient client) {
        this.client = client;
    }

    public OAuthClientRequest getRequest() {
        return request;
    }

    public void setRequest(OAuthClientRequest request) {
        this.request = request;
    }

    public OAuthAccessTokenResponse getToken() {
        return token;
    }

    public void setToken(OAuthAccessTokenResponse token) {
        this.token = token;
    }
}
