package lambdaExample;

import java.util.*;
import java.util.stream.*;



public class TareaLambda{



    public final static int MAX = 80;

    public final static int MIN = 80;

    public static void main(String args[]){
    	TareaLambda tarea = new TareaLambda();
    	 VectorOperation productoPunto = (Vector a, Vector b) -> a.getX()*b.getX() + b.getY()*a.getY();
    	 VectorOperation distancia = (Vector a, Vector b) -> (int)Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
    	 Vector origen = new Vector(0,0);
    	 Vector punto = new Vector(3,4);
    	 System.out.println(tarea.operaVectores(origen,punto,productoPunto));
    	 System.out.println(tarea.operaVectores(origen,punto,distancia));
    }

    public int operaVectores(Vector a, Vector b, VectorOperation op) {
    	return op.operation(a,b);
    }
    
    public interface VectorOperation {
        int operation(Vector a, Vector b);
     }

}