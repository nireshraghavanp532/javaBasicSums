import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloudInfrastructure{
    public static long getMinCost(int n,int k, List<List<Integer>>plans){

        List<Plan> planList = new ArrayList<>();
        for (List plan : plans) {
            Plan p = new Plan((int) plan.get(0), (int) plan.get(1), (int) plan.get(2), (int) plan.get(3));
            planList.add(p);
        }
        Collections.sort(planList,(a,b)->{return a.cost-b.cost;});
        int minCost=0;
        for(int i=1;i<=n;i++){
            int core=0;
            int rem=k;
            for(Plan p:planList){

                if(i>=p.start && i<=p.end && 0<rem ){
                    if(p.cores==rem){
                        core+=p.cores;
                        minCost+=p.cores*p.cost;
                        rem=0;
                    }
                    else if(p.cores<rem){
                        rem=rem-p.cores;
                        core+=p.cores;
                        minCost+=p.cores*p.cost;
                    }
                    else if(p.cores>rem){
                        core+=rem;
                        minCost+=rem*p.cost;
                        rem=0;

                    }


                }
            }
        }


        long a=minCost;
        return a;
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 4;
        List<List<Integer>> plans = List.of(
                List.of(1,4,4,5),
                List.of(1,4,2,5),
                List.of(1,2,2,1),
                List.of(2,3,3,2)
        );

        System.out.print(getMinCost(n,k,plans)) ;
    }
}
