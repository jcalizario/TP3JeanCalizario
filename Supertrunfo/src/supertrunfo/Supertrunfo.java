/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supertrunfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jean
 */
public class Supertrunfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cartas carta = new Cartas();
        carta.setNome("Austin 9");
        carta.setVelocidade(9);
        carta.setPeso(3);
        carta.setNavegacao(7);

        Cartas carta2 = new Cartas();
        carta2.setNome(" Apolo");
        carta2.setVelocidade(2);
        carta2.setPeso(7);
        carta2.setNavegacao(85);

        Cartas carta3 = new Cartas();
        carta3.setNome("Marie");
        carta3.setVelocidade(9);
        carta3.setPeso(3);
        carta3.setNavegacao(1);

        Cartas carta4 = new Cartas();
        carta4.setNome("Cornelio");
        carta4.setVelocidade(6);
        carta4.setPeso(9);
        carta4.setNavegacao(3);

        Cartas carta5 = new Cartas();
        carta5.setNome("Saga");
        carta5.setVelocidade(2);
        carta5.setPeso(4);
        carta5.setNavegacao(10);

        Cartas carta6 = new Cartas();
        carta6.setNome("Cape");
        carta6.setVelocidade(4);
        carta6.setPeso(8);
        carta6.setNavegacao(5);

        Cartas carta7 = new Cartas();
        carta7.setNome("Wizard");
        carta7.setVelocidade(2);
        carta7.setPeso(10);
        carta7.setNavegacao(5);

        Cartas carta8 = new Cartas();
        carta8.setNome("Nave");
        carta8.setVelocidade(2);
        carta8.setPeso(7);
        carta8.setNavegacao(3);

        Cartas carta9 = new Cartas();
        carta9.setNome("Lambo");
        carta9.setVelocidade(10);
        carta9.setPeso(4);
        carta9.setNavegacao(1);

        Cartas carta10 = new Cartas();
        carta10.setNome("Duke");
        carta10.setVelocidade(10);
        carta10.setPeso(2);
        carta10.setNavegacao(3);

        List<Cartas> jogo = new ArrayList();

        jogo.add(carta);
        jogo.add(carta2);
        jogo.add(carta3);
        jogo.add(carta4);
        jogo.add(carta5);
        jogo.add(carta6);
        jogo.add(carta7);
        jogo.add(carta8);
        jogo.add(carta9);
        jogo.add(carta10);

        for (Cartas jogo1 : jogo) {
            Collections.shuffle(jogo);
            System.out.println(jogo);
            System.out.println(jogo1.getNome());
            System.out.println(jogo1.getVelocidade());
            System.out.println(jogo1.getPeso());
            System.out.println(jogo1.getNavegacao());
        }

    }

}
