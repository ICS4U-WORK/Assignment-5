package readAndWriteFiles;

import java.io.*;

public class ReadAndWrite {
	boolean keepOpen;
	boolean fileOpen;
	/** name of file to write and read **/
	String fileName = "test";
	File file;
	
	public ReadAndWrite(String fileName) {
		keepOpen = false;
		this.fileName = fileName;
		File file = new File("C:/Junk/"+fileName);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Cannot Create file.");
				e.printStackTrace();
			}
		}
	}
	public ReadAndWrite(String fileName, boolean object) {
		keepOpen = false;
		this.fileName = fileName;
		File file = new File("C:/Junk/"+fileName);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Cannot Create file.");
				e.printStackTrace();
			}
		}
	}

	public boolean write(String s) {
		try {  
			DataOutputStream out = new DataOutputStream(new FileOutputStream("C:/Junk/"+fileName));
			out.writeUTF(s);
			if(!keepOpen) {out.close();}

		} catch (FileNotFoundException e) { 

			System.out.println("Error: Cannot open file for writing."); 

		} catch (EOFException e) { 

			System.out.println("Error: EOF encountered, file may be corrupted."); 

		} catch (IOException e) { 

			System.out.println("Error: Cannot write to file."); 

		}
		return true;
	}
	public boolean write(Object o) {
		try {  
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/Junk/"+fileName));
			out.writeObject(o.toString());
			if(!keepOpen) {out.close();}

		} catch (FileNotFoundException e) { 

			System.out.println("Error: Cannot open file for writing."); 

		} catch (EOFException e) { 

			System.out.println("Error: EOF encountered, file may be corrupted."); 

		} catch (IOException e) { 

			System.out.println("Error: Cannot write to file."); 

		}
		return true;
	}

	public String Read() {
		String s = "Read Failed.";
		try { 

            DataInputStream in = new DataInputStream(new FileInputStream("C:/Junk/"+fileName));

            s = in.readUTF();

            System.out.println(s); 
            
            in.close();
        } catch (FileNotFoundException e) { 

            System.out.println("Error: Cannot open file for reading."); 

        } catch (EOFException e) { 

            System.out.println("Error: EOF encountered, file may be corrupted."); 

        } catch (IOException e) { 

            System.out.println("Error: Cannot read from file."); 
            e.printStackTrace();
        }
		return s;
	}
	public Object ReadObject() throws ClassNotFoundException {
		Object o = null;
		try { 

           ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Junk/"+fileName));

            o = in.readObject();

            System.out.println(o); 
            
            in.close();
        } catch (FileNotFoundException e) { 

            System.out.println("Error: Cannot open file for reading."); 

        } catch (EOFException e) { 

            System.out.println("Error: EOF encountered, file may be corrupted."); 

        } catch (IOException e) { 

            System.out.println("Error: Cannot read from file."); 

        }
		return o;
	}
	public boolean isKeepOpen() {
		return keepOpen;
	}

	public void setKeepOpen(boolean keepOpen) {
		this.keepOpen = keepOpen;
	}

	public boolean isFileOpen() {
		return fileOpen;
	}

	public void setFileOpen(boolean fileOpen) {
		this.fileOpen = fileOpen;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
