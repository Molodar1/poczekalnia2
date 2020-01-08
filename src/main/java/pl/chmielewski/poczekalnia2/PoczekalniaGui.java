package pl.chmielewski.poczekalnia2;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class PoczekalniaGui extends VerticalLayout{
    private Button tworzenieStolu;
    private Button wyszukanieStolu;
    private Button ustawieniaKonta;

    public PoczekalniaGui() {
        tworzenieStolu = new Button("Stwórz nowy stół");
        wyszukanieStolu = new Button("Wyszukaj stół");
        ustawieniaKonta=new Button("Ustawienia");

        VerticalLayout layout1 = new VerticalLayout();
        HorizontalLayout layout2=new HorizontalLayout();
        layout1.setSizeFull();
        layout1.getStyle().set("border", "1px solid #9E9E9E");


        layout1.add(tworzenieStolu,wyszukanieStolu);
        layout1.setHorizontalComponentAlignment(FlexComponent.Alignment.CENTER,
                wyszukanieStolu,tworzenieStolu);
        layout1.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);


        layout1.add(ustawieniaKonta);
        layout1.setHorizontalComponentAlignment(Alignment.END,
                ustawieniaKonta);
        layout1.setJustifyContentMode(JustifyContentMode.END);
        add(layout1);

    }
}