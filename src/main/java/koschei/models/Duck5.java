package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private final Egg6 egg6;

    @Autowired
    public Duck5(@Qualifier("egg6") Egg6 egg) {
        this.egg6 = egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg6.toString();
    }
}
