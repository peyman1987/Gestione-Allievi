package com.peyman.gestione_allievi.domain;

import com.peyman.gestione_allievi.web.model.v2.LevelEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Allievo {

    private UUID id;
    private Integer version;
    private Timestamp createdDate;
    private Timestamp lastModifatedDate;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private LevelEnum level;
}
