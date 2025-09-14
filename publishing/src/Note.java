public class Note {

    //поля класса Note
    protected int numberNote;
    private static int lastNumberNote = 0;
    protected String noteTitle;
    protected String authorNote;
    protected double numberAuthorsSheets;

    //конструктор с параметрами класса Note
    public Note(String noteTitle, String authorNote, double numberAuthorsSheets) {
        numberNote = ++lastNumberNote;
        this.noteTitle = noteTitle;
        this.authorNote = authorNote;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    //второй конструктор с двумя авторами
    public Note(String noteTitle, String author1Note, String author2Note, double numberAuthorsSheets) {
        numberNote = ++lastNumberNote;
        this.noteTitle = noteTitle;
        this.authorNote = author1Note + ", " + author2Note;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    //третий конструктор с тремя авторами
    public Note(String noteTitle, String author1Note, String author2Note, String author3Note, double numberAuthorsSheets) {
        numberNote = ++lastNumberNote;
        this.noteTitle = noteTitle;
        this.authorNote = author1Note + ", " + author2Note + ", " + author3Note;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    @Override //override переопределяет метод родительского класса
    public String toString() {
        String str = numberNote + " " + authorNote + " " + noteTitle + ", aut. pages: " + numberAuthorsSheets;
        return str;
    }

    //геттеры
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

    //сеттеры

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public void setNumberAuthorsSheets(double numberAuthorsSheets) {
        this.numberAuthorsSheets = numberAuthorsSheets;
    }
}
