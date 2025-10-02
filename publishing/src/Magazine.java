public class Magazine {
    private String magazineTitle;
    private int numberMagazine;
    private int publishingYear;
    private Note[] notes; // array of articles
    private String publishingHouse;
    private String publishingLocation;
    private int numberPage;
    private Contents contents;

    // Constructor for creating a magazine
    public Magazine(String magazineTitle, int numberMagazine, int publishingYear, Note[] notes, String publishingHouse, String publishingLocation) {
        this.magazineTitle = magazineTitle;
        this.numberMagazine = numberMagazine;
        this.publishingYear = publishingYear;
        this.notes = notes;
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;

        // Generate table of contents
        contents = new Contents(notes);
    }

    // Method that generates magazine info
    @Override
    public String toString() {
        String str = "Magazine " + magazineTitle + " № " + numberMagazine + " " + publishingYear + ". - " + publishingLocation + ".: " + publishingHouse;
        str += contents.toString();
        return str;
    }

    // Getters
    public String getMagazineTitle() {
        return magazineTitle;
    }

    public int getNumberMagazine() {
        return numberMagazine;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Note[] getNodes() {
        return notes;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getPublishingLocation() {
        return publishingLocation;
    }

    public int getNumberPage() {
        numberPage = contents.getNumberPages();
        return numberPage;
    }

    // Setters
    public void setNotes(Note[] notes) {
        this.notes = notes;
        contents.createContents(notes);
    }
}
