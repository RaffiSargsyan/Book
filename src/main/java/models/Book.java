package models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String title;

    private Author author;

    private double price;

    private int count;
    private String gener;



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author.getName() + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", gener='" + gener + '\'' +
                '}';
    }
}
