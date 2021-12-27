public class Fruit {

    private String name;
    private String colour;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Fruit(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    // copy constructor
    Fruit(Fruit fruit){
        this.name = fruit.name;
        this.colour = fruit.colour;
    }

    //override the 'toString' function.
    @Override
    public String toString() {
        return name + "(" + colour + ")";
    }

    //override the 'equals' function to return true if the names of the fruit are the same
    @Override
    public boolean equals(Object o) {
        // an object must equal itself
        if (o == this)
            return true;
        // no object equals null
        if (this == null)
            return false;
        // objects of different types are never equal
        if (this.getClass() != o.getClass())
            return false;
        // cast to a fruit, then compare the fields
        Fruit fruit = (Fruit) o;
        return this.name.equals(fruit.getName()) && this.colour.equals(fruit.getColour());
    }
}
