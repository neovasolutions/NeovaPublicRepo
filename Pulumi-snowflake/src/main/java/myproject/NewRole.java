package myproject;

import com.pulumi.snowflake.Role;
import com.pulumi.snowflake.RoleArgs;

public class NewRole {

    public static void CrateNewRole(){
        var role = new Role("testRole", RoleArgs.builder()
                .comment("A role.")
                .build());
    }
}
