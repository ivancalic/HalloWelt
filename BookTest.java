/* ************************************************************************* *\
*                Programmierung 1 HS 2017 - Serie 2-2       

							Marc Bachofner 			15-135-916
							Ivan Calic     			16-103-137

\* ************************************************************************* */

public class BookTest
{
	public static void main (String[] args)

	{
		// defining our Book objekt
		Book LOTR3 = new Book (999, "The Lord of the rings, Return of the King", "J. R. R. Tolkien", "20.10.1995");
		// testing our methods age(), toString(), input(),
		System.out.println("Days since publication: " + LOTR3.age() + " days ");

		System.out.println("About the book: " + LOTR3.toString() );

		LOTR3.input();

		System.out.println("Days since publication: " + LOTR3.age() + " days");

		System.out.println("About the book: " + LOTR3.toString() );

	}
}