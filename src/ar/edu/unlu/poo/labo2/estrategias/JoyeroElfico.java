package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class JoyeroElfico implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equals("Amuleto")){
            int poder_amuleto= artefacto.getNivelDePoder();
            if(poder_amuleto<50){
                artefacto.setPoder(poder_amuleto*2);
            }
            else{
                artefacto.setPoder((int) (poder_amuleto*1.25));
            }
        }
    }
}
