package pl.sda.Weather_OP;

public class Book {
    private Integer  pages;
    private String name;

    public Book(){

    }

    public Book(Integer pages, String name) {
        this.pages = pages;
        this.name = name;
    }
    public Integer getPages(){
        return pages;
    }
    public void setPages(Integer pages){
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
