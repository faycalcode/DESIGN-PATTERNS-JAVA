package Strategy;

public class ContextTarification {
    private String maStrat = "standard";
    private static final String STANDARD = "standard";
    private static final String EXPRESS = "express";
    public Float tarifGlobal(){
        StrategieLivraison strat = null;
        switch(maStrat){
            case STANDARD : strat = new LivraisonStandard(); break;
            case EXPRESS : strat = new LivraisonExpress(); break;
            default: assert false;
        }
        return strat.calculTarif();
    }
}
