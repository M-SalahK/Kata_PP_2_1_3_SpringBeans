package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Qualifier("timerMane")

public class Timer {

    private Long nanoTime = System.nanoTime();
    @Autowired
    public Long getTime() {
        return nanoTime;
    }
}
