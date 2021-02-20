package com.peyman.gestione_allievi.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoursDtoV2 {

    private UUID id;
    private String name;
}
