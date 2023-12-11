package myproject;

import com.pulumi.snowflake.User;
import com.pulumi.snowflake.UserArgs;

public class NewUser {

    public static void CreateNewUser(){
        var user = new User("pulumiuser", UserArgs.builder()
                .comment("A user of pulumi snowflake.")
                .defaultRole("role1")
                .defaultSecondaryRoles("ALL")
                .defaultWarehouse("warehouse")
                .disabled(false)
                .displayName("pulumi User")
                .email("user@snowflake.example")
                .firstName("pulumi")
                .lastName("User")
                .loginName("pulumi_user1")
                .mustChangePassword(false)
                .password("Passwovhhrd@123")
                .build());
    }
}
