/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.frankiegson.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.frankiegson.entidades.Ingrediente;
import mx.itson.frankiegson.entidades.Paso;
import mx.itson.frankiegson.entidades.Receta;
import mx.itson.frankiegson.entidades.Usuario;
import mx.itson.frankiegson.enumerador.Dificultad;

/**
 *
 * @author 
 */

public class Main {
    
     public static void main(String [] args){
         
         Receta receta = new Receta();
         receta.setNombre ("Frankie Brownie");
         receta.setDescripcion ("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
         receta.setNumPorciones(6);
         receta.setDuracion(62);
         receta.setDificultad(Dificultad.INTERMEDIO);
         
         List<Ingrediente> ingredientes = new ArrayList<>();
         Ingrediente ingrediente1 = new Ingrediente ();
         ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)\n");
         
         Ingrediente ingrediente2 = new Ingrediente ();
         ingrediente2.setNombre("3 Cucharadas de Agua");
         
         ingredientes.add(ingrediente1);
         ingredientes.add(ingrediente2);
         
         receta.setIngredientes(ingredientes);
         
         List <Paso> pasos = new ArrayList();
        
        Paso paso1 = new Paso ();
        paso1.setOrden(1);
        paso1.setDescripcion("Horno precalentado a 180 °C");
        pasos.add(paso1);
        
        Paso paso2 = new Paso ();
        paso1.setOrden(2);
        paso1.setDescripcion("Mezcla la harina para brownies chocolate Fudge de Betty Crocker® con el agua, el aceite y los huevos. Vierte la mezcla en un molde cuadrado de 30 x 20 cm previamente en harinado y hornea a 180 °C durante 25 minutos. Retira del horno y enfría");
        pasos.add(paso2);
        
        Paso paso3 = new Paso ();
        paso1.setOrden(3);
        paso1.setDescripcion("Bate el queso crema con la Leche Condensada LA LECHERA®, la ralladura de limón, la mantequilla y un poco de colorante hasta integrar por completo y refrigera por 20 minutos.");
        pasos.add(paso3);
        
        Paso paso4 = new Paso ();
        paso1.setOrden(4);
        paso1.setDescripcion("Desmolda y corta en cuadros. Unta los brownies con un poco de betún; dibuja el cabello y la boca con el chocolate fundido, coloca los ojos de azúcar y la nariz con las lunetas. Ofrece.");
        pasos.add(paso4);
        
        receta.setPasos(pasos);
         
         receta.setDificultad(Dificultad.LEGENDARIO);
         
         System.out.println("--RECETA NESTLE--");
         System.out.println("Receta subida por: " + receta.getUsuario());
         System.out.println("Nombre de receta");
         System.out.println(receta.getNombre());
         System.out.println("Descripcion de la receta");
         System.out.println(receta.getDescripcion());
         System.out.print("Numero de porciones: " + receta.getNumPorciones());

         System.out.println("Ingredientes de la receta");
         for (Ingrediente i : receta.getIngredientes()){
         System.out.println(i.getNombre());
         }
         
         System.out.println("Ingredientes de la receta");
         for (Paso b : receta.getPasos()){
         System.out.println(b.getOrden());
         }
         
         Usuario usuario = new Usuario();
         usuario.setNombre("Jorge Espejel");
         usuario.setEmail("eljorgeespejel@gmail.com");
         usuario.setContra("");
         
         receta.setUsuario(usuario);
     }
}
