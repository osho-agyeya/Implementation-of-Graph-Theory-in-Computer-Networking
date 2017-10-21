package Prims;

import java.util.*;

public class PrimsApp {
    
    public static void main(String[] args) {        
        Scanner inp=new Scanner(System.in);
        int posStart;
        //System.out.println("The following program demonstrates Minimum Spanning Tree using Prim's algorithm:-\n\n\n**********INPUT**********\n\n");
        //System.out.print("Please enter the no. of vertices:");
        int n=inp.nextInt();
        //System.out.println("\n");
        Prims thePrims=new Prims(n);
        //System.out.println("\n");
        Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < n; i++) {
            //System.out.print("Enter the key for vertex "+(i+1)+":");
            //int a=inp.nextInt();
            thePrims.addVertex(i+1);
            m.put(i+1, i);
        }
        //System.out.println();
        //System.out.print("\nPlease enter the no. of edges:");
        int n2=inp.nextInt();
        //System.out.println("\n");
        for (int i = 0; i < n2; i++) {
            //System.out.print("Please enter first vertex key for edge "+(i+1)+":");
            int v1=inp.nextInt();
            //System.out.print("Please enter second vertex key for edge "+(i+1)+":");
            int v2=inp.nextInt();
            //System.out.print("Please enter the weight of the edge:");
            int w=inp.nextInt();
            thePrims.addEdge(m.get(v1),m.get(v2),w);  
            //System.out.println();
        }
        //System.out.print("Please enter the key of starting vertex:");
        int start=inp.nextInt();
        posStart=m.get(start);
        System.out.println(thePrims.mst(posStart));     
    }
    
}