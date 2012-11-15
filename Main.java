import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFileName, outputFileName;
        	inputFileName = outputFileName = null;
		if (args.length > 2) {
            		System.err.println("Error: Invalid input, 1 input"
               		+ " file and 1 output file.");
            		System.exit(1);
        	} else if (args.length == 0) {
            		usage();
        	} else if (args.length == 2) {
        		inputFileName = args[0];
           		 outputFileName = args[1];
        	} else {
        		System.err.println("Error: Missing input or output file.");
            		System.exit(1);
        	}
		if (inputFileName != null) {
            		try {
                		System.setIn(new FileInputStream(inputFileName));
            		} catch (FileNotFoundException e) {
                		System.err.printf("Error: could not open %s%n", inputFileName);
               			System.exit(1);
            		}
        	}
		if (outputFileName != null) {
            		try {
                		System.setOut(new PrintStream(outputFileName));
            		} catch (FileNotFoundException e) {
                		System.err.printf("Error: could not open %s%n",
                                  	outputFileName);
                		System.exit(1);
            		}
       		}
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String next = scan.nextLine();
			String[] newline = next.split("/");
			ArrayList<String> newstring = new ArrayList<String>();
			for (int i = 0; i < newline.length; i++) {
				if (!newline[i].equals(".") && !newline[i].equals("..")) {
					newstring.add(newline[i]);
				}
				if (newline[i].equals("..")) {
					if (newstring.size() != 0) {
						newstring.remove(newstring.size() - 1);
					}
				}
			}
			String slash = "";
			for (String string:newstring) {
				slash += string + "/";
			}
			slash = slash.substring(0, slash.length() - 1);
			System.out.println(slash);
		}
        	System.out.close();
	}
	
	/** Print brief description of the command-line format. */
    	static void usage() {
    		String[] usage = new String[] {"Usage:", "1. Compile the program using javac Main.java",
    			"2. Run the program using java Main INPUTFILENAME OUTPUTFILENAME"};
        	for (String i:usage) {
        		System.out.println(i);
        	}
        	System.exit(1);
	}
}
