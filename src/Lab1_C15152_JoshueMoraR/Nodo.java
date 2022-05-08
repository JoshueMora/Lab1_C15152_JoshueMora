package Lab1_C15152_JoshueMoraR;

public class Nodo {
    private Persona persona;
    private Nodo siguiente;

    public Nodo(){}

    public Nodo(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
}
