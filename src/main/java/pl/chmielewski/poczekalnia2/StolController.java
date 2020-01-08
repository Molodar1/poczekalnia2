package pl.chmielewski.poczekalnia2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

@Controller
public class StolController {

    private Stol stol;

    @Autowired
    public StolController(Stol stol) {
        this.stol = stol;
    }
}
