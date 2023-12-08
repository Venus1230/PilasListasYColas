package Model;

public class NodoL {

    int inf;
    NodoL sig;

    public NodoL(int inf, NodoL sig) {
        super();
        this.inf = inf;
        this.sig = sig;
    }

    public NodoL() {
    }

    public int getInf() {
        return inf;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    public NodoL getSig() {
        return sig;
    }

    public void setSig(NodoL sig) {
        this.sig = sig;
    }
    
    
}
