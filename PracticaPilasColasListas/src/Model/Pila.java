package Model;

public class Pila extends Lista {

    public NodoL PopCabecera() {
        return super.PopCab();
    }

    public void PushCabecera(NodoL nuevo) {
        super.PushCab(nuevo);
    }

    @Override
    public NodoL PopFinal() {
        System.out.println("No aplicable para pila");
        return null;
    }

    @Override
    public void PushFinal(NodoL nuevo) {
        System.out.println("No aplicable para pila");
    }

    @Override
    public int[] RcorrerYDevolver() {
        return super.RcorrerYDevolver();
    }

}
