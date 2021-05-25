package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Needle7 needle7;
    public Egg6(@Qualifier("needle7") Needle7 needle) {
        this.needle7 = needle;
    }
    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
