package clasesPrinciales;

import window.IdePrincipal;
import javax.swing.*;


public class TestAntlr {
    public static void main(String[] args) {
        JFrame frame = new JFrame("IdePrincipal");
        frame.setContentPane(new IdePrincipal().pabelPricipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
