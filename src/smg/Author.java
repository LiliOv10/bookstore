package smg;


public class Author {
    private String name;
    private int booksCount;
    private boolean istBestSeller;

    public Author(){
    }

    public Author(String name,int booksCount,boolean istBestSeller){
        this.name=name;
        this.booksCount=booksCount;
        this.istBestSeller=istBestSeller;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBooksCount() {
        return booksCount;
    }
    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    public boolean isIstBestSeller() {
        return istBestSeller;
    }
    public void setIstBestSeller(boolean istBestSeller) {
        this.istBestSeller = istBestSeller;
    }
}