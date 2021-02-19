package com.peyman.gestione_allievi.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoursDtoV2 {
    private UUID id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String name;
}
