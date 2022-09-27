/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.franky.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.franky.entidades.Ingrediente;
import mx.itson.franky.entidades.Receta;
import mx.itson.franky.enumerador.Dificultad;

/**
 *
 * @author My Pc
 */

public class Main {
    
     private static void main(String [] arg){
         
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
         
         //agregar pasos
         //no los agregue 
         
         receta.setIngredientes(ingredientes);
     }
}
