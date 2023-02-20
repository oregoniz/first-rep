package PrintEdition;

public class Book extends PrintEdition {
    int quantityOfPages;
    int year;
    String author;
    String[] pages;

    public Book(String name, int quantityOfPages, int year, String author, String[] pagesIn) {
        super(name);
        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;
        pages = new String[quantityOfPages+1];
        this.pages[0] = name+","+author;
        System.arraycopy(pagesIn, 0, this.pages, 1, pagesIn.length);
    }

    public String getPage(int n) {
        return pages[n + 1];
    }
}
