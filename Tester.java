import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Tester {
    public static void main (String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);                
        System.out.print("regex: ");
        String line = input.nextLine();

        Pattern p = Pattern.compile(line);
        System.out.print("> ");
        Matcher m = p.matcher(input.nextLine());

        while (true) {
            if (m.matches()) {
                System.out.println(m.group());
                String captureGroups = "";
                for (int i = 1; i <= m.groupCount(); i++) {
                    captureGroups += "\n "+ i + ": " + m.group(i);
                }

                if (captureGroups != "") {
                    System.out.println("Capture Groups: " + captureGroups); 
                }
            }
            else {
                System.out.println("no match.");
            }

            System.out.print("> ");
            line = input.nextLine();
            m = p.matcher(line);
        }
    }
}
