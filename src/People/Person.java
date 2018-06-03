package People;

public class Person {

    protected String name=null;
    protected String lastName=null;

    public String getName()
    {
        return this.name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }
}

