//import Model.Promotion;
//import Model.Product;
//import Strategy.DefaultPricingStrategy;
//import Strategy.ThreeForDolarPricingStrategy;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class MainTest {
//
//
//    @Test
//    public void should_give_price_for_1_pack_of_3_and_2_single_for_PackOfThreeStrategy1() {
//
//        Promotion price = new Promotion(0.65,1);
//        Assertions.assertEquals(app.totalPriceOrder(5, new Product("orange", "fruit", price), new ThreeForDolarPricingStrategy()), 2.3);
//    }
//
//    @Test
//    public void should_give_price_for_1_pack_of_3_and_0_single_for_PackOfThreeStrategy2() {
//        Main app = new Main();
//        Promotion price = new Promotion(0.65,1);
//        Assertions.assertEquals(app.totalPriceOrder(3, new Product("orange", "fruit", price), new ThreeForDolarPricingStrategy()), 1);
//
//    }
//    @Test
//    public void should_give_price_for_1_pack_of_2_and_get_1_for_free_TwoForThreePricingStrategy() {
//        Main app = new Main();
//         Promotion price = new Promotion(0.65,1.3);
//        Assertions.assertEquals(app.totalPriceOrder(3, new Product("orange", "fruit", price), new ThreeForDolarPricingStrategy()), 1.3);
//
//    }
//    @Test
//    public void should_give_price_for_1_pack_of_2_and_get_1_for_single_TwoForThreePricingStrategy() {
//        Main app = new Main();
//        Promotion price = new Promotion(0.65,1.3);
//        Assertions.assertEquals(app.totalPriceOrder(4, new Product("orange", "fruit", price), new ThreeForDolarPricingStrategy()), 1.95);
//
//    }
//    @Test
//    public void should_give_price_for_3_kg_for_WeightPricingStrategy() {
//        Main app = new Main();
//        Promotion price = new Promotion(7);
//        Assertions.assertEquals(app.totalPriceOrder(3, new Product("meat", "red meat", price), new WeightPricingStrategy()), 21);
//
//    }
//    @Test
//    public void should_give_price_for_3_unit_for_DefaultPricingStrategy() {
//        Main app = new Main();
//        Promotion price = new Promotion(10.7);
//        Assertions.assertEquals(app.totalPriceOrder(3, new Product("lindt chocolat", "sweets/chocolat", price), new DefaultPricingStrategy()), 32.1);
//
//    }
//}
