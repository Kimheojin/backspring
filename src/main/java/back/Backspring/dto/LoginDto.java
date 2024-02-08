package back.Backspring.dto;

import lombok.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

//dto 만드는 이유
//https://velog.io/@witwint/Spring-DTO%EC%9D%98-%EC%82%AC%EC%9A%A9%EC%9D%B4%EC%9C%A0

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NotNull
    @Size(min = 3, max = 50)
    private String username;

    @NotNull
    @Size(min = 3, max = 100)
    private String password;
}
