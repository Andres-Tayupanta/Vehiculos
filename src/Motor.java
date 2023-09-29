public class Motor {
    double cilindraje=0;
    String combustible="";

    double caballosFuerza(){
        double cf;
        if(combustible.equals("Diesel")){
            cf=10.5;

        }else{
            cf=5.2;
        }
        return cf;
    }

}
