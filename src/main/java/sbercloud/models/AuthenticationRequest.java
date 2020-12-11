package sbercloud.models;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;

@Validated
@Data
public class AuthenticationRequest {

    @Size(min = 15)
    private String name;

    private String password;
}
