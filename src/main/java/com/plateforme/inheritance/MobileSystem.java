package com.plateforme.inheritance;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class MobileSystem extends System {
private String fileSys;
private String plateforme;

}
