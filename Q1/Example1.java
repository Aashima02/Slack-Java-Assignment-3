public class Example1
{
    public static void main(String[] args)
    {
        Novel MyBook = new Novel();
        System.out.print("The title is: ");
        MyBook.setTitle("A tale of two cities");
        System.out.print(MyBook.getTitle());
    }
}
