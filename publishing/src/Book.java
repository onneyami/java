public class Book extends Note {  // extends means inheritance from Note
    private String publishingHouse;
    private String publishingLocation;
    private int publishingYear;
    private int numberPage;

    // Constructor for creating a book
    public Book(String noteTitle, String authorNote, double numberAuthorsSheets, String publishingHouse, String publishingLocation, int publishingYear) {
        super(noteTitle, authorNote, numberAuthorsSheets); // super calls the parent constructor
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    // Constructor for creating a book with 2 authors
    public Book(String noteTitle, String author1Note, String author2Note, double numberAuthorsSheets, String publishingHouse, String publishingLocation, int publishingYear) {
        super(noteTitle, author1Note, author2Note, numberAuthorsSheets);
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    // Constructor for creating a book with 3 authors
    public Book(String noteTitle, String author1Note, String author2Note, String author3Note, double numberAuthorsSheets, String publishingHouse, String publishingLocation, int publishingYear) {
        super(noteTitle, author1Note, author2Note, author3Note, numberAuthorsSheets);
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    // Method that generates info about the list
    @Override
    public String toString() {
        String str = numberNote + " " + authorNote + " " + noteTitle + ". - " + publishingLocation + ".: " + publishingHouse + ", " + publishingYear + ".- " + numberPage + " p.";
        return str;
    }

    // Getters
    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getPublishingLocation() {
        return publishingLocation;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    // Setters
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
