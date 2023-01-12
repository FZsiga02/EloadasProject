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
        boolean sikerult = false;
        int i = 0;
        while (!sikerult && i < foglalasok.length) {
            int j = 0;
            while (!sikerult && j < foglalasok[i].length) {
                if (foglalasok[i][j]) {
                    j++;
                } else {
                    foglalasok[i][j] = true;
                    sikerult = true;
                }
            }
            if (!sikerult) {
                i++;
            }
        }
        return sikerult;
    }

    public int getSzabadHelyek() {
        int szabadHelyek = 0;
        for (boolean[] sor: foglalasok) {
            for (boolean hely: sor) {
                if (!hely) {
                    szabadHelyek++;
                }
            }
        }
        return  szabadHelyek;
    }

    public boolean getTeli() {
        throw new UnsupportedOperationException();
    }

    public boolean foglalt(int sorSzam, int helySzam) {
        throw new UnsupportedOperationException();
    }
}
