package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloData { // JSON용 데이터 객체 틀

    private String username;
    private int age;
}
