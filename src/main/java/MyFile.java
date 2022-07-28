import java.io.File;
import java.io.IOException;

public class MyFile {
    public void createMyFile(String filename){
        File file = new File(filename);
        try{
            if(file.exists()){
                System.out.println("This file cant be created because it already exists");
            }else{
                if(file.createNewFile()){
                    System.out.println("File created successfully");
                }else{
                    System.out.println("Error in file creation");
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
