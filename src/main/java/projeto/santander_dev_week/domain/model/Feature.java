package projeto.santander_dev_week.domain.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tb_feature")
public class Feature extends BaseItem {
}
