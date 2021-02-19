package com.peyman.gestione_allievi.web.model.v2;


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
public class AllievoDtoV2 {

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
}
