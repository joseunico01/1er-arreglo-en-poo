

//la clase es alumno 

public class Alumno {
    
    //Nombre matricula grupo grado
    //Atributos siempre lo inicamos en private(por precacion)
    private String nombre;
    private int matricula;
    private char grupo;
    private int grado;
    
    //creamos un constructor para almacenar los valores, lo iniciamos en 0
    public Alumno(){
        nombre="";
        matricula=0;
        grupo=' ';
        grado=0;
    }
    //Creamos el constructor para poder alacemar los datos de al CLASE MAIN
        public Alumno(String nombre, int matricula, char grupo, int grado) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grupo = grupo;
        this.grado = grado;
    }

    //metodos creamos los metodos get y set por q estan en private para poder acceder a ellos 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
 
}
