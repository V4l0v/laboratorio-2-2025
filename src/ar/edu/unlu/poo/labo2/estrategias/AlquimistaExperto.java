package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class AlquimistaExperto implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equals("Poción")){
            artefacto.setPoder(artefacto.getNivelDePoder()+20);
            if(artefacto.getNivelDePoder() >100){
                artefacto.setPoder(100);
            }
        }
    }
}
