package br.sesi.hmd.poo;

import br.sesi.hmd.poo.cabeca.Cabeca;
import br.sesi.hmd.poo.inferior.MembrosInferiores;
import br.sesi.hmd.poo.tronco.Tronco;


public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa() {
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}
