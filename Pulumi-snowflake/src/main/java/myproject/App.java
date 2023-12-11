package myproject;

import com.pulumi.Context;
import com.pulumi.Pulumi;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    private static void stack(Context ctx) {
       NewUser.CreateNewUser();
       NewRole.CrateNewRole();
       DataBase.CreateNewDataBase();
       wareHouse.NewWareHouse();
       StageNew.NewStage();

  }

}

