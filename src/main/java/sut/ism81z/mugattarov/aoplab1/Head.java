package sut.ism81z.mugattarov.aoplab1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Head {
    @PostConstruct
    public void postContstruct() {
        System.out.println("Head constructed");
    }
}
