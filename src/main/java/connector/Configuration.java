package connector;

import java.io.InputStream;
import java.nio.file.FileSystemNotFoundException;
import java.util.Properties;

public class Configuration {
    private String api_username;
    private String api_password;

    private String api_client_id;
    private String api_token_url;
    private String api_logout_url;
    private String api_client_url;

    private String key_path;
    private String key_pin;


    public Configuration(String option) {
        try {
            if(option.equals("testing")) {
                Properties configFile = new Properties();
                InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");

                if (input != null) {
                    configFile.load(input);
                } else {
                    throw new FileSystemNotFoundException("");
                }

                this.api_username = configFile.getProperty("USERNAME");
                this.api_password = configFile.getProperty("PASSWORD");
                this.api_client_id = configFile.getProperty("SANDBOX_CLIENT_ID");
                this.api_token_url = configFile.getProperty("SANDBOX_TOKEN_URL");
                this.api_logout_url = configFile.getProperty("SANDBOX_LOGOUT_URL");
                this.api_client_url = configFile.getProperty("SANDBOX_API_URL");
            } else if(option.equals("production")){
                Properties configFile = new Properties();
                InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");

                if (input != null) {
                    configFile.load(input);
                } else {
                    throw new FileSystemNotFoundException("");
                }

                this.api_username = configFile.getProperty("USERNAME");
                this.api_password = configFile.getProperty("PASSWORD");
                this.api_client_id = configFile.getProperty("PRODUCTION_CLIENT_ID");
                this.api_token_url = configFile.getProperty("PRODUCTION_TOKEN_URL");
                this.api_logout_url = configFile.getProperty("PRODUCTION_LOGOUT_URL");
                this.api_client_url = configFile.getProperty("PRODUCTION_API_URL");
            }

        }
        catch(Exception e){

        }
    }

    public String getApi_username() {
        return api_username;
    }

    public void setApi_username(String api_username) {
        this.api_username = api_username;
    }

    public String getApi_password() {
        return api_password;
    }

    public void setApi_password(String api_password) {
        this.api_password = api_password;
    }

    public String getApi_client_id() {
        return api_client_id;
    }

    public void setApi_client_id(String api_client_id) {
        this.api_client_id = api_client_id;
    }

    public String getApi_token_url() {
        return api_token_url;
    }

    public void setApi_token_url(String api_token_url) {
        this.api_token_url = api_token_url;
    }

    public String getApi_logout_url() {
        return api_logout_url;
    }

    public void setApi_logout_url(String api_logout_url) {
        this.api_logout_url = api_logout_url;
    }

    public String getApi_client_url() {
        return api_client_url;
    }

    public void setApi_client_url(String api_client_url) {
        this.api_client_url = api_client_url;
    }

    public String getKey_path() {
        return key_path;
    }

    public void setKey_path(String key_path) {
        this.key_path = key_path;
    }

    public String getKey_pin() {
        return key_pin;
    }

    public void setKey_pin(String key_pin) {
        this.key_pin = key_pin;
    }
}
