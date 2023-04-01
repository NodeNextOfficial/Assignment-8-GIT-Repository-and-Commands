package assignment.git.repository.and.commands;
import java.io.File;

public class App {
    public static void main(String[] args) {
        String[] folders = {"Desktop", "Downloads", "Documents"};
        String needle = "Needle.txt";
        String path = System.getProperty("user.home");
        File[] files = new File(path).listFiles();
        boolean needleFound = false;
        for (String folder : folders) {
            for (File file : files) {
                if (file.isDirectory() && file.getName().equals(folder)) {
                    File[] folderFiles = file.listFiles();
                    for (File f : folderFiles) {
                        if (f.isFile() && f.getName().equals(needle)) {
                            System.out.println("Found the needle in " + folder + " folder!");
                            needleFound = true;
                        }
                    }
                }
            }
        }
        if (!needleFound) {
            System.out.println("Needle not found!");
        } else {
            System.out.println("Done searching!");
        }
    }
}