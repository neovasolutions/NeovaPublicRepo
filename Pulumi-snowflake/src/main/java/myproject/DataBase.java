package myproject;

import com.pulumi.snowflake.Database;
import com.pulumi.snowflake.DatabaseArgs;

public class DataBase {

    public static void CreateNewDataBase(){
        var simple = new Database("testDataBase", DatabaseArgs.builder()
                .comment("test comment")
                .dataRetentionTimeInDays(3)
                .build());
    }
}
