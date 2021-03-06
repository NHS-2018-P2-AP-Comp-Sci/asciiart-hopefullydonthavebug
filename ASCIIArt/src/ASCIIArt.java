/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)


public class ASCIIArt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    horizontal();
    vertical();
    eye();
    vertical();
    nose();
    mouth();
    vertical();
    vertical();
    horizontal();
    tie();
    vertical();
    horizontal();
    leg();
    shoe();
    System.out.println("\n");
    System.out.println("This a \"spongebob\", or rectangle boy if it really doesn't look like a spongebob. ");
	}
	public static void horizontal() {
		System.out.println("          +覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧�+");
	}
	public static void vertical() {
		System.out.println("          |                                     |");
	}
	public static void eye() {
		System.out.println("          |         \\|/             \\|/         | ");
		System.out.println("          |         ---             ---         |");
		System.out.println("          |        ( . )           ( . )        |");
		System.out.println("          |         ---             ---         |");
	}
	public static void nose() {
		System.out.println("     +覧覧|     -           ______       -      |覧覧+");
		System.out.println("覧覧慾    |    (           ()           (       |    |覧覧");   
		System.out.println("     +覧覧|     -           覧覧覧       -      |覧覧+");
	}
	public static void mouth() {
		System.out.println("          |            /覧覧覧覧覧覧\\           |");
		System.out.println("          |              |  |  |  |             |");
		System.out.println("          |               覧    覧              |");
	}
	public static void tie() {
		System.out.println("          |                  \\/                 |");
		System.out.println("          |                  /\\                 |");
		System.out.println("          |                  \\/                 |");
	}
	public static void leg() {
		System.out.println("                    | |           | |           ");
		System.out.println("                    | |           | |           ");
		System.out.println("                    | |           | |           ");
	}
	public static void shoe() {
		System.out.println("              +覧覧 | |      +覧覧| |           ");
		System.out.println("              |       |      |      |           ");
		System.out.println("              覧覧覧覧       覧覧覧�           ");
	}
}