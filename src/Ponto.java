public class Ponto {

    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equalsTo(Ponto p2) {
        if (this.x == p2.x && this.y == p2.y) {
            return true;
        }
        return false;
    }
    //imprime o tipo de reta (horizontal, vertical, obliqua)
    public static void checkPossibleLine(Ponto p1, Ponto p2) {
        if(!p1.equalsTo(p2)) {
            if (p1.y == p2.y) {
                System.out.println("Horizontal");
            } else if (p1.x == p2.x) {
                System.out.println("Vertical");
            } else {
                System.out.println("Obliqua");
            }
        } else {
            System.out.println("Ponto iguais");
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto: " + x + "," + y ;
    }

    public static void main(String[] args) {
        Ponto p1 = new Ponto(3,2);
        Ponto p2 = new Ponto(1,3);

        checkPossibleLine(p1, p2);
        System.out.println(p1);
        System.out.println(p2);

    }
}
