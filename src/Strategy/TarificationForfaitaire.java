package Strategy;

public class TarificationForfaitaire implements StrategieTarifInterne{

    @Override
    public Float calculTarifInterne(){
        return 50.0f;
    }
}
