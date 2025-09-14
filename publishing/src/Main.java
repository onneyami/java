class Publishing {
    public static void main(String[] args) {
        System.out.println("Authors:");

        //создание экземпляра класса Author
        Author vasilev = new Author(
                "Vasilev", "Pavel", "Ivanovich",
                "MP2035648, got 18.05.2011",
                "c.Minsk, Vachecova street, h.45-79",
                "8(029)33-564-78-02"
        );

        System.out.println(vasilev.toString());

        String shortNameVasilev = vasilev.getShortName(
                vasilev.getSurname(),
                vasilev.getName(),
                vasilev.getSecondName()
        );

        System.out.println("Surname and initials: " + shortNameVasilev);

        System.out.println("\nPublished materials:");

        //создание двух экземпляров класса Note через конструктор с параметрами
        Note noteVasilev1 = new Note("Creating classes in Java", shortNameVasilev, 3.6);
        Note noteVasilev2 = new Note("NetBeans environment", shortNameVasilev, 2.8);

        System.out.println(noteVasilev1.toString());
        System.out.println("Number of pages " + noteVasilev1.getNumberPages());
        System.out.println(noteVasilev2.toString());
        System.out.println("Number of pages " + noteVasilev2.getNumberPages());

        //вызов метода getLastNumberNote() для получения подсчета количества опубликованных материалов
        System.out.println("\nNumber of published materials:" + Note.getLastNumberNote());

        //изменение автора и порядкового номера книги "Creating classes in Java"
        //noteVasilev1.numberNote = 20;
        //noteVasilev1.authorNote = "Petrov D.V.";
        //System.out.println(noteVasilev1.toString());

        noteVasilev1.setNoteTitle("Classes in Java");
        noteVasilev1.setNumberAuthorsSheets(3.5);
        System.out.println(noteVasilev1.toString());

        //проверка работы сеттеров класса Author
        vasilev.setPhoneNumber("8(029)44-564-78-02");
        System.out.println(vasilev.toString());
    }
}
