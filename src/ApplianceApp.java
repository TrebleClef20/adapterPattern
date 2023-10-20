public class ApplianceApp {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopPO = new LaptopAdapter(laptop);

        Refrigerator ref = new Refrigerator();
        PowerOutlet refPO = new RefrigeratorAdapter(ref);

        SmartphoneCharger phoneCharger = new SmartphoneCharger();
        PowerOutlet phonePO = new SmartphoneAdapter(phoneCharger);

        System.out.println();

        // plug in the appliances
        System.out.println(laptopPO.plugIn());
        System.out.println(refPO.plugIn());
        System.out.println(phonePO.plugIn());

        System.out.println();
    }
}
