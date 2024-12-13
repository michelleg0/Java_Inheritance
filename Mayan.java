class Mayan extends Language {
    // Constructor for Mayan class
    public Mayan(String languageName, int speakers) {
        // Call the superclass constructor with specific values for Mayan languages
        super(languageName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        // Print the basic language information
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);

        // Add the fun fact about ergativity
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }
}