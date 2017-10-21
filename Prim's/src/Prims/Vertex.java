package Prims;

class Vertex {

    private int key;
    private boolean visited;

    public Vertex(int key) {
        this.key=key;
        visited=false;
    }
     
//    public void displayKey(){
//        System.out.print(key);
//    }

    
    public boolean isVisited(){
        return visited;
    }
    
    public void setVisited(){
        visited=true;
    }
     
}
