public class Book extends Note{  //extends означает наследование от Note
    private String publishingHouse;
    private String publishingLocation;
    private int publishingYear;
    private int numberPage;

    //конструктор для создания книги
    public Book(String noteTitle, String authorNote, double numberAuthorsSheets, String publishingHouse, String publishingLocation, int publishingYear) {
        super(noteTitle, authorNote, numberAuthorsSheets); //super вызывает родительский конструктор
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    //конструктор для создания книги с 2 авторами
    public Book(String noteTitle, String author1Note, String author2Note, double numberAuthorsSheets, String publishingHouse, String publishingLocation, int publishingYear) {
        super(noteTitle, author1Note, author2Note, numberAuthorsSheets);
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    //конструктор для создания книги с 3 авторами
    public Book(String noteTitle, String author1Note, String author2Note, String author3Note, double numberAuthorsSheets, String publishingHouse, String publishingLocation, int publishingYear) {
        super(noteTitle, author1Note, author2Note, author3Note, numberAuthorsSheets);
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    //метод формирующий инфу о списке
    @Override
    public String toString() {
        String str = numberNote + " " + authorNote + " " + noteTitle + ". - " + publishingLocation + ".: " + publishingHouse + ", " + publishingYear + ".- " + numberPage + " p.";
        return str;
    }

    //геттеры
    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getPublishingLocation() {
        return publishingLocation;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    //сеттеры
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
