package smg;

public class Book{
    private int pagesCount;
    private String title;
    private Author author;
    private String publisher;
    private String coverColor;
    private double price;

    public Book(){
        this.title="Unknown title";
        this.author=new Author();
        this.publisher="Unknown publisher";
        this.coverColor="Unknown color";
        this.pagesCount=0;
        this.price=0;
    }
    public Book(int pagesCount,String title,Author author,String publisher,String coverColor,double price){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.coverColor=coverColor;
        this.pagesCount=pagesCount;
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public Author getAuthor(){
        return author;
    }
    public void setAuthor(Author author){
        this.author=author;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPagesCount() {
        return pagesCount;
    }
    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getCoverColor() {
        return coverColor;
    }
    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}