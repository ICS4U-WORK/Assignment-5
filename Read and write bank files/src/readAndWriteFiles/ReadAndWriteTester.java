/**
 * 
 */
package readAndWriteFiles;

import java.io.*;

/**
 * @author macdja38
 *
 */
public class ReadAndWriteTester {

	/**
	 * 
	 */
	public ReadAndWriteTester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Account1 = new Account();
		ReadAndWrite junk = new ReadAndWrite("junk.dat");
		junk.write("One of the most commonly used objects is strings.  We already know that we can make a literal string with double quotes (“This is nice”).  And we have already used + to concatenate more than one string to a string object: ownerName + \"s Bank Account with $\" + balance;");
		junk.Read();
		try { 

            PrintWriter out = new PrintWriter(new FileWriter("C:/Junk/junk2.dat")); 
            
            out.println("One of the most commonly used objects is strings."); 

            out.println("We already know that we can make a literal string with double quotes (“This is nice”)."); 

            out.println("And we have already used + to concatenate more than one string to a string object:"); 

            out.println("ownerName + \"\'s Bank Account with $\" + balance;");
            
            out.close(); 

        } catch (FileNotFoundException e) { 

            System.out.println("Error: Cannot open file for writing."); 

        } catch (IOException e) { 

            System.out.println("Error: Cannot write to file."); 

        }
		try { 

            BufferedReader in = new BufferedReader(new FileReader("C:/Junk/junk2.dat")); 
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            in.close(); 

        } catch (FileNotFoundException e) { 

            System.out.println("Error: Cannot open file for reading."); 

        } catch (EOFException e) { 

            System.out.println("Error: EOF encountered, file may be corrupted."); 

        } catch (IOException e) { 

            System.out.println("Error: Cannot read from file."); 

        }
		ReadAndWrite bank = new ReadAndWrite("bank.dat");
		bank.write(Account1);
		try {
			bank.ReadObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
