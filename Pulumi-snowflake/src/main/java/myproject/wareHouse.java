package myproject;

import com.pulumi.snowflake.Warehouse;
import com.pulumi.snowflake.WarehouseArgs;

public class wareHouse {
  public static void  NewWareHouse(){
      var warehouse = new Warehouse("Testwarehouse", WarehouseArgs.builder()
              .comment("this is test ware house")
              .warehouseSize("small")
              .build());


  }
}
