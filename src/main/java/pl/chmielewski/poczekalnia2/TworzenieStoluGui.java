package pl.chmielewski.poczekalnia2;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Route
public class TworzenieStoluGui extends VerticalLayout {

    private Grid grid;

    public TworzenieStoluGui() {
        grid=new Grid();

        grid.addColumn("Col1");
        grid.addColumn("COl2");
        add(grid);
    }


}