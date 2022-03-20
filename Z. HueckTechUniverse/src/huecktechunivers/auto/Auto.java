package huecktechunivers.auto;

public class Auto {

    private String Standort = "Heinsberg";
    private String [][] Länder = {
            // A
            {"Abchasien", "Afghanistan", "Ägypten", "Albanien", "Algerien", "Andorra", "Angola", "Anguilla",
                    "Antarktis", "Antigua", "Äquatorialguinea", "Argentinien", "Arktis", "Armenien", "Aruba",
                    "Aserbaidschan", "Äthiopien", "Australien", "Azoren"},
            //B
            {"Bahamas", "Bahrain", "Bangladesch", "Barbados", "Belarus", "Belgien", "Belize", "Benin", "Bhutan",
                    "Bolivien", "Bosnien und Herzegowina", "Botsuana", "Brasilien", "Brunei", "Bulgarien",
                    "Burkina Faso", "Birma/Burma", "Burundi", "Barbuda"},
            //C
            {"Chile", "China", "Cookinseln", "Costa Rica"},
            //D
            {"Dänemark", "Demokratische Republik Kongo", "Deutschland", "Dominica", "Dominikanische Republik",
                    "Dschibuti"},
            //E
            {"Ecuador", "Elfenbeinküste", "El Salvador", "Eritrea", "Estland", "Eswatini"},
            //F
            {"Falklandinseln", "Fidschi", "Finnland", "Föderierte Staaten von Mikronesien", "Frankreich",
                    "Französisch-Polynesien", "Französisch-Guayana"},
            //G
            {"Gabun", "Gambia", "Georgien", "Ghana", "Grenada", "Griechenland", "Großbritannien", "Grönland",
                    "Guadeloupe", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana"},
            //H
            {"Haiti", "Honduras"},
            //I
            {"Indien", "Indonesien", "Irak", "Iran", "Irland", "Island", "Israel", "Italien"},
            //J
            {"Jamaika", "Japan", "Jemen", "Jordanien"},
            //K
            {"Kambodscha", "Kamerun", "Kanada", "Kap Verde", "Kasachstan", "Katar", "Kenia", "Kirgisistan", "Kiribati",
                    "Kolumbien", "Komoren", "Kongo (Republik)", "Kroatien", "Kuba", "Kuwait", "Kosovo"},
            //L
            {"Laos", "Lesotho", "Lettland", "Libanon", "Liberia", "Libyen", "Liechtenstein", "Litauen", "Luxemburg"},
            //M
            {"Madagaskar", "Madeira", "Malawi", "Malaysia", "Malediven", "Mali", "Malta", "Marokko", "Marshallinseln",
                    "Martinique", "Mauretanien", "Mauritius", "Mexiko", "(Föderierte Staaten von) Mikronesien",
                    "Moldau", "Monaco", "Mongolei", "Montenegro", "Mosambik", "Myanmar"},
            //N
            {"Namibia", "Nauru", "Nepal", "Neuseeland", "Nicaragua", "Niederlande", "Niederländische Antillen", "Niger",
                    "Nigeria", "Nordkorea", "Nordmazedonien", "Nordzypern", "Norwegen"},
            //O
            {"Oman", "Österreich", "Osttimor"},
            //P
            {"Pakistan", "Palau", "Palästina", "Panama", "Papua-Neuguinea", "Paraguay", "Peru", "Philippinen", "Polen",
                    "Portugal", "Puerto Rico",},
            //R
            {"Réunion", "Ruanda", "Rumänien", "Russland"},
            //S
            {"Saint Kitts und Nevis", "Saint Lucia", "Saint Pierre und Miquelon", "Saint Vincent und die Grenadinen",
                    "Salomonen", "Sambia", "Samoa", "San Marino", "São Tomé und Príncipe", "Saudi-Arabien", "Schweden",
                    "Schweiz", "Senegal", "Serbien", "Seychellen", "Sierra Leone", "Singapur", "Simbabwe", "Slowakei",
                    "Slowenien", "Somalia", "Spanien", "Sri Lanka", "Südafrika", "Sudan", "Südkorea", "Südsudan",
                    "Suriname", "Syrien"},
            //T
            {"Tadschikistan", "Taiwan", "Tansania", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad und Tobago",
                    "Tschad", "Tschechien", "Tunesien", "Türkei", "Turkmenistan", "Tuvalu"},
            //U
            {"Uganda", "Ukraine", "Ungarn", "USA", "Uruguay", "Usbekistan"},
            //V
            {"Vanuatu", "Vatikan", "Venezuela", "Vereinigte Arabische Emirate", "Vereinigtes Königreich",
                    "Vereinigte Staaten von Amerika", "Vietnam"},
            //W
            {"Wallis und Futuna", "Westsahara"},
            //Z
            {"Zentralafrikanische Republik", "Zypern"}
    };
    private String[][] URIforColors = {
            //Allgemein
            {
                    "schwarz", "grau", "rot", "weiß"
            },
            //G-Klasse
            {
                    "https://i.auto-bild.de/ir_img/2/7/1/9/9/0/5/B-B-Mercedes-G-Klasse-474x316-b1849872afc1d2a0.jpg",
                    "https://www.mercedes-benz.de/passengercars/mercedes-benz-cars/models/g-class/suv-w463/amg/comparison-slider/_jcr_content/comparisonslider/par/comparisonslide_1811252670/exteriorImage.MQ6.12.20190926115731.jpeg",
                    "https://media0.faz.net/ppmedia/aktuell/technik-motor/392790394/1.5592508/format_top1_breit/der-urige-g-erfreut-sich-einer.jpg",
                    "https://www.evocars-magazin.de/wp-content/uploads/2019/05/Mercedes-AMG-G-63-im-Test-9.jpg"
            },
            //A-Klasse
            {
                    "https://cdn.motor1.com/images/mgl/o6m6L/s4/mercedes-amg-a-45-s-mit-h-r-sportfedern.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYiRmW5EnyRikPCzGv2G0kRlwJWJIJbjckEQ&usqp=CAU",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwss4SPlJOG8j5vxadQ282bd8Zf4UPUqoA3w&usqp=CAU",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1Nke3Vdqq88hOKtovN82gZcrjyVcYuGqXhA&usqp=CAU",
            },
            //E-Klasse
            {
                    "https://www.meinauto.de/pics/wpimages/2018/04/mercedes-e-klasse-limousine-2018-ausen.jpg",
                    "https://i.auto-bild.de/mdb/extra_large/37/w213-7b2.jpg",
                    "https://www.autozeitung.de/assets/styles/article_image/public/field/image/mercedes-amg-e-63-coupe-_1_-1.jpg?itok=bfE2pecW",
                    "https://auto-motor.at/Auto/Neuwagen/Automarken-Automodelle-Neuigkeiten/Mercedes-News/Mercedes-AMG-E-Klasse-T-Modell/Neu-Mercedes-AMG-E-63-4Matic-T-Modell-001.jpg?v=1486108984&version=full",
            }

    };
    private int TankfüllungAktuell = 0;
    private int MöglicheTankfüllung = 0;
    private double Verbrauch100KM = 0;
    private String AutoType = "Not defined";
    private String Farbe = "Schwarz";
    private int Schaden = 0;
    private int Radio = 0; //O = Aus, 1 = Ein
    private String RadioSender = "Non";

    public Auto(){
    }

    // --------------------------- SETTER -----------------------------------------
    public void setMöglicheTankfüllung(int möglicheTankfüllung) {MöglicheTankfüllung = möglicheTankfüllung;}

    public void setFarbe(String farbe) {Farbe = farbe;}

    public void setVerbrauch100KM(double verbrauch100KM) {Verbrauch100KM = verbrauch100KM;} //In Liter

    public void setAutoType(String autoType) {AutoType = autoType;}

    public void setRadio(int radio) {
        Radio = radio; //0 = Aus, 1 = Ein
    }

    public void setSchaden(int schaden) {
        Schaden = schaden;
    }

    // -------------------------- GETTER -------------------------------------------
    public String getAutoType() {return AutoType;}

    public int getMöglicheTankfüllung() {return MöglicheTankfüllung;}

    public String getFarbe() {
        return Farbe;
    }

    public int getTankfüllungAktuell() {
        return TankfüllungAktuell;
    }

    public int getSchaden() {
        return Schaden;
    }

    public int getRadio() {
        return Radio;
    }

    public boolean isAutoDefined() {
        boolean isAutoDefined = false;
        if (Verbrauch100KM != 0 && !AutoType.equals("Not defined") && MöglicheTankfüllung != 0){
            isAutoDefined = true;
        }
        return isAutoDefined;
    }



}


