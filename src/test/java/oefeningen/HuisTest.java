package oefeningen;


import huisenum.Huis;
import huisenum.TypeHuis;
import huisenum.TypeMateriaal;
import org.testng.annotations.Test;

public class HuisTest {

    @Test
    public void createVakantiehuis() {
        Huis vakantiehuisje = new Huis();
        vakantiehuisje.setMateriaal(TypeMateriaal.STEEN);
        vakantiehuisje.setType(TypeHuis.RIJTJESHUIS);

        System.out.println(vakantiehuisje);
    }
}
