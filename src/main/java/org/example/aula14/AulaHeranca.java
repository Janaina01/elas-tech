package org.example.aula14;

public class AulaHeranca {
    public static void main(String[] args) {

        Oftalmologista mariaMedica = new Oftalmologista();

        mariaMedica.dormem();
        mariaMedica.baterPonto();
        mariaMedica.passarCracha();
        mariaMedica.passarRaiva();

        mariaMedica.passarExame();
        mariaMedica.fazerCirurgia();



        FuncionariosHospital joaoDoRH = new FuncionariosHospital();

        Oftalmologista alineOftalmo = new Oftalmologista();

        alineOftalmo.passarCracha();
    }
}
