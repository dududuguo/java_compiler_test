package soot_test;

import soot.*;
import soot.jimple.JimpleBody;
import soot.options.Options;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class soot_test {

    public static void main(String[] args) {
        String yourClassPath = "C:\\Users\\11388\\IdeaProjects\\demo\\target\\classes";
        String sootClassPath = yourClassPath + ";" + Scene.v().getSootClassPath();
        Scene.v().setSootClassPath(sootClassPath);
        String className = "sourceFile/q1.c";

        // Set Soot's internal classpath
        Options.v().set_soot_classpath(yourClassPath);
        Options.v().set_output_format(Options.output_format_jimple);


        // Enable whole program analysis
        //Options.v().set_whole_program(true);

        // Load and analyze the class
        SootClass sootClass = Scene.v().loadClassAndSupport(className);
        sootClass.setApplicationClass();
        Scene.v().loadNecessaryClasses();

        // Run the transformations we want
        PackManager.v().runPacks();

        // Prepare the file writer
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("jimple_output.txt"))) {
            // Iterate over the methods in the class
            for (SootMethod m : sootClass.getMethods()) {
                if (m.hasActiveBody()) {
                    JimpleBody body = (JimpleBody) m.getActiveBody();

                    // Write the method's body to the file
                    writer.write("Method: " + m.getName() + "\n");
                    for (Unit u : body.getUnits()) {
                        writer.write(u.toString() + "\n");
                    }
                    writer.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
