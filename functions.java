import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class functions
{
  public functions()
  {

  }
  //begin program
  String startprogram(String s) {
    String thisProgram = "import java.util.*;\n\npublic class " + s + "\n{\n\tpublic static void main(String[] args)\n\t{\n\t\tScanner scanner = new Scanner(System.in);\n";
    return thisProgram;
  }
  String endprogram(String s)
  {
    return "}\n";
  }

  //handle instances of logical comparison
  String logical(String s)
  {
    String result = "";
    if(s.equalsIgnoreCase(".eqv."))
    {
      return " == ";
    }
    else if(s.equalsIgnoreCase(".true."))
    {
      return " true";
    }
    else if(s.equalsIgnoreCase(".false."))
    {
      return " false";
    }
    else if(s.equalsIgnoreCase(".not."))
    {
      return "!";
    }
    else if(s.equalsIgnoreCase(".and."))
    {
      return " && ";
    }
    else if(s.equalsIgnoreCase(".or."))
    {
      return " || ";
    }
    else if(s.equalsIgnoreCase(".nequv."))
    {
      return " != ";
    }

    return "uncaught error";
  }
  //handle if/else logic
  String ifelse(String[] s) {
    StringBuilder builder = new StringBuilder();
    boolean start = false;

    for (int i = 0; i < s.length; i++) {

      if (s[i].equalsIgnoreCase("if")) {
        builder.append("\n" + s[i] + " ");
        start = true;
      } else if (start && !s[i].equalsIgnoreCase("then")) {
        builder.append(s[i] + " ");
      } else if (start) {
        builder.append("\n{");
      }
      if(s[i].equalsIgnoreCase("else"))
      {
        builder.append("}\nelse\n{");
      }
    }
    return builder.toString();



    //return "uncaught error";

  }
  //comparison operators, b = before, s = current, n = next
  //b s n  for comparison
  String comparison(String s, String b, String n, ArrayList charVariables, LinkedList<String> java, ArrayList<String> integerArrays, ArrayList<String> realArrays, ArrayList<String> logicalArrays)
  {

    if(s.equalsIgnoreCase("<"))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {


        java.add(s);
        if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
          java.add(n + ".getValue()");
        }
        else
        {
          java.add(n);
        }
      }
      else
      {

        if(integerArrays.contains(b) || realArrays.contains(b) || logicalArrays.contains(b)) {
          java.add(b + ".getValue()");
        }
        else
        {
          java.add(n);
        }
        java.add(s);
        if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
          java.add(n + ".getValue()");
        }
        else
        {
          java.add(n);
        }
      }
    }
    else if(s.equalsIgnoreCase("<="))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {

        java.add(s);
        if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
          java.add(n + ".getValue()");
        }
        else
        {
          java.add(n);
        }

      }
      else
      {

        if(integerArrays.contains(b) || realArrays.contains(b) || logicalArrays.contains(b)) {
          java.add(b + ".getValue()");
        }
        else
        {
          java.add(b);
        }
        java.add(s);
        if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
          java.add(n + ".getValue()");
        }
        else
        {
          java.add(n);
        }
      }
    }
    else if(s.equalsIgnoreCase(">"))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {

        java.add(s);
        if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
          java.add(n + ".getValue()");
        }
        else
        {
          java.add(n);
        }

      }
      else
      {

        if(integerArrays.contains(b) || realArrays.contains(b) || logicalArrays.contains(b)) {
          java.add(b + ".getValue()");
        }
        else
        {
          java.add(b);
        }
        java.add(s);
        if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
          java.add(n + ".getValue()");
        }
        else
        {
          if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
            java.add(n + ".getValue()");
          }
          else
          {
            java.add(n);
          }
        }
      }
    }
    else if(s.equalsIgnoreCase(">="))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {

        java.add(s);
        if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
          java.add(n + ".getValue()");
        }
        else
        {
          java.add(n);
        }

      }
      else
      {

        if(integerArrays.contains(b) || realArrays.contains(b) || logicalArrays.contains(b)) {
          java.add(b + ".getValue()");
        }
        else
        {
          java.add(b);
        }
        java.add(s);
        if(integerArrays.contains(n) || realArrays.contains(n) || logicalArrays.contains(n)) {
          java.add(n + ".getValue()");
        }
        else
        {
          java.add(n);
        }
      }
    }
    else if(s.equalsIgnoreCase("=="))
    {

      if(java.getLast().equalsIgnoreCase(b))
      {
        if(charVariables.contains(n))
        {
          java.add(".equals(" + n + ");");
        }
        else {
          java.add(" == " + n);
        }
      }
      else {
        if (charVariables.contains(n)) {
          java.add(b + ".equals(" + n + ");");
        } else {
          java.add(b + " == " + n);
        }
      }
    }
    else if(s.equalsIgnoreCase("/="))
    {
      if(charVariables.contains(n))
      {
        java.add("!" + b + ".equals(" + n + ") ");
      }
      else {
        java.add(b + " != " + n);
      }
    }


    return "uncaught error";
  }

  //comparison operators, b = before, s = current, n = next
  //b s n  for comparison
  //checking to ensure that the previous item is not already in the list

  String arithmetic(String s, String b, String n, LinkedList<String> java)
  {

    if(s.equalsIgnoreCase("+"))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {

        java.add(s);
        java.add(n);

      }
      else
      {

        java.add(b);
        java.add(s);
        java.add(n);
      }
    }
    if(s.equalsIgnoreCase("-"))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {

        java.add(s);
        java.add(n);

      }
      else
      {

        java.add(b);
        java.add(s);
        java.add(n);
      }
    }
    if(s.equalsIgnoreCase("*"))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {

        java.add(s);
        java.add(n);

      }
      else
      {

        java.add(b);
        java.add(s);
        java.add(n);
      }
    }
    if(s.equalsIgnoreCase("/"))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {

        java.add(s);
        java.add(n);

      }
      else
      {

        java.add(b);
        java.add(s);
        java.add(n);
      }
    }
    if(s.equalsIgnoreCase("="))
    {
      if(java.getLast().equalsIgnoreCase(b))
      {

        java.add(s);
        //java.add(n);

      }
      else
      {

        java.add(b);
        java.add(s);
        //java.add(n);
      }
    }

    if(s.equalsIgnoreCase("**"))
    {
      java.add("Math.pow(" + b + ", " + n +");");
    }

    return "Uncaught error";
  }

  void identifyGlobalVariables(ArrayList<String> globalVariables, LinkedList<String> Fortran, ArrayList<String> functionNames)
  {

    int index1 = 0;

    int index2 = 0;

    boolean globalsPresent = false;

    boolean inParenth = false;

    String global = "";

    for(int i = 0; i < Fortran.size(); i++)
    {

      //testing
      /*if(i == 87){
        boolean es = true;
      }*/

      String[] line = Fortran.get(i).split(" ");


      for(int j = 0; j < line.length; j++)
      {

        if(j > 0 && line[j].equalsIgnoreCase("function") && !line[j - 1].equalsIgnoreCase("end") && !line[j].contains("INTENT")){
          functionNames.add(line[j + 1].substring(0, line[j + 1].indexOf('(')));
        }

        if(line[0].equalsIgnoreCase("subroutine")){
          functionNames.add(line[1].substring(0, line[1].indexOf('(')));
        }

        if(!line[j].equalsIgnoreCase(""))
        {
          //want the form "subroutine(....)" not "end subroutine"
          if((line[j].equalsIgnoreCase("subroutine") && (j == 0 || !line[j - 1].equalsIgnoreCase("end"))) /*|| line[0].equalsIgnoreCase("subroutine")*/)
          {
            globalsPresent = true;
            j++;
          }
          //if we are inside the parentheses
          if(globalsPresent) {
            //walk along the characters in the string
            for (int k = 0; k < line.length; k++) {
              //if open paren
              if (j < line.length && line[j].length() > k && line[j].charAt(k) == '(') {

                inParenth = true;
                index1 = k + 1;
                //if open paren followed by comma (muliple variables
                if (line[j].length() >= k && line[j].charAt(line[j].length() - 1) == ',') {
                  globalVariables.add(line[j].substring(index1, line[j].length() - 1));
                }
                //if open paren followed by close paren (single variable)
                if (line[j].length() > k && line[j].charAt(line[j].length() - 1) == ')' && line[j].length() > 1) {

                  globalVariables.add(line[j].substring(index1, line[j].length() - 1));
                  globalsPresent = false;

                }

              }
              //if close paren (end of variables)
              else if (j < line.length && line[j].length() > k && line[j].charAt(line[j].length() - 1) == ')') {

                if (line[j].length() > 1) {

                  globalVariables.add(line[j].substring(line[j].indexOf('(') + 1, line[j].length() - 1));

                }

                globalsPresent = false;
                break;

              }
              //if not open or close (more than two variables)
              else {

                if (j < line.length && line[j].length() > k && line[j].charAt(line[j].length() - 1) == ',') {

                  inParenth = true;

                  do {

                    index2 = k;

                    for (int l = 0; l < line[j].length(); l++) {

                      if (line[j].charAt(l) == '(') {
                        index2 = l;
                        k = l;
                      }

                    }
                    if(line[j].charAt(index2) == '(') {
                      globalVariables.add(line[j].substring(index2 + 1, line[j].length() - 1));
                    }
                    else{
                      globalVariables.add(line[j].substring(index2, line[j].length() - 1));
                    }
                    if(line[j].charAt(line[j].length() - 1) != ')'){
                      j++;
                      k = 0;
                    }
                    else{
                      inParenth = false;
                    }

                  }while(inParenth);
                  globalsPresent = false;
                  break;

                } else if (j < line.length && line[j].length() >= k && line[j].charAt(0) == ',') {

                  globalVariables.add(line[j].substring(1, line[j].length()));
                  globalsPresent = false;

                } else if(j < line.length){

                  globalVariables.add(line[j]);
                  globalsPresent = false;

                }

              }


            }

          }

        }

      }


    }

  }

  String assignmentStatement(String[] s, int index)
  {

    for(int i = 0; i < s.length; i++)
    {
      if(s[i].equalsIgnoreCase("::"))
      {
        return "";
      }

    }

    StringBuilder builder = new StringBuilder();

    builder.append(s[index - 1]);
    builder.append(s[index]);

    return builder.toString();
  }

  String functionReturn(String[] s, int index)
  {
    boolean isDeclaration = false;

    for (int i = 0; i < s.length; i++){
      if(s[i].equalsIgnoreCase("::")){
        isDeclaration = true;
      }
    }
    if(!isDeclaration) {
      StringBuilder builder = new StringBuilder();

      for (int i = index; i < s.length; i++) {
        builder.append(s[i] + " ");
      }

      builder.append(";");

      return builder.toString();
    }
    else{
      return "";
    }
  }
  public static boolean isNumeric(String str)
  {
    return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
  }

  String comments(String[] s, int index)
  {
    StringBuilder builder = new StringBuilder();

    String temp;
    for(int i = index; i < s.length; i++){
      temp = s[i].replaceAll("!", "//");
      builder.append(" " + temp);
    }
    builder.append("\n\n");
    return builder.toString();
  }

  String arrayProc(String[] s, int index, ArrayList<String> integerArrays, ArrayList<String> realArrays, ArrayList<String> functionNames){
    StringBuilder builder = new StringBuilder();
    String temp = "";
    //two arrays or an array in scalar
    if(s.length > index + 4 && s[index + 1].equalsIgnoreCase("=") && ((realArrays.contains(s[index + 4]) || realArrays.contains(s[index + 4]) || integerArrays.contains(s[index + 4]) || integerArrays.contains(s[index + 4])) || realArrays.contains(s[index + 2]) || realArrays.contains(s[index + 2]) || integerArrays.contains(s[index + 2]) || integerArrays.contains(s[index + 2]))){
      if((integerArrays.contains(s[index + 2]) || realArrays.contains(s[index + 2])) && (integerArrays.contains(s[index + 4]) || realArrays.contains(s[index + 4]))){
        builder.append("for(int i = 0; i < " + s[index] + ".length; i++)\n{\n\t" + s[index] + "[i] = " + s[index + 2]+ "[i]" + s[index + 3] + s[index + 4] + "[i];\n}");

      }

      else if(integerArrays.contains(s[index + 2]) || realArrays.contains(s[index + 2])){
        builder.append("for(int i = 0; i < " + s[index] + ".length; i++)\n{\n\t" + s[index] + "[i] = " + s[index + 2]+ "[i]" + s[index + 3] + s[index + 4] + ";\n}");

      }

      else if(integerArrays.contains(s[index + 4]) || realArrays.contains(s[index + 4])){
        builder.append("for(int i = 0; i < " + s[index] + ".length; i++)\n{\n\t" + s[index] + "[i] = " + s[index + 2] + s[index + 3] + s[index + 4] + "[i];\n}");

      }



    }
    else if(s.length > index + 1 && s[index + 1].equalsIgnoreCase("="))
    {
      //test comment out
      //builder.append(s[index - 2]);
      //builder.append(s[index - 1]);
      //end test comment out
      temp = s[index].replace("(", "[");
      temp = temp.replace(")", "-1]");
      builder.append(temp);

      for(int c = index + 1; c < s.length; c++){
        builder.append(s[c]);
      }
      builder.append(";");
    }
    //if array element being assigned
    else if(s[index - 1].equalsIgnoreCase("="))
    {
      if(s[index].indexOf('(') > 0)
        if(!functionNames.contains(s[index].substring(0, s[index].indexOf('(')))) {
          temp = s[index].replace("(", "[");
          temp = temp.replace(")", "-1]");
          builder.append(temp);
          builder.append(";");
        }
    }
    //shift
    else{
      if(s[index].indexOf('(') > 0)
      if(!functionNames.contains(s[index].substring(0, s[index].indexOf('(')))) {
        temp = s[index].replace("(", "[");
        temp = temp.replace(")", "-1]");
        builder.append(temp);
      }
    }
    return builder.toString();
  }
}    