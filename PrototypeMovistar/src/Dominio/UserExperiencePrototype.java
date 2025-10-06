package Dominio;
import java.util.*;
public class UserExperiencePrototype {
    private HashMap<String,UserExperience> prototipos = new HashMap<>();

    public UserExperiencePrototype() {
        // falta por agregar los parametros de cada plan
        FibraExperience fibra = new FibraExperience();
        MovilExperience movil = new MovilExperience();
        FusionExperience fusion = new FibraExperience();
        NuevoClienteExperience nuevoCliente = new NuevoClienteExperience();

    }
}
