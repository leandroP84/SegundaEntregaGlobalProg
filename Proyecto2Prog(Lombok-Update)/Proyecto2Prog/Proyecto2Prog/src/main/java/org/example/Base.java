package org.example;

import lombok.*;

@Getter
@Setter
@ToString
@Builder

public abstract class Base {
    private long id;
    private boolean isDelete;
}
