package Lab1_C15152_JoshueMoraR;

public class metodos {

    private Nodo primero, ultimo;

    public metodos() {
    }

    public void insertarInicio(Persona persona) {

        Nodo nuevo = new Nodo(persona);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        if (ultimo == null) {
            ultimo = primero;
        }
    }

    public void insertarFinal(Persona persona) {

        Nodo nuevo = new Nodo(persona);

        if (ultimo == null) {
            primero = ultimo = nuevo;

        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public void ordenarBurbuja() {
        if (primero != null && primero.getSiguiente() != null) {
            for (Nodo i = primero; i.getSiguiente() != null; i = i.getSiguiente()) {
                for (Nodo actual = primero; actual.getSiguiente() != null; actual = actual.getSiguiente()) {
                    if (actual.getPersona().getCedula() > actual.getSiguiente().getPersona().getCedula()) {
                        Persona temp = actual.getPersona();
                        actual.setPersona(actual.getSiguiente().getPersona());
                        actual.getSiguiente().setPersona(temp);
                    }
                }
            }
        }
    }

    public void insertarOrdenado(Persona persona) {
        if (primero == null || persona.getCedula() < primero.getPersona().getCedula()) {
            insertarInicio(persona);
        } else if (persona.getCedula() > ultimo.getPersona().getCedula()) {
            insertarFinal(persona);
        } else {
            boolean continuar = true;
            Nodo actual = primero;
            while (actual.getSiguiente() != null && continuar == true) {
                if (persona.getCedula() < actual.getSiguiente().getPersona().getCedula()) {
                    Nodo nuevo = new Nodo(persona);
                    nuevo.setSiguiente(actual.getSiguiente());
                    actual.setSiguiente(nuevo);
                    continuar = false;
                }
                actual = actual.getSiguiente();
            }
        }
    }

    @Override
    public String toString() {
        String salida = "";
        for (Nodo actual = primero; actual != null; actual = actual.getSiguiente()) {
            salida += actual.getPersona().toString() + "| \n";
        }

        return salida;
    }
}
