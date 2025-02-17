class  Reader {
    String FIO;
    int number_tickets;
    String faculty;
    String birth_date;
    String telephone;

    Reader(String FIO,int number_tickets,String faculty,String birth_date,String telephone){
        this.FIO=FIO;
        this.number_tickets=number_tickets;
        this.faculty=faculty;
        this.birth_date=birth_date;
        this.telephone=telephone;
    }
    void takeBook(int number_books){
        System.out.println(FIO + "взял(а) " + number_books + " книг(и) ");
    }
    void takeBook(String name_book){
        System.out.println(FIO + " взял(а) " + name_book);
    }
    void returnBook(String name_book1){
        System.out.println(FIO + " вернул(а) книгу(и) "+ name_book1);
    }
    void returnBook(int number_boos1){
        System.out.println(FIO+ " вернул(а) " + number_boos1 +" книгу(и)");
    }
}
public class Main {
    public static void main(String[] args) {
        Reader[] student = new Reader[5];
        student[0] = new Reader("Абрамов М.Б.", 97, "тренер", "26.03.2001", "236-154");
        student[1] = new Reader("Виноградов Е.И.", 92, "инженер", "17.04.2003", "536-154");
        student[2] = new Reader("Кагарлицкий Д.С.", 9, "архитектор", "01.08.1989", "514-458");
        student[3] = new Reader("Кульбаков И.Е", 35, "кондитер", "18.09.1996", "348-557");
        student[4] = new Reader("Фирстов В.А.", 10, "программист", "19.06.2001", "452-265");
        student[0].takeBook(3);
        student[0].takeBook("Словарь, Азбука, Философия");
        student[0].returnBook(3);
        student[0].returnBook("Словарь, Азбука, Философия");
    }
}