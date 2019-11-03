import controller.PolynomLagrange;
import view.ConcoleView;
import model.Uzly;


import java.io.IOException;

public class Main {
    public static ConcoleView consoleview = new ConcoleView();

    public  Main(Uzly uzly, ConcoleView consoleview) {
        this.consoleview = consoleview;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nachnem!");
        ConcoleView.convert(PolynomLagrange.polynomLagrange(consoleview.uzlyx(),consoleview.uzlyy()));
    }
}