package sbercloud.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AuthenticationResponse {
    private final String jwt;
}
