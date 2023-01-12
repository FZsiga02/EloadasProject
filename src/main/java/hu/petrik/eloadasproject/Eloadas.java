package hu.petrik.eloadasproject;

public class Eloadas {
    private boolean [][] foglalasok;

    public Eloadas(int sorokSzama, int helyekSzama) {
        if (sorokSzama < 1) {
            throw new IllegalArgumentException("A sorokSzama paraméternek pozitívnak kell lennie");
        }
        if (helyekSzama < 1) {
            throw new IllegalArgumentException("A shelyekSzama paraméternek pozitívnak kell lennie");
        }
        this.foglalasok = new boolean[sorokSzama][helyekSzama];
    }

    public boolean lefoglal() {
        throw new UnsupportedOperationException();
    }

    public int getSzabadHelyek() {
        throw new UnsupportedOperationException();
    }

    public boolean getTeli() {
        throw new UnsupportedOperationException();
    }

    public boolean foglalt(int sorSzam, int helySzam) {
        throw new UnsupportedOperationException();
    }
}
