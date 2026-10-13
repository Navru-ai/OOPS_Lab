import java.util.*;
class Book
{
int Book_ID , Price;
String Title, Author;

static int bookcount = 0;
static Book costlierbook = null;
Book(int Book_ID, int Price, String Title, String Author)
{
this.Book_ID = Book_ID;
this.Price = Price;
this.Title = Title;
this.Author = Author;
bookcount++;
if(costlierbook == null || Price > costlierBook.Price)
{
costlierbook = this;
}
void Book(Book ob)
{
Book_ID = ob.Book_ID;
Price = ob.Price;
Title = ob.Title;
Author = ob.Author;

}
void display()
{
System.out.println("Book ID is: " + " " + (Book_ID));
System.out.println("Price of the book is: " + " " + (Price));
System.out.println("Title of the book is: " +" " + (Title));
System.out.println("Author of the book is: " + " " + (Author));
}
void search(int Book_ID)
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter Book ID: " + " " );
int b1_id = sc.nextInt();
if (b1_id == (Book_ID))
System.out.println("Book found!");
else
System.out.println("Book not found!");
}


void search(String Title)
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter Title of the book: " + " ");
String b1_title = sc.nextLine();
if (b1_title.equals(Title))
System.out.println("Book Found!");
else
System.out.println("Book not found!");
}
}