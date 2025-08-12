package DIO.DTO;

import DIO.PERSISTENCE.ENTITY.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {

}
