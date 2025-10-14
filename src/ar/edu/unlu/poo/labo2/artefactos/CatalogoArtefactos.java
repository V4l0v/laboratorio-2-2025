package ar.edu.unlu.poo.labo2.artefactos;
import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

import java.util.*;


public class CatalogoArtefactos
{

    private Set<ar.edu.unlu.poo.labo2.artefactos.Artefacto> artefactos;
    private EstrategiaDeMejora mejora;
    public CatalogoArtefactos()

    {
        this.artefactos = new HashSet<>();
    }
    public CatalogoArtefactos(EstrategiaDeMejora mejora)

    {
        this.artefactos = new HashSet<>();
        this.mejora=mejora;
    }
    public void aplicarMejoras()
    {
        for (Artefacto artefacto:artefactos){
            mejora.mejorar(artefacto);
        }
    }

    public void agregarArtefacto(ar.edu.unlu.poo.labo2.artefactos.Artefacto artefacto)
    {
        artefactos.add(artefacto);
    }

    public Set<ar.edu.unlu.poo.labo2.artefactos.Artefacto> obtenerArtefactosUnicos()
    {
        return new HashSet<>(artefactos);
    }

    public List<ar.edu.unlu.poo.labo2.artefactos.Artefacto> buscarArtefactosPorTipo(String tipo)
    {
        List<ar.edu.unlu.poo.labo2.artefactos.Artefacto> resultado = new ArrayList<>();

        for (ar.edu.unlu.poo.labo2.artefactos.Artefacto a : artefactos)
        {
            if (a.getTipo().equals(tipo))
            {
                resultado.add(a);
            }
        }

        for (int i = 0; i < resultado.size() - 1; i++)
        {
            for (int j = i + 1; j < resultado.size(); j++)
            {
                if (resultado.get(j).getNivelDePoder() > resultado.get(i).getNivelDePoder())
                {
                    ar.edu.unlu.poo.labo2.artefactos.Artefacto aux = resultado.get(i);
                    resultado.set(i, resultado.get(j));
                    resultado.set(j, aux);
                }
            }
        }

        return resultado;
    }

    public Map<String, Integer> contarArtefactosPorTipo()
    {
        Map<String, Integer> conteo = new HashMap<>();

        for (ar.edu.unlu.poo.labo2.artefactos.Artefacto a : artefactos)
        {
            String tipo = a.getTipo();
            if (conteo.containsKey(tipo))
            {
                conteo.put(tipo, conteo.get(tipo) + 1);
            } else {
                conteo.put(tipo, 1);
            }
        }

        return conteo;
    }

    public ar.edu.unlu.poo.labo2.artefactos.Artefacto obtenerArtefactoMasPoderoso()
    {
        ar.edu.unlu.poo.labo2.artefactos.Artefacto masPoderoso = null;
        int maxPoder = -1;

        for (ar.edu.unlu.poo.labo2.artefactos.Artefacto a : artefactos)
        {
            if (a.getNivelDePoder() > maxPoder)
            {
                maxPoder = a.getNivelDePoder();
                masPoderoso = a;
            }
        }

        return masPoderoso;
    }
}
