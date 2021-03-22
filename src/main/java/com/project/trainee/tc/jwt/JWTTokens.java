package com.project.trainee.tc.jwt;

import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.util.Base64Utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;

public class JWTTokens {
    private static final String SECRET = "bone";

    public static String createJWT(String subject){
        return Jwts.builder().setSubject(subject)
                .setExpiration(new Date(System.currentTimeMillis() + 60000))
                .signWith(SignatureAlgorithm.HS512, encodedSecret())
                .compact();
    }

    public static String getSubject(String token){
        return Jwts.parser().setSigningKey(encodedSecret()).parseClaimsJws(token).getBody().getSubject();
    }

    private static String encodedSecret(){
        String created = Base64Utils.encodeToUrlSafeString(SECRET.getBytes(StandardCharsets.UTF_8));
        System.out.println(created);
        return created;
    }


}
