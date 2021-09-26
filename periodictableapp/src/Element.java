public class Element {
    int atomicnumber;
    String name;
    double relativemass;
    String elementsymbol;

    public Element(int atomicnumber, String name, double relativemass, String elementsymbol){
        this.atomicnumber = atomicnumber;
        this.name = name;
        this.relativemass = relativemass;
        this.elementsymbol = elementsymbol;
    }

    public String Searchz(int searchatomicnumber){
        if(searchatomicnumber == atomicnumber){
            return String.format("Element: %s &" +
                    "Atomic number(z): %s &" +
                    "Relative Mass Number: %s &" +
                    "Element Symbol: %s", name, atomicnumber, relativemass, elementsymbol);
        }
        else{
            return "Query not found";
        }
    }

    public String Searche(String element){
        if(name.equalsIgnoreCase(element)){
            return String.format("Element: %s &" +
                    "Atomic number(z): %s &" +
                    "Relative Mass Number: %s &" +
                    "Element Symbol: %s", name, atomicnumber, relativemass, elementsymbol);
        }
        else{
            return "Query not found";
        }
    }
}
