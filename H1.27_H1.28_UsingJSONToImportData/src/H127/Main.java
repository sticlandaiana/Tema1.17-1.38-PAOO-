package H127;

import com.google.gson.Gson;

public class Main {

    static public void main(String[] args){

        A1 a1 = new A1(100, "Ana", "Papanasi");

        //converting A1 object to JSON
        Gson gson = new Gson();
        String a1json = gson.toJson(a1);
        System.out.println("a1 in JSON format: " + a1json);

        //converting the JSON String into a A2 object :)
        A2 a2 = gson.fromJson(a1json, A2.class);
        System.out.println("\nan A2 object created from a JSON String: "+a2);

    }
}
