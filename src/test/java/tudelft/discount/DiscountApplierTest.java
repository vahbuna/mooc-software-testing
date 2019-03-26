package tudelft.discount;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

public class DiscountApplierTest {
    private DiscountApplier dicounter;
    private ProductDao db;

    @BeforeEach
    public void init() {
        db = Mockito.mock(ProductDao.class);
    }

    @Test
    public void setPrices() {
        Product mauricio = new Product("Mauricio", 20.0, "HOME");
        Product arie = new Product("Arie", 300.0, "BUSINESS");

        List<Product> results = Arrays.asList(mauricio, arie);
        Mockito.when(db.all()).thenReturn(results);

        dicounter = new DiscountApplier(db);
        dicounter.setNewPrices() ;

        Assertions.assertEquals(18.0, mauricio.getPrice());
        Assertions.assertEquals(330.0, arie.getPrice());
    }
}