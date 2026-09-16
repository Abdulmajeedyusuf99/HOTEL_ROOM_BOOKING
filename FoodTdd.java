import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoodTdd {


    @Test
    public void discount(){
        Food rice = new Food("Rice",1500.0);
        rice.getPrice();
        rice.getPrice();
        rice.getPrice();
        rice.getPrice();
        rice.getPrice();
        rice.getPrice();

        assertEquals(1050.0,rice.discount(10500.0),hashCode());

    }
}
