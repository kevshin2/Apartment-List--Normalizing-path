Apartment-List--Normalizing-path
================================
This repository contains 3 files to be used to normalize path.
1. Main.java, this is the main file contains all the method that is needed to run the program.
2. input.txt, this is a sample input file, one could insert all the path that is needed to be normalized
  in to this file. With each path on a different line.
3. output.txt, this is a source output file. After executing the input file using the Main.java method, this output
  file will contain all the normalized path from the input file.

How to run the file.
The Main.java file has to be executed using java.
1. Compile the Main.java file by type in the following command in terminal.
  javac Main.java
2. To run the program, an input file and a output file is required. Provided in the repository are 2 sample files,
  1 input file and a output file. User could replace them with their own files.
3. Running the file, type in the following command in terminal.
  java Main INPUFILENAME OUTPUTFILENAME
For example, using the sample input file and outputfile inside the directory:
  java Main input.txt output.txt

After entering all the command above, all the path that has to be normalized inside the input file will be printed
into the outputfile.

The program is written in a way to handle errors, missing input file will result in error, extra input file will 
also be causing error.
