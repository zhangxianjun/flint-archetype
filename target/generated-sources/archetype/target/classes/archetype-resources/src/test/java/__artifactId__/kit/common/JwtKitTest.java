#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.kit.common;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.flint.parent.utils.JwtKit;

@SpringBootTest
class JwtKitTest {


    @Test
    void buildToken() {
        JwtKit.buildToken(1000L);
    }

    @Test
    void verifyToken() {
    }

    @Test
    void getId() {
    }
}