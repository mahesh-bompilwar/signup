package com.techdenovo.aaps.signup.security;

import com.techdenovo.aaps.signup.SpringApplicationContext;

public class SecurityConstants {
    public static final long EXPIRATION_TIME=864000000;//10 Days
    public static final String SIGN_UP_URL="/api/createUser";
    public static final String TOKEN_PREFIX= "Bearer ";
    public static final String HEADER_STRING= "Authorization";

    public static String getTokenSecret(){
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
        return appProperties.getTokenSecret();
    }

}
