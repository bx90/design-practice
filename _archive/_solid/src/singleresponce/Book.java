package singleresponce;

public class Book implements BookMaster {

    private String name;
    private int pageNumber;
    private BookAction bookAction;

    Book(String name, int pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.bookAction = new BookAction();

    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public void save() {
        bookAction.save(this);
    }
}
