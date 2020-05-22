package kr.ac.jejunu.user;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    // 순환참조 사용할 때는 @Data 사용 불가
    private Integer id;
    private String name;
    private String password;
}
