import javax.swing.table.TableRowSorter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class GestorArchivo {
    //no funciona en cualquier carpeta
    //no elimina cualquier cosa
    //si elimina un archivo elmina completamente el archivo

    public void crearDirectorio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa la ruta");
        String ruta = teclado.next(); //teclado.next lee lo que ingresamos
        Path directorio = Paths.get(ruta);
        if (Files.exists(directorio)){
            System.out.println("el directorio ya existe");
        }else{
            try{
                Files.createDirectories(directorio);
            }catch (IOException e){//exclusiva de elementos de entrada y salida input output exception
                System.out.println("el directorio no pudo ser creado");
            }
        }


    }

    public void crearDirectiorio2(String ruta){//es otra forma de hacer crearDirectorio
        Path dir = Paths.get(ruta);
        if (Files.exists(dir)){
            System.out.println("el directorio ya existe");
        }else{
            try {
                Files.createDirectories(dir);
                System.out.println("el directorio fue creado exitosamente");
            }catch (IOException e){
                System.out.println("el directorio no pudo ser creado");
            }
        }
    }

    public void crearArchivo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa la ruta");
        String ruta = teclado.next(); //teclado.next lee lo que ingresamos
        Path archivo = Paths.get(ruta);
        System.out.println("ingresa un texto para almacenar en el archivo");
        String texto = teclado.next()+teclado.nextLine();
        try {
            Files.write(archivo,texto.getBytes());
            System.out.println("el archivo fue creado exitosamente");
        }catch (Exception e){
            System.out.println("el archivo no se pudo crear");
        }

    }

    public void crearArchivo2(String ruta, String contenido){
        Path dir = Paths.get(ruta);
        try {
            Files.write(dir,contenido.getBytes());
            System.out.println("el archivo fue creado exitosamente");
        }catch (Exception e){
            System.out.println("el archivo no se pudo crear");
        }
    }

    public void leerArchivo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa la ruta");
        String ruta = teclado.next(); //teclado.next lee lo que ingresamos
        Path archivo = Paths.get(ruta);
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(archivo));
        }catch (IOException e){
            System.out.println("el archivo no pudo ser leido ");
        }
        System.out.println("el contenido del archivo es: \n "+texto);
    }

    public void borrarArchivo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa la ruta");
        String ruta = teclado.next(); //teclado.next lee lo que ingresamos
        Path archivho = Paths.get(ruta);
        try {
            Files.deleteIfExists(archivho);
            System.out.println("el archivo fue eliminado exitosamente");
        }catch (Exception e){
            System.out.println("el archivo no pudo ser eliminado ");
        }

    }

    public void copiarArchivo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa la ruta del archivo a copiar");
        String rutaOld = teclado.next(); //teclado.next lee lo que ingresamos
        Path archivoOld = Paths.get(rutaOld);
        System.out.println("ingresa la ruta del archivo nuevo");
        String rutaNew = teclado.next(); //teclado.next lee lo que ingresamos
        Path archivoNew = Paths.get(rutaNew);
        try {
            Files.copy(archivoOld,archivoNew, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("el archivo fue copiado ");
        }catch (Exception e){
            System.out.println("el archivo no pudo ser copiado");
        }

    }

}
