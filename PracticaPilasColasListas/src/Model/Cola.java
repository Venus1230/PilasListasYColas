package Model;

public class Cola extends Lista {

    public void PushCabecera(NodoL nuevo) {
        super.PushCab(nuevo);
    }

    public NodoL PopFinal() {
        return super.PopFinal();
    }

    @Override
    public NodoL PopCab() {
        System.out.println("No aplicable para cola");
        return null;
    }

    @Override
    public void PushFinal(NodoL nuevo) {
        System.out.println("No aplicable para cola");
    }

    @Override
    public int[] RcorrerYDevolver() {
        return super.RcorrerYDevolver();
    }

}
