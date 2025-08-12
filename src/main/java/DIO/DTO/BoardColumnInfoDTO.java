package DIO.DTO;

import DIO.PERSISTENCE.ENTITY.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id,
                                 int order,
                                 BoardColumnKindEnum kind) {
}
