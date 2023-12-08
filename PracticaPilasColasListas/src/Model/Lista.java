package Model;

public class Lista {

    NodoL cab;
    int n;

    public Lista(NodoL cab, int n) {
        super();
        this.cab = cab;
        this.n = n;
    }

    public Lista() {
    }

    public NodoL getCab() {
        return cab;
    }

    public void setCab(NodoL cab) {
        this.cab = cab;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public NodoL extraerValor() {
        return null;
    }

    public NodoL extraerReferencia() {
        return null;
    }

    public void PushCab(NodoL nuevo) {
        if (this.cab != null) {
            nuevo.sig = cab;
        }
        this.cab = nuevo;
        this.n++;
    }

    public NodoL FinNode(int valor) {
        NodoL actual = this.cab;
        while (actual != null && actual.inf != valor) {
            actual = actual.sig;
        }
        return actual;
    }

    public void PushFinal(NodoL nuevo) {
        if (this.cab == null) {
            this.PushCab(nuevo);
            return;
        } else {
            NodoL movil = this.cab;
            while (movil.getSig() != null) {
                movil = movil.getSig();
            }
            movil.setSig(nuevo);
            this.n++;
        }
    }

    public void PushReferencia(NodoL nuevo, NodoL referencia) {
        if (referencia == null) {
            PushCab(nuevo);
        } else {
            nuevo.sig = referencia.sig;
            referencia.sig = nuevo;
            this.n++;
        }
    }

    public NodoL PopCab() {
        if (this.cab == null) {
            return null;
        }
        NodoL temp = this.cab;
        this.cab = this.cab.sig;
        this.n--;
        return temp;
    }

    public NodoL PopFinal() {
        if (this.cab == null) {
            return null;
        }
        if (this.cab.sig == null) {
            NodoL p = this.cab;
            this.cab = null;
            this.n--;
            return p;
        }
        NodoL p, q;
        p = this.cab;
        q = this.cab;
        while (q.sig != null) {
            p = q;
            q = q.sig;
        }
        p.sig = null;
        this.n--;
        return q;
    }

    public int[] RcorrerYDevolver() {

        int[] resultArray = new int[this.n];
        NodoL movil = this.cab;

        int index = 0;

        while (movil != null) {
            resultArray[index] = movil.inf;
            movil = movil.sig;
            index++;
        }

        return resultArray;

    }
}
