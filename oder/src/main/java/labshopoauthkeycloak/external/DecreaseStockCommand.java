package labshopoauthkeycloak.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DecreaseStockCommand {

    private Integer qty;
}
