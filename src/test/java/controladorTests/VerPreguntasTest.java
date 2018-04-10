/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controladorTests;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import controlador.*;
import modelo.Pregunta;
//import controlador.*;

/**
 *
 * @author Alan
 */
public class VerPreguntasTest {

    public VerPreguntasTest() {
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void hello() {
         VerPreguntas ver =  new VerPreguntas();
         ver.ver();
         for(int i = 0;i<30;i++){
            for(Pregunta a:ver.getPreguntas()){
                System.out.println(a.getContenido());
            }
         }
     }
}
