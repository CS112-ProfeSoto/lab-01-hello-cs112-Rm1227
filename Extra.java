//function of Extra.java is to define names and set up for calling in main, also has a block that checks for name equivelancy
public class Extra {
    private String name;  //single instance variable marked here
    public Extra() {  //constructor with no arguments
        this.name = "";
    }
    public Extra(String name) { //constructor that builds and intitializes "name"
        this.name = name;
    }
     public String toString() { //usage of tostring method
        return "Extra{name='" + name + "'}";
    }
    public void setName(String name) {  // mutator allowing name changes after construction
        this.name = name;
    }
    public String getName() { // accessor, allows the name value ot be read (accessed)
        return this.name;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Extra)) return false; //block that logically checks for whether or not the values in the name field are quivelant or not and prints that when called on in the main class
        Extra other = (Extra) obj;
        if (name == null) {
            return other.name == null;
        }
        return name.equals(other.name);
    }
}

