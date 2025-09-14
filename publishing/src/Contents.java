public class Contents {
    private Note notes []; //массив статей
    //двумерный массив номеров страниц (оглавление)
    private int pageNumberNote [] [];
    private int numberPage;

    //конструктор для создания содержания журнала
    public Contents(Note[] notes) {
        this.notes = notes;
        pageNumberNote = new int [notes.length] [2];
        createContents(notes);
    }

    //метод формирования оглавления
    public void createContents(Note[] notes) {
        int i;
        //очистка оглавления
        for (i = 0; i < notes.length; i++){
            pageNumberNote[i][0] = 0;
            pageNumberNote[i][1] = 0;
        }

        numberPage = 3;
        i = 0;
        while (notes[i] != null) {
            pageNumberNote[i][0] = numberPage;
            pageNumberNote[i][1] = notes [i].getNumberPages();
            numberPage += pageNumberNote[i][1];
            i++;
        }
    }

    public int getNumberPages() {
        return numberPage - 1;
    }

    @Override
    public String toString() {
        String str = "\nContent:";
        int i = 0;
        while (notes[i] != null){
            str += "\n" + (i+1) + " " + notes[i].getAuthorNote() + " " + notes[i].getNoteTitle() + "\t" + pageNumberNote[i][0];
            i++;
        }
        return str;
    }
}
