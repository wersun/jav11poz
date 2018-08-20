package pl.sda.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private final String title;
    private final String author;
    private double price;
    private final String type;
    private double rating;

    public Book(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public Book(String title, String author, double price, String type, double rating) {
        this(title, author, type);
        this.price = price;
        this.rating = rating;
    }

//    public Book(String dataFromUser) {
//        String[] splittedData =dataFromUser.split(",");
//        if(splittedData.length == 3){
//            this.title = splittedData[0];
//            this.author = splittedData[1];
//            this.type = splittedData[2];
//        }else{
//            this.title = splittedData[0];
//            this.author = splittedData[1];
//            this.price = Double.parseDouble(splittedData[2]);
//            this.type = splittedData[3];
//            this.rating = Double.parseDouble(splittedData[4]);
//        }
//    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", rating=" + rating +
                '}';
    }
}
