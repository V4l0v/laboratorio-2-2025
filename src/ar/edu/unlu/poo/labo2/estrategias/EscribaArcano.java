package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class EscribaArcano implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equals("Pergamino")) {
            int poder_amuleto = artefacto.getNivelDePoder();
            if (poder_amuleto < 30) {
                artefacto.setPoder(poder_amuleto+25);
            } else{
                artefacto.setPoder(poder_amuleto-10);
            }
        }
    }
}
