package PrintEdition;

public class Fiction extends Book{
    String genre;

    public Fiction(String name, int quantityOfPages, int year, String author, String[] pagesIn, String genre) {
        super(name, quantityOfPages, year, author, pagesIn);
        this.genre = genre;
    }

}
