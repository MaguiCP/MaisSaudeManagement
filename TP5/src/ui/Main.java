package ui;

import model.MaisSaude;

/**
 * Classe de arranque da aplicação
 */
public class Main {

    public static void main(String[] args) {
        try {   // Construção da clinica
            MaisSaude clinica = new MaisSaude("MaisSaude");

            MenuInicial_UI uiMenu = new MenuInicial_UI(clinica);

            uiMenu.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
