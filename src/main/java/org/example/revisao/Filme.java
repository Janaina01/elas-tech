package org.example.revisao;

public class Filme {
        String titulo;
        String genero;
        double nota;
        String classificacao;

        public static String fazerClassificacao(double nota){
            if (nota >= 8){
                return  "Ótimo";
            } else if ( nota >= 5) {
                return "Bom";
            } else {
                return "Ruim";
            }
        }

    }

