public class Dueno {
    private String nombre;
    private String cedula;
    private int edad;

    private char genero;

    public void Dueno(String nombre,int edad, String cedula, char genero){

        this.nombre=nombre;
        this.edad=edad;
        this.cedula=cedula;
        this.genero=genero;




    }


    public String esMayorEdad(){
        String my="";
        if(edad>=18){
            my="Es mayor de edad";
            System.out.println(my);
        }else{
            my="Es menor de edad";
            System.out.println(my);
        }
        return my;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void imprimirDatosDueno(String Dueno1){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La cedula es: "+edad);
        System.out.println("El edad es: "+cedula);
        System.out.println("El genero es: "+genero);
    }



}