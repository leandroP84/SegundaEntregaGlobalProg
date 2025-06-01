package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor


public abstract class Base {
    private long id;
    private boolean isDelete;
}
