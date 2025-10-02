public class Contents {
    private Note[] notes; // array of articles
    // two-dimensional array of page numbers (table of contents)
    private int[][] pageNumberNote;
    private int numberPage;

    // Constructor for creating the journal contents
    public Contents(Note[] notes) {
        this.notes = notes;
        pageNumberNote = new int[notes.length][2];
        createContents(notes);
    }

    // Method for generating the table of contents
    public void createContents(Note[] notes) {
        int i;
        // Clear the table of contents
        for (i = 0; i < notes.length; i++) {
            pageNumberNote[i][0] = 0;
            pageNumberNote[i][1] = 0;
        }

        numberPage = 3;
        i = 0;
        while (notes[i] != null) {
            pageNumberNote[i][0] = numberPage;
            pageNumberNote[i][1] = notes[i].getNumberPages();
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
        while (notes[i] != null) {
            str += "\n" + (i + 1) + " " + notes[i].getAuthorNote() + " " + notes[i].getNoteTitle() + "\t" + pageNumberNote[i][0];
            i++;
        }
        return str;
    }
}
