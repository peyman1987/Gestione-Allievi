package com.peyman.gestione_allievi.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllievoDto {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
