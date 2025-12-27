package Strategy;

public class LivraisonStandard implements StrategieLivraison{
    private static final String POIDS = "Poids";
    private static final String VOLUME = "Volume";
    private static final String FORFAITAIRE = "Forfait";

    @Override
    public Float calculTarif(){
        String strat = POIDS;

        StrategieTarifInterne algo = null;
        switch (strat){
            case POIDS : algo = new TarificationPoids(); break;
            case VOLUME : algo = new TarificationVolume(); break;
            case FORFAITAIRE: algo = new TarificationForfaitaire(); break;
            default : assert false;
        }

        return 100.0f + algo.calculTarifInterne();
    }
}
