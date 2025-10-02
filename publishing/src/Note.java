public class Note {

    // Fields of the Note class
    protected int numberNote;
    private static int lastNumberNote = 0;
    protected String noteTitle;
    protected String authorNote;
    protected double numberAuthorsSheets;

    // Constructor with parameters for the Note class
    public Note(String noteTitle, String authorNote, double numberAuthorsSheets) {
        numberNote = ++lastNumberNote;
        this.noteTitle = noteTitle;
        this.authorNote = authorNote;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    // Second constructor with two authors
    public Note(String noteTitle, String author1Note, String author2Note, double numberAuthorsSheets) {
        numberNote = ++lastNumberNote;
        this.noteTitle = noteTitle;
        this.authorNote = author1Note + ", " + author2Note;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    // Third constructor with three authors
    public Note(String noteTitle, String author1Note, String author2Note, String author3Note, double numberAuthorsSheets) {
        numberNote = ++lastNumberNote;
        this.noteTitle = noteTitle;
        this.authorNote = author1Note + ", " + author2Note + ", " + author3Note;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    @Override // override redefines the method from the parent class
    public String toString() {
        String str = numberNote + " " + authorNote + " " + noteTitle + ", aut. pages: " + numberAuthorsSheets;
        return str;
    }

    // Getters
    public static int getLastNumberNote() {
        return lastNumberNote;
    }

    public int getNumberPages() {
        return (int) Math.round(numberAuthorsSheets * 40000 / 3700);
    }

    public String getAuthorNote() {
        return authorNote;
    }

    public int getNumberNote() {
        return numberNote;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public double getNumberAuthorsSheets() {
        return numberAuthorsSheets;
    }

    // Setters
    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public void setNumberAuthorsSheets(double numberAuthorsSheets) {
        this.numberAuthorsSheets = numberAuthorsSheets;
    }
}
