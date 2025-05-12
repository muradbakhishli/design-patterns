package structural.adapter;

public class Main {
    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(4);
        RoundPeg roundPeg = new  RoundPeg(3);

        System.out.println("Round peg fits : " + roundHole.fit(roundPeg));

        SquarePeg squarePeg = new SquarePeg(4);
        SquarePeg squarePeg2 = new SquarePeg(6);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(squarePeg2);

        System.out.println("Square peg 1 fits : " + roundHole.fit(squarePegAdapter));
        System.out.println("Square peg 2 fits : " + roundHole.fit(squarePegAdapter2));
    }
}
