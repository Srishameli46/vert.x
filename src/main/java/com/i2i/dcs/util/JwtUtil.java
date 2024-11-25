package com.i2i.dcs.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.i2i.dcs.model.Role;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class JwtUtil {

    @Value("${jwt.secret.key}")
    private String secretKey;

    /**
     * <p>
     * Generates token encapsulating the userId and roles of the corresponding user.
     * </p>
     *
     * @param userId Unique id of the user for whom the token is generated for.
     * @param roles  set of roles held by the user.
     * @return String generated token.
     */
    public String generateToken(String userId, Set<Role> roles) {
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        List<String> roleNames = new ArrayList<>();
        for (Role role : roles) {
            roleNames.add(role.getRoleName().toString());
        }
        return JWT.create().withSubject(userId).withClaim("roles", Arrays.asList(roleNames.toArray(new String[0]))).withExpiresAt(new Date(new Date().getTime() + 60 * 60 * 1000)) // 1 hour expiration
                .sign(algorithm);
    }
}
