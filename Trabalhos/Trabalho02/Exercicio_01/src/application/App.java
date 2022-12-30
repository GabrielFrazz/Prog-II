package application;

public class App {
    public static void main(String[] args) throws Exception {

        int cont = 1;
        boolean mainLoop = true;

        do {
            UI u = new UI();

            if (cont == 1)
                u.welcome();

            int m;
            m = u.firstMenu();

            if (m == 1)
                u.graphInput();
            else
                u.randomGraph();

            cont++;
            boolean secondLoop = true;

            do {
                m = u.secondMenu();

                if (m == 1) {
                    u.neighborsVertices();
                } else {
                    u.allNeighbors();
                }

                m = u.thirdMenu();
                if (m == 1) {
                    secondLoop = false;
                    mainLoop = true;
                } else if (m == 2) {
                    secondLoop = true;
                    mainLoop = true;
                } else if (m == 3) {
                    secondLoop = false;
                    mainLoop = false;
                }

            } while (secondLoop == true);

        } while (mainLoop == true);
    }

}
