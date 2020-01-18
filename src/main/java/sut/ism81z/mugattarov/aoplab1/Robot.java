package sut.ism81z.mugattarov.aoplab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Robot {
    private Head head;

    @Autowired
    public Robot(Head head) {
        this.head = head;
    }

    @PostConstruct
    public void postContstruct() {
        System.out.println("Robot constructed");
        System.out.println("Head: " + head);
    }
}
