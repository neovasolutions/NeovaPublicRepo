package myproject;

import com.pulumi.snowflake.Stage;
import com.pulumi.snowflake.StageArgs;

public class StageNew {
    public static void NewStage() {
        var exampleStage = new Stage("exampleStage", StageArgs.builder()
                .name("my_local_stage") // Name of the stage
                .database("my_database") // Database where the stage will be created
                .schema("my_schema") // Schema where the stage will be created
                .build());
    }
}
