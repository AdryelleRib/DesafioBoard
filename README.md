# DIO - JAVA

## DESAFIO - BOARD DE TAREFAS


Repositório criado durante lab "Criando seu Board de Tarefas com Java".
    
### DIAGRAMA DE CLASSE 

```mermaid
classDiagram
    class Bord {
        + id: Long
        + name: String
    }

    class BoardColumn {
        + id: Long
        + name: String
        + kind: String
        + order: Int
    }

    class Card {
        + id: Long
        + title: String
        + description: String
        + createdAt: OffsetDateTime
    }

    class Block {
        + id: Long
        + blockCause: String
        + blockIn: OffsetDateTime
        + unblockCause: String
        + unblockIn: OffsetDateTime
    }

    Bord "1" -- "1-*" BoardColumn
    BoardColumn "1" -- "1-*" Card
    Card "1" -- "1-*" Block
```      
## Referência

 - [Board de Tarefas](https://github.com/digitalinnovationone/board)
  
