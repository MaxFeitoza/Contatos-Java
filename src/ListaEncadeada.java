package src;

public class ListaEncadeada<T>{
    private T elemento;
    private ListaEncadeada<T> proximaDisciplina;


    public ListaEncadeada(T elemento){
        this.elemento = elemento;
        this.proximaDisciplina = null;
    }


    public ListaEncadeada(T elemento, ListaEncadeada<T> proximaDisciplina) {
        this.elemento = elemento;
        this.proximaDisciplina = proximaDisciplina;
    }

    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public ListaEncadeada<T> getProximaDisciplina() {
        return proximaDisciplina;
    }
    public void setProximaDisciplina(ListaEncadeada<T> proximaDisciplina) {
        this.proximaDisciplina = proximaDisciplina;
    }


    @Override
    public String toString() {
        return "ListaEncadeada [proximaDisciplina=" + proximaDisciplina + "]";
    }

}
