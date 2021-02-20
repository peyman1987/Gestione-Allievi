package com.peyman.gestione_allievi.web.model;

import com.peyman.gestione_allievi.web.model.v2.LevelEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllievoDto {

    @Null
    private UUID id;

    @Null
    private Integer version;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifatedDate;

    @NotBlank
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @Positive
    @NotNull
    private int age;

    private LevelEnum level;

//    private UUID id;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private int age;
}
