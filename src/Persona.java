import java.util.Date;

public class Persona {
    // Atributos para la clase Persona
    public String lastname1;
    public String name;
    public String lastname2;
    public Date dateBirth;
    public float height;
    private int dni;
    protected int gender;

    //constructor vacío para Persona
    public Persona(){   };

    //Constructor con atributos para Persona
    public Persona(String name, 
                    String lastname1, 
                    String lastname2, 
                    Date dateBirth, 
                    float height, 
                    int dni, 
                    int gender) {
        this.name = name;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.dateBirth = dateBirth;
        this.height = height; 
        this.dni = dni;
        this.gender = gender;
    }

      /**
       * Métodos (Setters y Getters) para los Atributos de la Clase Persona
       */
      
    //Metodo Set para el atributo name
    public void setName( String name) {
        this.name = name;
     }
    //Metodo get para el atributo name
    public String getName(){
         return name;
     }
    //Metodo get para el atributo lastName1
    public String getLastname1() {
        return lastname1;
    }
    //Metodo Set para el atributo lastName1
    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    //Metodo get para el atributo lastName2
    public String getLastname2() {
        return lastname2;
    }
    //Metodo Set para el atributo lastName2
    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    //Metodo get para el atributo dateBirth
    public Date getDateBirth() {
        return dateBirth;
    }
    //Metodo Set para el atributo dateBirth
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    //Metodo get para el atributo height
    public float getHeight() {
        return height;
    }
    //Metodo Set para el atributo height
    public void setHeight(float height) {
        this.height = height;
    }

    //Metodo get para el atributo dni
    public int getDni() {
        return dni;
    }
    //Metodo Set para el atributo dni
    public void setDni(int dni) {
        this.dni = dni;
    }

    //Metodo get para el atributo gender
    public int getGender() {
        return gender;
    }
    //Metodo Set para el atributo gender
    public void setGender(int gender) {
        this.gender = gender;
    }

      
}
