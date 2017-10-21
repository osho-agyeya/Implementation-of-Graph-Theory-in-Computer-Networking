package Prims;

class Vertex {

    private char key;
    private boolean visited;

    public Vertex(char key) {
        this.key=key;
        visited=false;
    }
     
    public void displayKey(){
        System.out.print(key);
    }
    
    public boolean isVisited(){
        return visited;
    }
    
    public void setVisited(){
        visited=true;
    }
     
}
