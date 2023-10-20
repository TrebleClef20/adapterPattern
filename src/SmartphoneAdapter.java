public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger phoneCharger;

    public SmartphoneAdapter(SmartphoneCharger phoneCharger) {
        this.phoneCharger = phoneCharger;
    }

    @Override
    public String plugIn() {
        return phoneCharger.chargePhone();
    }
}
