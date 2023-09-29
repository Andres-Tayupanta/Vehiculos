public class Dueno {
    int edad;
    String nombre;
    String cedula;
    char genero;


    public String edadMayor(){
        String my="";
        if (edad>=18){
            my="Es mayor de edad";
            System.out.println(my);
        }else{
            my="Es menor de edad";
            System.out.println(my);
        }
        return my;
    }
}
