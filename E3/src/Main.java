import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            //1.
            String frase = "Las clases de fitxers en java són un jaleo";
            PrintWriter printWriter = new PrintWriter("print.txt");
            printWriter.println(frase);

            //2.
            PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter("print2.txt")));
            printWriter2.println(frase);

            //3
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("print3.txt"));
            outputStreamWriter.write(frase);

            //4
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("print4.txt")));
            bufferedWriter.write(frase);

            //5
            BufferedWriter bufferedWriter3 = new BufferedWriter(new FileWriter("print5.txt"));
            bufferedWriter3.write(frase);

            //6
            PrintStream printStream = new PrintStream("print6.txt");
            printStream.println(frase);

            printStream.close();
            bufferedWriter3.close();
            bufferedWriter.close();
            printWriter.close();
            printWriter2.close();
            outputStreamWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}