package PrintEdition;

public class Schoolbook extends Book{
    String subject;
    int grade;

    public Schoolbook(String name, int quantityOfPages, int year, String author, String[] pagesIn, String subject, int grade) {
        super(name, quantityOfPages, year, author, pagesIn);
        this.subject = subject;
        this.grade = grade;
    }

}
