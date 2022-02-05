import java.util.ArrayList;

public class Fruta {
 
    // Atributos de la Clase Fruta
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    public boolean sweet;
    public String smell;
    
    // Constructor vacio para la Clase fruta
    public Fruta(){     };

    //Constructor lleno para la clase fruta
    public Fruta(String name, 
                 float averageWeight, 
                 ArrayList<String> colors, 
                 boolean sweet, 
                 String smell){
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
        this.sweet = sweet;
    }
    // Creacion de Metodos Setter & Getter
    // Metodo Get para el atributo name
    public String getName() {
        return name;
    }
    // Metodo Set para el atributo name
    public void setName(String name) {
        this.name = name;
    }

    // Metodo Get para el atributo averageweight
    public float getAverageWeight() {
        return averageWeight;
    }
    // Metodo Set para el atributo averageWeight
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    // Metodo get para el atributo colors
    public ArrayList<String> getColors() {
        return colors;
    }
    
    // Metodo set para el atributo colors
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    // Metodo Get para el atributo sweetnes
    public boolean isSweet() {
        return sweet;
    }
    // Metodo set para el atributo sweetnes
    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }
    // Metodo Get para el atributo smelll
    public String getSmell() {
        return smell;
    }
    // Metodo set para el atributo smell
    public void setSmell(String smell) {
        this.smell = smell;
    }

    
}
