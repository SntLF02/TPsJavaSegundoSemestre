package Motores;

import java.util.ArrayList;
import java.util.Iterator;

public class NuevoEjecutable {

    public static void main(String[] args) {


        MotorPrincipal mp1 = new MotorPrincipal(2000);
        Driver dr1 = new Driver(mp1);

        PathAgent pa1 = new PathAgent(dr1);

        ColisionCensor cc1 = new ColisionCensor("primer cc");
        ColisionCensor cc2 = new ColisionCensor("segundo cc");

        Cost cost1 = new Cost(123,pa1,cc1);
        Cost cost2 = new Cost(12334,pa1,cc2);


        ArrayList<Cost> asociativas = new ArrayList<>();

        asociativas.add(mostrarAsociativa(pa1,cc1));
        asociativas.add(mostrarAsociativa(pa1,cc2));

        Iterator<Cost> it = asociativas.iterator();
        while (it.hasNext()){

        }



    }

    public static Cost mostrarAsociativa(PathAgent pa, ColisionCensor cc){
        Cost cost = new Cost(12334,pa,cc);

        System.out.println("en Cost asociativa se asocian");
        System.out.println("Cost.PathAgent.Driver: "+ cost.getReceptor().Receptor);
        System.out.println("Cost.ColisionCensor.String: " + cost.getCensor().Colision);
        return cost;
    }


}
