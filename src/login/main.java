package login;

import java.io.File;

public class main {

    public static void main(String[] args) {
        
        String archivo = "";
        archivo ="C:/Program Files (x86)/arranque.txt";
        File arranque = new File(archivo);
        System.out.println("La ruta del fichero es: " + arranque.getAbsolutePath());
        if(arranque.exists()){
            System.out.println("arranque si esta");
            inisio_sesion inicio = new inisio_sesion();
            inicio.setVisible(true);
        }else{
            System.out.println("arranque NO esta");
            licencia licencia = new licencia();
            licencia.setVisible(true);
        }
    }
}