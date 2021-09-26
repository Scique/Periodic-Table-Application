import javax.swing.*;
import java.awt.*;
import static java.lang.Integer.parseInt;

public class maininterface {
    static String searchmode = "";
    static String answer = "";
    public static void main(String[] args){
        // Answer variable
        JLabel instructionlabel = new JLabel();

        // Declaring all the J stuff for searching for the element
        JFrame frame = new JFrame("Periodic Table Finder");

        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new GridLayout(0, 1));
        JPanel textfieldpanel = new JPanel();
        JPanel searchoptionspanel = new JPanel();
        JTextField textfield = new JTextField();
        textfield.setColumns(5);
        JButton searchbutton = new JButton("Search");
        JLabel description = new JLabel("Search by: ");
        JButton byatomicnumberz = new JButton("Atomic Number(Z)");
        JButton byelementname = new JButton("Element Name");
        JPanel querypanel = new JPanel();
        querypanel.setLayout(new GridLayout(0, 1));
        JLabel querydescription = new JLabel("Query answer: ");
        JLabel queryname = new JLabel();
        JLabel queryatomicnumber = new JLabel();
        JLabel queryrelativemass = new JLabel();
        JLabel querysymbol = new JLabel();
        querypanel.setVisible(false);


        Element[] elementarray = new Element[118];

        // Declaring all instances of Element
        elementarray[0] = new Element(1, "Hydrogen", 1.008, "H");
        elementarray[1] = new Element(2, "Helium", 4.0026, "He");
        elementarray[2] = new Element(3, "Lithium", 6.94, "Li");
        elementarray[3] = new Element(4, "Beryllium", 9.0122, "Be");
        elementarray[4] = new Element(5, "Boron", 10.81, "B");
        elementarray[5] = new Element(6, "Carbon", 12.011, "C");
        elementarray[6] = new Element(7, "Nitrogen", 14.007, "N");
        elementarray[7] = new Element(8, "Oxygen", 15.999, "O");
        elementarray[8] = new Element(9, "Fluorine", 18.998, "F");
        elementarray[9] = new Element(10, "Neon", 20.180, "Ne");
        elementarray[10] = new Element(11, "Sodium", 22.990, "Na");
        elementarray[11] = new Element(12, "Magnesium", 24.305, "Mg");
        elementarray[12] = new Element(13, "Aluminium", 26.982, "Al");
        elementarray[13] = new Element(14, "Silicon", 28.085, "Si");
        elementarray[14] = new Element(15, "Phosphorus", 30.974, "P");
        elementarray[15] = new Element(16, "Sulfur", 32.06, "Cl");
        elementarray[16] = new Element(17, "Chlorine", 35.45, "Cl");
        elementarray[17] = new Element(18, "Argon", 39.948, "Ar");
        elementarray[18] = new Element(19, "Potassium", 39.098, "K");
        elementarray[19] = new Element(20, "Calcium", 40.078, "Ca");
        elementarray[20] = new Element(21, "Scandium", 44.956, "Sc");
        elementarray[21] = new Element(22, "Titanium", 47.867, "Ti");
        elementarray[22] = new Element(23, "Vanadium", 50.942, "V");
        elementarray[23] = new Element(24, "Chromium", 51.996, "Cr");
        elementarray[24] = new Element(25, "Manganese", 54.938, "Mn");
        elementarray[25] = new Element(26, "Iron", 55.845, "Fe");
        elementarray[26] = new Element(27, "Cobalt", 58.933, "Co");
        elementarray[27] = new Element(28, "Nickel", 58.693, "Ni");
        elementarray[28] = new Element(29, "Copper", 63.546, "Cu");
        elementarray[29] = new Element(30, "Zinc", 65.38, "Zn");
        elementarray[30] = new Element(31, "Gallium", 69.723, "Ga");
        elementarray[31] = new Element(32, "Germanium", 69.723, "Ge");
        elementarray[32] = new Element(33, "Arsenic", 74.922, "As");
        elementarray[33] = new Element(34, "Selenium", 78.971, "Se");
        elementarray[34] = new Element(35, "Bromine", 79.904, "Br");
        elementarray[35] = new Element(36, "Krypton", 83.798, "Kr");
        elementarray[36] = new Element(37, "Rubidium", 39.098, "Rb");
        elementarray[37] = new Element(38, "Strontium", 87.62, "Sr");
        elementarray[38] = new Element(39, "Yttrium", 88.906, "Y");
        elementarray[39] = new Element(40, "Zirconium", 91.224, "Zr");
        elementarray[40] = new Element(41, "Niobium", 92.906, "Nb");
        elementarray[41] = new Element(42, "Molybdenum", 95.95, "Mo");
        elementarray[42] = new Element(43, "Technetium", 98, "Tc");
        elementarray[43] = new Element(44, "Ruthenium", 101.07, "Ru");
        elementarray[44] = new Element(45, "Rhodium", 102.91, "Rh");
        elementarray[45] = new Element(46, "Palladium", 106.42, "Pd");
        elementarray[46] = new Element(47, "Silver", 107.87, "Ag");
        elementarray[47] = new Element(48, "Cadmium", 112.341, "Cd");
        elementarray[48] = new Element(49, "Indium", 114.82, "In");
        elementarray[49] = new Element(50, "Tin", 118.71, "Sn");
        elementarray[50] = new Element(51, "Antimony", 121.76, "Sb");
        elementarray[51] = new Element(52, "Tellurium", 127.60, "Te");
        elementarray[52] = new Element(53, "Iodine", 126.50, "I");
        elementarray[53] = new Element(54, "Xenon", 131.29, "Xe");
        elementarray[54] = new Element(55, "Caesium", 132.92, "Cs");
        elementarray[55] = new Element(56, "Barium", 137.33, "Ba");
        elementarray[56] = new Element(57, "Lanthanum", 138.91, "La");
        elementarray[57] = new Element(58, "Cerium", 140.12, "Ce");
        elementarray[58] = new Element(59, "Praseodymium", 140.91, "Pr");
        elementarray[59] = new Element(60, "Neodymium", 144.24, "Nd");
        elementarray[60] = new Element(61, "Promethium", 145, "Pm");
        elementarray[61] = new Element(62, "Samarium", 150.26, "Pr");
        elementarray[62] = new Element(63, "Europium", 151.96, "Eu");
        elementarray[63] = new Element(64, "Gadolinium", 157.25, "Gd");
        elementarray[64] = new Element(65, "Terbium", 158.93, "Tb");
        elementarray[65] = new Element(66, "Dysprosium", 162.50, "Dy");
        elementarray[66] = new Element(67, "Holmium", 164.93, "Ho");
        elementarray[67] = new Element(68, "Erbium", 167.26, "Er");
        elementarray[68] = new Element(69, "Thulium", 168.93, "Tm");
        elementarray[69] = new Element(70, "Ytterbium", 173.05, "Yb");
        elementarray[70] = new Element(71, "Lutetium", 174.97, "Lu");
        elementarray[71] = new Element(72, "Hafnium", 178.49, "Hf");
        elementarray[72] = new Element(73, "Tantalum", 180.95, "Ta");
        elementarray[73] = new Element(74, "Tungsten", 183.84, "W");
        elementarray[74] = new Element(75, "Rhenium", 1886.21, "Re");
        elementarray[75] = new Element(76, "Osmium", 190.23, "Os");
        elementarray[76] = new Element(77, "Iridium", 192.22, "Ir");
        elementarray[77] = new Element(78, "Platinum", 195.08, "Pt");
        elementarray[78] = new Element(79, "Gold", 129.97, "Au");
        elementarray[79] = new Element(80, "Mercury", 200.59, "Hg");
        elementarray[80] = new Element(81, "Thallium", 204.38, "Tl");
        elementarray[81] = new Element(82, "Lead", 207.2, "Pb");
        elementarray[82] = new Element(83, "Bismuth", 208.98, "Bi");
        elementarray[83] = new Element(84, "Polonium", 209, "Po");
        elementarray[84] = new Element(85, "Astatine", 210, "At");
        elementarray[85] = new Element(86, "Radon", 222, "Rn");
        elementarray[86] = new Element(87, "Francium", 223, "Fr");
        elementarray[87] = new Element(88, "Radium", 226, "Ra");
        elementarray[88] = new Element(89, "Actinium", 227, "Ac");
        elementarray[89] = new Element(90, "Thorium", 232.04, "Th");
        elementarray[90] = new Element(91, "Protactinium", 231.04, "Pa");
        elementarray[91] = new Element(92, "Uranium", 238.03, "U");
        elementarray[92] = new Element(93, "Neptunium", 237, "Np");
        elementarray[93] = new Element(94, "Plutonium", 244, "Pu");
        elementarray[94] = new Element(95, "Americium", 243, "Am");
        elementarray[95] = new Element(96, "Curium", 247, "Cm");
        elementarray[96] = new Element(97, "Berkelium", 247, "Bk");
        elementarray[97] = new Element(98, "Californium", 251, "Cf");
        elementarray[98] = new Element(99, "Einsteinium", 252, "Es");
        elementarray[99] = new Element(100, "Fermium", 257, "Fm");
        elementarray[100] = new Element(101, "Mendelevium", 258, "Md");
        elementarray[101] = new Element(102, "Nobelium", 259, "No");
        elementarray[102] = new Element(103, "Lawrencium", 266, "Lr");
        elementarray[103] = new Element(104, "Rutherfordium", 267, "Rf");
        elementarray[104] = new Element(105, "Dubnium", 268, "Db");
        elementarray[105] = new Element(106, "Seaborgium", 269, "Sg");
        elementarray[106] = new Element(107, "Bohrium", 270, "Bh");
        elementarray[107] = new Element(108, "Hassium", 277, "Hs");
        elementarray[108] = new Element(109, "Meitnerium", 278, "Mt");
        elementarray[109] = new Element(110, "Darmstadtium", 281, "Ds");
        elementarray[110] = new Element(111, "Roentgenium", 282, "Rg");
        elementarray[111] = new Element(112, "Copernicium", 285, "Cn");
        elementarray[112] = new Element(113, "Nihonium", 286, "Nh");
        elementarray[113] = new Element(114, "Flerovium", 289, "Fl");
        elementarray[114] = new Element(115, "Moscovium", 290, "Mc");
        elementarray[115] = new Element(116, "Livermorium", 293, "Lv");
        elementarray[116] = new Element(117, "Tennessine", 294, "Ts");
        elementarray[117] = new Element(118, "Oganesson", 294, "Og");



        byatomicnumberz.addActionListener(e -> {
            searchmode = "z";
            instructionlabel.setText("Enter the atomic number: ");
            queryname.setText("");
            queryatomicnumber.setText("");
            queryrelativemass.setText("");
            querysymbol.setText("");
            frame.repaint();
            System.out.println("z");
        });
        byelementname.addActionListener(e -> {
            searchmode = "e";
            instructionlabel.setText("Enter the element name: ");
            queryname.setText("");
            queryatomicnumber.setText("");
            queryrelativemass.setText("");
            querysymbol.setText("");
            frame.repaint();
            System.out.println("e");
        });
        // Adding actions to the buttons
        searchbutton.addActionListener(e -> {
            // Write something here after doing the inside program
            if(searchmode.equals("e")){
                int i = 0;
                int w = 0;
                while(w == 0){
                    answer = elementarray[i].Searche(textfield.getText());
                    if(!answer.equals("Query not found")){
                        w = 1;
                        String[] answerarray = answer.split("&");
                        queryname.setText(answerarray[0]);
                        if(answerarray.length > 1){
                            queryatomicnumber.setText(answerarray[1]);
                            queryrelativemass.setText(answerarray[2]);
                            querysymbol.setText(answerarray[3]);
                        }
                    }
                    System.out.println(textfield.getText());
                    i += 1;
                }
            }
            if(searchmode.equals("z")){
                try{
                    int i = 0;
                    int w = 0;
                    while(w == 0){
                        answer = elementarray[i].Searchz(parseInt(textfield.getText()));
                        if(!answer.equals("Query not found")){
                            w = 1;
                        }
                        System.out.println(textfield.getText());
                        i += 1;
                    }
                }
                catch(Exception x){
                    System.out.println(x);
                    answer = "Query not found";
                }
                finally {
                    String[] answerarray = answer.split("&");
                    queryname.setText(answerarray[0]);
                    if(answerarray.length > 1){
                        queryatomicnumber.setText(answerarray[1]);
                        queryrelativemass.setText(answerarray[2]);
                        querysymbol.setText(answerarray[3]);
                    }
                }
            }
            querypanel.setVisible(true);
            frame.repaint();
        });




        // Setting them up
        frame.add(mainpanel);
        mainpanel.add(textfieldpanel);
        textfieldpanel.add(instructionlabel);
        textfieldpanel.add(textfield);
        textfieldpanel.add(searchbutton);
        mainpanel.add(searchoptionspanel);
        searchoptionspanel.add(description);
        searchoptionspanel.add(byatomicnumberz);
        searchoptionspanel.add(byelementname);
        mainpanel.add(querypanel);
        querypanel.add(querydescription);
        querypanel.add(queryname);
        querypanel.add(queryatomicnumber);
        querypanel.add(queryrelativemass);
        querypanel.add(querysymbol);
        frame.setVisible(true);
        frame.pack();

    }
}
