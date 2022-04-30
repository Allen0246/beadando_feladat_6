package cegjegyzek.serializer;

import java.io.*;

public class Serializer<T> {

    private String path;
    private T serializableObject;

    public Serializer(String path, T serializableObject) {
        this.path = path;
        this.serializableObject = serializableObject;
    }

    public Serializer(String path) {
        this.path = path;
    }

    public Boolean serialize() {
        try{
            FileOutputStream fileOut=
                    new FileOutputStream(this.path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.serializableObject);
            out.close();
            fileOut.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public T deserialize(){
        try{
            FileInputStream fileIn= new FileInputStream(this.path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.serializableObject = (T) in.readObject();
            in.close();
            fileIn.close();
            return this.serializableObject;

        } catch (Exception i){
            i.printStackTrace();
            return null;
        }
    }

}
