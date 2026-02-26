
class Pilas_mias <T>{
    private T pila[];
    private int tope = -1;
    public T dato;
    private int max=0;

    public Pilas_mias(int maximo){
        int max = maximo-1;
        pila = (T[])new Object[max];
    }

    public void borrarPila(){
        tope = -1;
    }

    private boolean Pila_llena(){
        boolean res=false;
        if(tope==(max)){
            res=true;
        }
        else{
            res=false;
        }
        return res;
    }

    private boolean Pila_vacia(){
        boolean res=false;
        if(tope==-1){
            res=true;
        }
        return res;
    }

    public boolean Insertar_pila(T dato){
        boolean res = false;
        if(!Pila_llena()){
            tope++;
            dato = pila[tope];
            res = true;
        }else{
            res = false;
        }
        return res;

    }



}