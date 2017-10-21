package Prims;

import java.util.*;

public class Prims {

    private int arr[][];
    private Vertex vertexList[];
    private int nVerts;

    public Prims(int n) {
        vertexList = new Vertex[n];
        arr = new int[n][n];
        nVerts = 0;
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], -1);
        }
    }

    public void addVertex(int a) {
        Vertex v = new Vertex(a);
        vertexList[nVerts++] = v;
    }

    public void addEdge(int v1, int v2, int w) {
        if(arr[v1][v2]!=-1 && w>arr[v1][v2]) return;
        arr[v1][v2] = w;
        arr[v2][v1] = w;
    }

    public int mst(int posStart) {
        int count=0;
//        System.out.println("\n\n**********OUTPUT**********\n\n");
//        System.out.println("The MST is:-\n");
//        System.out.println("   Edge   "+"   Weight  ");
        vertexList[posStart].setVisited();
        int reach = 1, pos1 = 0, pos2 = 0;
        while (reach != nVerts) {
            int dis = Integer.MAX_VALUE;
            for (int i = 0; i < nVerts; i++) {
                if (vertexList[i].isVisited()) {
                    for (int j = 0; j < nVerts; j++) {
                        if (i != j && !vertexList[j].isVisited() && arr[i][j] != -1) {
                            if (arr[i][j] < dis) {
                                dis = arr[i][j];
                                pos1 = i;
                                pos2 = j;
                            }
                        }
                    }
                }
            }
            vertexList[pos2].setVisited();
            //vertexList[pos1].displayKey();
            //System.out.print(" ---- ");
            //vertexList[pos2].displayKey();
            //System.out.println("       " + arr[pos1][pos2]);
            count+=arr[pos1][pos2];
            reach++;
        }
        return count;
    }

}
